package Services.Interface;

import Model.Customer;

public interface IOrderService {

    String placeOrder(Customer model);
    
    String cancelOrder(Customer model);

    Object[] getAllOrders();
}
