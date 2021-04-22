package controladores;

import daos.EmpleadoDAO;
import log.logs.UsoLogger;
import modelos.*;
import java.util.*;
import utilidades.*;

import org.hibernate.Transaction;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

public class EmployeesControler {
	
	public static Logger log = UsoLogger.getLogger(EmployeesControler.class);
	
	public static void showAllEmployees(Session s) {
		List<Empleados> empl = EmpleadoDAO.getAllEmployees(s);
		Iterator it = empl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		
		log.info("Empleados generados...");
	}
	
	public static void insertEmployee(int codigo, String name, String ap1, String ap2,String telefono,Session s) {
		Date nacimiento;
		nacimiento = DateUtilities.getDateFromDayMonthYear(24, 3, 1930);
		Empleados empleado = new Empleados(codigo,name,ap1,ap2,"Zamora",nacimiento,"Aqui","985632147","novato",2);
		EmpleadoDAO.insertEmployee(empleado, s);
		
		
	}
	
	public static void deleteEmployee(int id,Session s) {
		Empleados empl = EmpleadoDAO.getEmployeeFromId(s, id);
		EmpleadoDAO.deleteEmployee(empl, s);
	}
	
	public static void updateEmployee(int id,Session s) {
		EmpleadoDAO.updateNameFromId(id, "Nombre Actualizado", s);
	}
	
	public static void showEmployeesFromDepartment(int id, Session s) {
		List<Empleados> empl = EmpleadoDAO.getEmployeesFromDepartment(id, s);
		if(empl.size() <= 0) {
			log.info("No hay empleados en ese departamento");
		}else {
			Iterator<Empleados> it = empl.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
		
	}
	
	public static void showEmployeesOlderThan(int age, Session s) {
		List<Empleados> empleados = EmpleadoDAO.getEmpleadosEdad(age, s);
		if(empleados.size() <= 0) {
			log.info("No hay empleados mayores de "+ age +" años");
		}else {
			Iterator<Empleados> it = empleados.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());
			}
		}
	}
	
	

}
