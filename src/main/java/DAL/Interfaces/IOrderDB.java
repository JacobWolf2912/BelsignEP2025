package DAL.Interfaces;

import BE.Order;

import java.util.List;

public interface IOrderDB extends IDBConnector {
    Order createOrder(Order order);
    Order getOrderById(int orderId);
    List<Order> getAllOrders();
    void updateOrder(Order order);
    void deleteOrder(int orderId);
}
