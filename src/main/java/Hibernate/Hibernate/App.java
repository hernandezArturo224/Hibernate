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
        String [] opciones = {"0. Ver todos los empleados","1. Ver todos los departamentos","2. Insertar empleado por defecto","3. Elimina empleado","4. Actualizar un empleado","5. Salir"};
        
        
        do {
        	Menu menu = new Menu(opciones);
        	System.out.println(menu.muestraMenu());
        	opcion = scan.nextInt();
        	switch(opcion) {
        	case 0:
        		EmployeesControler.showAllEmployees(session);
        	break;
        	case 1:
        		DepartmentsControler.showAllDepartments(session);
        	break;
        	case 2:
        		boolean seguir=true;
        		int id;
        		do {
        			System.out.println("Introduce el id el empleado a insertar");
            		id=scan.nextInt();
            		seguir = EmployeesControler.checkEmployee(id, session);
        		}while(seguir);
        		EmployeesControler.insertEmployee(id, "Alex", "Fernandez", "Gutierrez", "956321825", session);
        	break;
        	case 3:
        		boolean seguir2 = false;
        		int id2;
        		do {
        			System.out.println("Introduce el id el empleado a eliminar");
            		id2=scan.nextInt();
            		seguir2 = EmployeesControler.checkEmployee(id2, session);
        		}while(!seguir2);
        		EmployeesControler.deleteEmployee(id2, session);
        	break;
        	case 4:
        		boolean seguir3=false;
        		int id3;
        		do {
        			System.out.println("Introduce el id el empleado a actualizar");
            		id3=scan.nextInt();
            		seguir3 = EmployeesControler.checkEmployee(id3, session);
        		}while(!seguir3);
        		EmployeesControler.updateEmployee(id3, session);
        	break;	
        	default:
        		log.info("Opcion no contemplada");
        	break;
        	}
        	
        }while(opcion != 5);
        scan.close();
        log.info("Hasta luego");
       
    }
}
