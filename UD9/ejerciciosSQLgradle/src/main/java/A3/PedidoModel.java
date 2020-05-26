package A3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoModel {
    public static void insertPedido(Pedido pedido) throws SQLException {
        Connection con = ConexionDB.getConnection();

        String sql = "INSERT INTO orders VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia = con.prepareStatement(sql);

        sentencia.setInt(1, pedido.getOrderNumber());
        sentencia.setString(2, pedido.getOrderDate());
        sentencia.setString(3, pedido.getRequiredDate());
        sentencia.setString(4,  pedido.getShippedDate());
        sentencia.setString(5, pedido.getStatus());
        sentencia.setString(6, pedido.getComments());
        sentencia.setInt(7, pedido.getCustomerNumber());

        sentencia.executeUpdate();
    }
}
