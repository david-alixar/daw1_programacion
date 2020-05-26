package A3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class principal {
  public static void main(String[] args) {

      Connection con = ConexionDB.getConnection();

      try {
          con.setAutoCommit(false);

          OfficeModel.insertOffice(
                  new  Office(
                          "8",
                          "Sevilla",
                          "+34 955 36 46 24",
                          "Avenida de la Palmera, 460",
                          "default",
                          "",
                          "Spain",
                          "41013",
                          "EMEA"));

          System.out.println("Oficina insertada con éxito.");

          EmployeeModel.insertEmployee(
                  new Employee(
                          8000,
                          "Ramos",
                          "José Francisco",
                          "x8000",
                          "josefranciscoramos@classicmodelcars.com",
                          "8",
                          1102,
                          "Sales Rep"));

          System.out.println("Empleado insertado con éxito.");

          EmployeeModel.insertEmployee(
                  new Employee(
                          8001,
                          "Martín",
                          "Sonia",
                          "x8001",
                          "soniamartins@classicmodelcars.com",
                          "8",
                          1102,
                          "Sales Rep"));

          System.out.println("Empleado insertado con éxito.");

          CustomerModel.insertCustomer(
                  new Customer(
                          600,
                          "El Corte Inglés",
                          "Sánchez",
                          "Mario",
                          "+34 954 33 41 22",
                          "Avenida Luis de Morales s/n",
                          "default",
                          "Sevilla",
                          "",
                          "41005",
                          "Spain",
                          8000,
                          600.0));

      System.out.println("Cliente insertado con éxito.");

          con.commit();

      } catch (SQLException e) {
      System.out.println("error: " + e.getMessage());
          try {
        if (con != null) {
          System.out.println("Dejamos la BD en estado consistente. Ya se pueden hacer otros commits consistentemente.");
          con.rollback();
              }
          } catch (SQLException ex) {
        System.out.println("Error en el rollback");
              ex.printStackTrace();
          }
      }

      try {
          con.setAutoCommit(false);

          PedidoModel.insertPedido(
                  new  Pedido(
                          10426,
                          "2020/05/26",
                          "2020-06-02",
                          "2020/05/26",
                          "enviado",
                          "Pedido para El Corte Inglés",
                          600));

          System.out.println("Pedido insertado con éxito.");

          DetallePedidoModel.insertDetallePedido(
                  new DetallePedido(
                          10426,
                          "S50_4713",
                          33,
                          34.17,
                          1));

          System.out.println("Producto añadido al pedido con éxito.");

          DetallePedidoModel.insertDetallePedido(
                  new DetallePedido(
                          10426,
                          "S32_1374",
                          21,
                          66.92,
                          2));

          System.out.println("Producto añadido al pedido con éxito.");


          con.commit();

      } catch (SQLException e) {
          System.out.println("error: " + e.getMessage());
          try {
              if (con != null) {
                  System.out.println("Dejamos la BD en estado consistente. Ya se pueden hacer otros commits consistentemente.");
                  con.rollback();
              }
          } catch (SQLException ex) {
              System.out.println("Error en el rollback");
              ex.printStackTrace();
          }
      }

      System.out.println("\nRelación de clientes, con sus respectivos empleados de venta y el nombre de sus oficinas:\n");
      clientesConEmpleados();

      System.out.println("\nRelación de los pedidos con el nombre del cliente, la fecha del pedido, la cantidad, el precio y el nombre del producto:\n");
      detallePedido();

      ConexionDB.close();
  }
  public static void clientesConEmpleados(){
      Connection connection = null;


      try {

          connection = ConexionDB.getConnection();

      String sql1 =
          "SELECT c.customerName, e.firstName, e.lastName, o.city "
          + "FROM customers c INNER JOIN employees e ON c.salesRepEmployeeNumber=e.employeeNumber "
          + "INNER JOIN offices o ON e.officeCode=o.officeCode";
          PreparedStatement statement1 = connection.prepareStatement(sql1);

          ResultSet rs1 = statement1.executeQuery();

          while (rs1.next()) {
              String nombreCliente = rs1.getString("c.customerName");
              String nombreEmpleado = rs1.getString("e.firstName");
              String apellidoEmpleado = rs1.getString("e.lastName");
              String ciudad = rs1.getString("o.city");

              System.out.println("-------------------------");
              System.out.println("Nombre del cliente: " + nombreCliente);
              System.out.println("Nombre del empleado: " + nombreEmpleado);
              System.out.println("Apellidos del empleado: " + apellidoEmpleado);
              System.out.println("Ciudad: " + ciudad);
              System.out.println("-------------------------\n");
          }
          System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement1.toString());


      } catch (SQLException e) {
          System.out.println(e.getMessage());
      }
    }

  public static void detallePedido() {

    Connection connection = null;

    try {

      connection = ConexionDB.getConnection();

      String sql1 =
          "SELECT c.customerName, o.orderDate, o.status, od.quantityOrdered, od.priceEach, p.productName "
              + "FROM customers c INNER JOIN orders o ON c.customerNumber=o.customerNumber "
              + "INNER JOIN orderdetails od ON o.orderNumber=od.orderNumber "
              + "INNER JOIN products p ON od.productCode=p.productCode";
      PreparedStatement statement1 = connection.prepareStatement(sql1);

      ResultSet rs1 = statement1.executeQuery();


      while (rs1.next()) {
        String nombreCliente = rs1.getString("c.customerName");
        String fechaPedido = rs1.getString("o.orderDate");
        String estadoPedido = rs1.getString("o.status");
        String cantidad = rs1.getString("od.quantityOrdered");
        String precio = rs1.getString("od.priceEach");
        String nombreProducto = rs1.getString("p.productName");

        System.out.println("-------------------------");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Fecha pedido: " + fechaPedido);
        System.out.println("Estado pedido: " + estadoPedido);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("-------------------------\n");
      }
      System.out.println("LA CONSULTA CONSTRUIDA ES: " + statement1.toString());

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
        }
}
