package domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import domain.Customer;
import domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{
	private List<Customer> listOfCustomers = new ArrayList<Customer>(); 
	
	public InMemoryCustomerRepository() {
		Customer customer1 = new Customer();
		customer1.setName("Bartosz");
		customer1.setCustomerId("P1");
		customer1.setAddress("A 1/3");
		
		Customer customer2 = new Customer();
		customer2.setName("Bartek");
		customer2.setCustomerId("P2");
		customer2.setAddress("B 3/5");
		
		listOfCustomers.add(customer1);
		listOfCustomers.add(customer2);
	}
	
	public List<Customer> getAllCustomers(){
		return listOfCustomers;
	}
}
