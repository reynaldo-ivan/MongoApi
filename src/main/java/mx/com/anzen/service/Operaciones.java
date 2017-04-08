package mx.com.anzen.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import mx.com.anzen.bean.ConexionBean;
import mx.com.anzen.config.ConfigBean;
 

/**
 * Clase uqe contiene las Operaciones que realizan las siguientes operaciones.
 * 
 * Alta en la base de datos configurada.
 * Consulta a la base de datos.
 * 
 * @author anzen
 *
 */
public class Operaciones {
	
	
	/**
	 * Metodo que realiza el alta de datos hacia la base de datos configurada.
	 * @param nombreDB
	 * @param nombreTabla
	 * @param map
	 * @return
	 */
	public String alta(String nombreDB, String nombreTabla, Map<String,Object> map){
		  
//		ApplicationContext appContext;
//		appContext=new AnnotationConfigApplicationContext(ConfigBean.class); 
//		ConexionBean conexion=(ConexionBean) appContext.getBean("iconexionbd");
//		 
//        DB db= conexion.getConexion().conexion().getDB(nombreDB);
//        DBCollection table= db.getCollection(nombreTabla);
//  
//        Iterator it = map.keySet().iterator();
//		while(it.hasNext()){
//		  Object key = it.next();
//		  conexion.getObjectAlta().put(key.toString(), map.get(key));
//		} 
//		
//		try{
//			table.insert(conexion.getObjectAlta());
//			((ConfigurableApplicationContext) appContext).close();
//		}catch (Exception e) {
//			return "Error: "+e.getMessage();
//		}
		
		 return "OK";
	}
	
	/**
	 * Metodo que realiza la Consulta de datos de la base de datos configurada.
	 * @param nombreDB
	 * @param nombreTabla
	 * @param map
	 * @return
	 */
//	public Map<String,Object> consulta(String nombreDB, String nombreTabla,Map<String,Object> map){
		
//		ApplicationContext appContext;
//		appContext=new AnnotationConfigApplicationContext(ConfigBean.class); 
//		ConexionBean conexion=(ConexionBean) appContext.getBean("iconexionbd");
//		  
//		DB db= conexion.getConexion().conexion().getDB(nombreDB);  
//        DBCollection table= db.getCollection(nombreTabla); 
//        
//        Map<String,Object> mapa= new HashMap<String, Object>();
//        Map<String,Object> result= new HashMap<String, Object>();
//        Iterator it = map.keySet().iterator();
//		while(it.hasNext()){
//		  Object key = it.next(); 
//		  conexion.getObjectAlta().put(key.toString(), map.get(key));
//		}
//        DBCursor cursor;
//        try{
//        	cursor=table.find(conexion.getObjectAlta());  
//            while(cursor.hasNext()) {
//            	DBObject key = cursor.next();
//            	String id= key.get("_id").toString();
//            	Set<String> keyset=key.keySet();
//            	for (String s: keyset){
//            		if (!s.equals("_id")){
//            			mapa.put(s, key.get(s)); 
//            		}
//            		result.put(id, mapa);
//            	}
//            }
//            ((ConfigurableApplicationContext) appContext).close(); 
//        	
//        }catch (Exception e) {
//			System.out.println("Error: "+e.getMessage());
//		}
        
//		 return result;
//	}

}
