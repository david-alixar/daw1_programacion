package A1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static Connection con = null;

    public static Connection getConnection(){
        try{
            if( con == null ){
                String driver="com.mysql.cj.jdbc.Driver";
                Class.forName(driver);
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3336/classicmodels?user=root&password=123456");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }

    public static void close(){
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
