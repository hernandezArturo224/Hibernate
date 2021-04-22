package Hibernate.Hibernate;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import controladores.*;
import modelos.*;
import java.util.*;
import utilidades.*;
import daos.*;

import log.logs.*;
public class App 
{
	//static SessionFactory sessionFactory;
	
    public static void main( String[] args )
    {
    	UsoLogger.createLogguer();
    	Logger log = UsoLogger.getLogger(App.class);
        log.info("Programa iniciado");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        int opcion=0;
        Scanner scan = new Scanner(System.in);
        
        do {
        	System.out.println("Introduce 0 para ver todos los empleados, 1 para ver todos los departamentos,2 inserta empleado por defecto,3 para eliminar un empleado,4 para actualizar un empleado,5 ver empleados de un departamento,6 para salir");
        	opcion = scan.nextInt();
        	switch(opcion) {
        	case 0:
        		EmployeesControler.showAllEmployees(session);
        	break;
        	case 1:
        		DepartmentsControler.showAllDepartments(session);
        	break;
        	case 2:
        		int id;
        		System.out.println("Introduce el id el empleado a insertar");
        		id=scan.nextInt();
        		EmployeesControler.insertEmployee(id, "Alex", "Fernandez", "Gutierrez", "956321825", session);
        	break;
        	case 3:
        		int id2;
        		System.out.println("Introduce el id el empleado a eliminar");
        		id2=scan.nextInt();
        		EmployeesControler.deleteEmployee(id2, session);
        	break;
        	case 4:
        		int id3;
        		System.out.println("Introduce el id el empleado a actualizar");
        		id3=scan.nextInt();
        		EmployeesControler.updateEmployee(id3, session);
        	break;
        	case 5:
        		EmployeesControler.showEmployeesFromDepartment(8, session);
        	break;
        	default:
        		log.info("Opcion no contemplada");
        	break;
        	}
        	
        }while(opcion != 6);
        
        log.info("Hasta luego");
       
    }
}
