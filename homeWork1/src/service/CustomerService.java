package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customerMap;
	
	
	
	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001","id001","이동연"));
		addCustomer(new Customer("id002","id002","박찬모"));
		addCustomer(new Customer("id003","id003","신재구"));
		addCustomer(new Customer("id004","id004","이루비"));
		addCustomer(new Customer("id005","id005","정주영"));
		
	}


	private void addCustomer(Customer customer) {

		customerMap.put(customer.getId(),customer);
		}
	
	public Customer findCustomer(String id) {
		
		if(id !=null)
			return (customerMap.get(id.toLowerCase()));
		else
			return null;
	}
	public Customer login(String id, String password) {
		Customer customer1 = findCustomer(id);
		
		if(customer1 !=null)
		{
			if(id.equals(customer1.getId()) &&password.equals(customer1.getPassword())) {
				return customer1;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
	
	

	
}
