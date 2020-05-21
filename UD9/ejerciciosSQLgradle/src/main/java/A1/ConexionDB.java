package A1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static Connection con = null;

    public static Connection getConnection(){
        try{
            if( con == null ){
                String driver="com.mysql.jdbc.Driver";
                Class.forName(driver);
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3336/classicmodels?user=root&password=123456");
                System.out.println("Conection Succesfull");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        return con;
    }
}
