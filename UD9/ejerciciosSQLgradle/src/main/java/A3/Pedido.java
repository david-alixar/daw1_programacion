package A3;

import java.util.Date;

public class Pedido {

    //Atributos
    private int orderNumber;
    private String orderDate;
    private String requiredDate;
    private String shippedDate;
    private String status;
    private String comments;
    private int customerNumber;

    public Pedido(int orderNumber, String orderDate, String requiredDate, String shippedDate, String status, String comments, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
        this.customerNumber = customerNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComments() {
        return comments;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "orderNumber=" + orderNumber +
                ", orderDate='" + orderDate + '\'' +
                ", requiredDate='" + requiredDate + '\'' +
                ", shippedDate='" + shippedDate + '\'' +
                ", status='" + status + '\'' +
                ", comments='" + comments + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }
}
