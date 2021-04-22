package controladores;

import daos.EmpleadoDAO;
import log.logs.UsoLogger;
import modelos.*;
import java.util.*;

import org.hibernate.Transaction;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class EmployeesControler {
	
	public static Logger log = UsoLogger.getLogger(EmployeesControler.class);
	
	public static void showAllEmployees(Session s) {
		List<Empleados> empl = EmpleadoDAO.getAllEmployees(s);
		if(empl.size() <= 0) {
			log.info("No hay empleados en la BD...");
		}else {
			Iterator it = empl.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
			
			log.info("Empleados generados...");
		}
		
	}
	
	public static void insertEmployee(int codigo, String name, String ap1, String ap2,String telefono,Session s) {
		Date date = new GregorianCalendar().getTime();
		Empleados empleado = new Empleados(codigo,name,ap1,ap2,"Zamora",date,"Aqui","985632147","novato",2);
		EmpleadoDAO.insertEmployee(empleado, s);
		
		
	}
	
	public static boolean checkEmployee(int id, Session s) {
		Empleados empl;
		empl=EmpleadoDAO.getEmployeeFromId(s, id);
		if(empl == null) {
			return false;
		}else {
			log.info("Ya hay un empleado con la misma id");
			return true;
		}
	}
	
	public static void deleteEmployee(int id,Session s) {
		Empleados empl = EmpleadoDAO.getEmployeeFromId(s, id);
		EmpleadoDAO.deleteEmployee(empl, s);
	}
	
	public static void updateEmployee(int id,Session s) {
		EmpleadoDAO.updateNameFromId(id, "Nombre Actualizado", s);
	}

}
