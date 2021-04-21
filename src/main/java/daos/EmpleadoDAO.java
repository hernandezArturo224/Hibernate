package daos;

import java.util.*;

import org.hibernate.Session;
import modelos.*;

public class EmpleadoDAO {
	
	public static List<Empleados> getAllEmployees(Session s) {
		String hQuery = "from Empleados";
		List<Empleados> emplList = s.createQuery(hQuery, Empleados.class)
				   	   			           .list();
		return emplList;
	}

}
