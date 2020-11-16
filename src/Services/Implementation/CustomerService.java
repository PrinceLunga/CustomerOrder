package Services.Implementation;

import Model.Customer;
import Services.Interface.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {

    private List<Customer> customerList = new ArrayList<Customer>();

    public String addCustomer(Customer model)
    {
        try
        {
            if(model != null)
            {
                customerList.add(model);
                return "Customer successfully added !";
            }
        }
        catch(Exception ex)
        {
            return ex.getMessage();
        }
        return null;
    }

    public Object[] getAllCustomers()
    {
        return customerList.toArray();
    }
}
