package Hibernate.Hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelos.*;
import java.util.*;
import utilidades.*;
import daos.*;

/**
 * Hello world!
 *
 */

import log.logs.*;
public class App 
{
	//static SessionFactory sessionFactory;
	
    public static void main( String[] args )
    {
    	UsoLogger.createLogguer();
    	Logger log = UsoLogger.getLogger(App.class);
    	
        System.out.println( "Hello World!" );
        log.info("Programa iniciado");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        //List<Empleados> empleados = EmpleadoDAO.getAllEmployees(session);
        
        //System.out.println(empleados.get(0).toString());
        
        //Empleados em = EmpleadoDAO.getEmployeeFromId(session, 12);
        
        //System.out.println(em.toString());
        Empleados empl = new Empleados(8,"Arturo","Hernandez","Nuñez","Zamora",'d',"C/Plaza","956321596","JEFAZO",9);
        //EmpleadoDAO.insertEmployee(empl, session);
        EmpleadoDAO.deleteEmployee(empl, session);
    }
}
