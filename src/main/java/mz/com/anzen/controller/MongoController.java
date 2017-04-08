package mz.com.anzen.controller;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import mx.com.anzen.bean.ConexionBean;
import mx.com.anzen.bean.Customer;
import mx.com.anzen.config.ConfigBean;
import mx.com.anzen.service.IOperaciones;
import mx.com.anzen.service.Operaciones; 
 
  

@RestController
public class MongoController {
	
	@Autowired
	private IOperaciones iservicio;
	
	 
	@RequestMapping(value="/mongo")
	public String mongoDB(){
		
		System.out.println("rey ");
		
		this.iservicio.deleteAll();

		// save a couple of customers
		this.iservicio.save(new Customer("re", "Smith"));
		this.iservicio.save(new Customer("rey", "Martinez"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : this.iservicio.findAll()) {
			System.out.println(customer);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(this.iservicio.findByFirstName("rrr"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		for (Customer customer : this.iservicio.findByLastName("iii")) {
			System.out.println(customer);
		}
		
		return "Exitoso";
	}
	
	
	
	 
	
//	@RequestMapping(value = "/getData/{bd}/{tabla}")
//	public Map<String,Object> getData(@PathVariable String db,@PathVariable String tabla) {
//		  
//		
//		Map<String,Object> map=new HashMap();  
//		/**
//		 * Realiza la consulta
//		 */
//		Map<String,Object> mapResult=iservicio.consulta(db,tabla,map); 
//		 
//		return mapResult;
//		
//	}
	
//	@RequestMapping(value = "/setData/{bd}/{tabla}")
//	public String setData() {
//		  
//		Map<String,Object> map=new HashMap();
//		map.put("_id",11);
//		map.put("nombre","yuni 2");
//		map.put("am","sanchez 2");
//		map.put("ap","ramirez 2");
//		/**
//		 * Realiza el alta
//		 */
//		String result=iservicio.alta("rey","persona",map);
//		System.out.println("resultados  "+result);  
//		 
//		return result; 
//	}

}
