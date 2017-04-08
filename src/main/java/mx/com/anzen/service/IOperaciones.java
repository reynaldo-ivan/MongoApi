package mx.com.anzen.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.repository.MongoRepository;

import mx.com.anzen.bean.Customer;
 

public interface IOperaciones extends MongoRepository<Customer, String> {

	public Customer findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
}
