package A1;

import java.sql.*;

public class principal {
  public static void main(String[] args) {
    Connection connection = null;

    try {
        //Crear conexión
        connection = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30); //Tiempo máximo de respuesta

        ResultSet rs = statement.executeQuery("SELECT * FROM customers WHERE state is null;");

      System.out.println("Clientes con el campo 'state' vacío:");
      System.out.println();

        while (rs.next()) {
            System.out.println("codigo_cliente = " + rs.getString("customerNumber"));
            System.out.println("nombre_cliente = " + rs.getString("customerName"));
            System.out.println("apellido_contacto = " + rs.getString("contactLastName"));
            System.out.println("nombre_contacto = " + rs.getString("contactFirstName"));
            System.out.println("telefono = " + rs.getString("phone"));
            System.out.println("direccion1 = " + rs.getString("addressLine1"));
            System.out.println("direccion2 = " + rs.getString("addressLine2"));
            System.out.println("ciudad = " + rs.getString("city"));
            System.out.println("estado = " + rs.getString("state"));
            System.out.println("cod_postal = " + rs.getString("postalCode"));
            System.out.println("pais = " + rs.getString("country"));
            System.out.println("num_vemta = " + rs.getString("salesRepEmployeeNumber"));
            System.out.println("limite_credito = " + rs.getString("creditLimit"));
            System.out.println();
        }

        ResultSet rs1 = statement.executeQuery("SELECT * FROM payments WHERE amount >= 30000");

      System.out.println("Pagos cuyo 'amount' es igual o superior a 30000");
      System.out.println();

        while (rs1.next()) {
        System.out.println("cliente = " + rs1.getString("customerNumber"));
        System.out.println("numero_pedido= " + rs1.getString("checkNumber"));
        System.out.println("fecha_pedido = " + rs1.getString("paymentDate"));
        System.out.println("importe = " + rs1.getString("amount"));
        System.out.println();
        }

        ResultSet rs2 = statement.executeQuery("SELECT * FROM employees WHERE reportsTo = 1143");

        System.out.println("Empleados cuyo 'reportsTo' es 1143");
        System.out.println();

        while (rs2.next()) {
            System.out.println("numero_empleado = " + rs2.getString("employeeNumber"));
            System.out.println("apellido= " + rs2.getString("lastName"));
            System.out.println("nombre = " + rs2.getString("firstName"));
            System.out.println("extension = " + rs2.getString("extension"));
            System.out.println("email= " + rs2.getString("email"));
            System.out.println("cod_oficina = " + rs2.getString("officeCode"));
            System.out.println("da_cuenta_a = " + rs2.getString("reportsTo"));
            System.out.println("titulo_trabajo = " + rs2.getString("jobTittle"));
            System.out.println();
        }



    }catch (SQLException e) {
      System.out.println(e.getMessage());
    }finally{
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e){
        System.out.println(e.getMessage());
        }
    }
  }
}
