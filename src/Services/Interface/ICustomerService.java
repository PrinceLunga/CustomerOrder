package Services.Interface;

import Model.Customer;

public interface ICustomerService {

    String addCustomer(Customer model);

    Object[] getAllCustomers();
}
