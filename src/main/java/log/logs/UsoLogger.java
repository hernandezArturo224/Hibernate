package log.logs;

import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UsoLogger {

	private static Logger logger;
	
	public static void createLogguer() {
		 ClassLoader loader = Thread.currentThread().getContextClassLoader();
		 //URL url = loader.getResource("log4j.properties");
		 String url = "C:\\Users\\Arturo\\eclipse-workspace\\Hibernate\\src\\main\\resources\\log4j.properties";
		 
		 PropertyConfigurator.configure(url);
	}
	
	public static Logger getLogger(Class clase) {
		logger = LogManager.getLogger(clase);
		return logger;
	}
	
}
