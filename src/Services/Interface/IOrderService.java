package Services.Interface;

import Model.Customer;

public interface IOrderService {

    String placeOrder(Customer model);

    Object[] getAllOrders();
}
