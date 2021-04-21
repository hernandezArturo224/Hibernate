package Hibernate.Hibernate;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */

import log.logs.*;
public class App 
{
	
	
    public static void main( String[] args )
    {
    	UsoLogger.createLogguer();
    	Logger log = UsoLogger.getLogger(App.class);
    	
        System.out.println( "Hello World!" );
        log.info("Programa iniciado");
    }
}
