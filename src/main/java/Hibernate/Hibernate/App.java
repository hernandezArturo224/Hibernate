package Hibernate.Hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import utilidades.*;

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
    }
}
