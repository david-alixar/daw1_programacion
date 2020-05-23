package A1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ADClassicModels {

    private List<Employee> empleados = new ArrayList<Employee>();
    private List<Office> oficinas = new ArrayList<Office>();

    private Connection connection = null;


    public List<Employee> getEmpleados(){


        try {
            connection = ConexionDB.getConnection();

            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = connection.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                Employee e1 = new Employee(rs.getInt("employeeNumber"),rs.getString("lastName"), rs.getString("firstName"),rs.getString("extension"),rs.getString("email"),rs.getString("officeCode"),rs.getInt("reportsTo"), rs.getString("jobTitle"));
                empleados.add(e1);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return empleados;
    }

    public List<Office> getOffices(){
        //Connection connection = null;

        try {
            connection = ConexionDB.getConnection();

            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = connection.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("SELECT * FROM offices");

            //Recorremos el conjunto de resultados
            while (rs.next()) {
                Office of1 = new Office(rs.getString("officeCode"),rs.getString("city"), rs.getString("phone"),rs.getString("addressLine1"),rs.getString("addressLine2"),rs.getString("state"),rs.getString("country"), rs.getString("postalCode"), rs.getString("territory"));
                oficinas.add(of1);
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return oficinas;
    }
}
