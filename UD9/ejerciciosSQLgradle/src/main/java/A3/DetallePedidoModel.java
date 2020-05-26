package A3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetallePedidoModel {
    public static void insertDetallePedido(DetallePedido detallePedido) throws SQLException {
        Connection con = ConexionDB.getConnection();

        String sql = "INSERT INTO orderdetails VALUES (?, ?, ?, ?, ?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, detallePedido.getOrderNumber());
        sentencia.setString(2, detallePedido.getProductCode());
        sentencia.setInt(3, detallePedido.getQuantityOrdered());
        sentencia.setDouble(4, detallePedido.getPriceEach());
        sentencia.setInt(5, detallePedido.getOrderLineNumber());

        sentencia.executeUpdate();
    }
}
