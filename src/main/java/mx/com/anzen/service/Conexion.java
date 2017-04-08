package mx.com.anzen.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
 
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

import mx.com.anzen.bean.ConexionBean;
import mx.com.anzen.config.ConfigBean; 

/**
 * Clase que realiza la conexión a el manejador de base de datos mongo
 * @author anzen
 *
 */
public class Conexion  {
	
	/**
	 * Declaracion de ApplicationContext
	 */
	
//	ApplicationContext appContext; 
//	ConexionBean conexion=null;  
//	Properties propiedades = new Properties();
//    InputStream entrada = null;
	
	/**
	 * Metodo que realiza la conexión a la base de datos.
	 * retornando un MongoClient.
	 */
//	public MongoClient conexion() {
//		 
//		 appContext=new AnnotationConfigApplicationContext(ConfigBean.class); 
//		 conexion=(ConexionBean) appContext.getBean("iconexionbd"); 
//			try { 
//				entrada = new FileInputStream("src/main/resources/configuracion.properties");
//				propiedades.load(entrada);
//				String host=propiedades.getProperty("anzen.api.persistencia.ip");
//				int puerto=Integer.parseInt(propiedades.getProperty("anzen.api.persistencia.puerto"));
//				// Conexion a MongoDB
//				conexion.setMongo(new MongoClient(host,puerto));
//	 
//			} catch (UnknownHostException e) { 
//				System.out.println("Error: "+e.getMessage());
//			} catch (MongoException e) { 
//				System.out.println("Error: "+e.getMessage());
//			} catch (IOException e) { 
//				System.out.println("Error: "+e.getMessage());
//			}
//			
//			return conexion.getMongo();
//	}
	
	/**
	 * Este metodo retorna la conexion de la base de datos 
	 * Retorna un valor de tipo MongoClient
	 */
 
 
	
	 

}
