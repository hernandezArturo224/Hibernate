package daos;

import java.util.*;
import org.hibernate.Transaction;

import log.logs.UsoLogger;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import modelos.*;

public class EmpleadoDAO {
	Logger log = UsoLogger.getLogger(EmpleadoDAO.class);
	
	public static List<Empleados> getAllEmployees(Session s) {
		String hQuery = "from Empleados";
		List<Empleados> emplList = s.createQuery(hQuery, Empleados.class)
				   	   			           .list();
		return emplList;
	}
	
	public static Empleados getEmployeeFromId(Session s, int id) {
		String hQuery = "from Empleados e" + " where e.codigo = :id";
		Empleados empleado = s.createQuery(hQuery,Empleados.class)
				.setParameter("id", id)
				.setMaxResults(1)
				.uniqueResult();
		
		return empleado;
	}
	
	public static void insertEmployee(Empleados empleado,Session s) {
		Transaction tx = s.beginTransaction();
		s.save(empleado);
		tx.commit();
	}
	
	public static void deleteEmployee(Empleados empleado,Session s) {
		Transaction tx = s.beginTransaction();
		s.delete(empleado);
		tx.commit();
	}
	
	public static void updateNameFromId(int id, String nuevoNombre, Session s) {
		 List<Empleados> empleados = getAllEmployees(s);
		Transaction tx = s.beginTransaction();
        Empleados empl = empleados.stream().filter(x -> x.getCodigo() == id).findFirst().orElse(null);
        empl.setNombre(nuevoNombre);
        tx.commit();
	}
	
	public static List<Empleados> getEmployeesFromDepartment(int id, Session s){
		String hQuery = "from Empleados e" + " where e.cod_departamento = :id";
		List<Empleados> empleados = s.createQuery(hQuery, Empleados.class)
									.setParameter("id", id)
									.list();
		
		return empleados;
									
									
	}

}
