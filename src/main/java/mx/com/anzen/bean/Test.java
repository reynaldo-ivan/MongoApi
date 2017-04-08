package mx.com.anzen.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import mx.com.anzen.config.ConfigBean;
import mx.com.anzen.service.Operaciones; 
 

public class Test {
	 
	public static void main(String[] args) {
		Operaciones operaciones=new Operaciones();
		
		Map<String,Object> map=new HashMap();
		map.put("id",1); 
		map.put("nombre","yuni 2");
		map.put("am","sanchez 2");
		map.put("ap","ramirez 2");
		/**
		 * Realiza el alta
		 */
		String result=operaciones.alta("rey","persona",map);
		System.out.println("resultados  "+result); 
		/**
		 * Realiza la consulta
		 */
//		Map<String,Object> mapResult=operaciones.consulta("rey","persona",map);
//		System.out.println("Result   "+mapResult);
		  
	} 
}
