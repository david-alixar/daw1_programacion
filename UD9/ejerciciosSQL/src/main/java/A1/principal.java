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

        ResultSet rs = statement.executeQuery("SELECT * FROM payments where amount >= 30000");

        while (rs.next()) {
        System.out.println("name = " + rs.getString("tittle"));
        System.out.println("id = " + rs.getString("id"));
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
