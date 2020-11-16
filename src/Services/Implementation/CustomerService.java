package Services.Implementation;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customerList = new ArrayList<Customer>();

    private String addCustomer(Customer model)
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

    private Object[] getAllCustomers()
    {
        return customerList.toArray();
    }
}
