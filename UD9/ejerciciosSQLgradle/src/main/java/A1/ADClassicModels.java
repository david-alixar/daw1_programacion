package A1;

import java.sql.*;
import java.util.List;

public class ADClassicModels {

    private List empleados;
    private List oficinas;

    public List<Employee> getEmpleados(){
        Connection connection = null;

        try {

            connection = ConexionDB.getConnection();

            //Creo el objeto para ejecutar la sentencias SQL
            Statement statement = connection.createStatement();

            //Establezco un tiempo máximo de respuesta
            statement.setQueryTimeout(30);

            //Ejecuta una consulta de sencilla de búsqueda
            //El resultado se almacena en el ResultSet (conjunto de resultados)
            ResultSet rs = statement.executeQuery("select * from employees");

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

        return oficinas;
    }
}
