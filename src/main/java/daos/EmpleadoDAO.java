package daos;

import java.util.*;
import org.hibernate.Transaction;

import org.hibernate.Session;
import modelos.*;

public class EmpleadoDAO {
	
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

}
