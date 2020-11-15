package ar.edu.unju.edm.principal;

import java.time.LocalDate;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/*
- Consultar las reservas de un médico entre dos fechas ingresadas. (se debe ingresar la
matrícula del médico), esto debe construirse como un método dentro de la clase Medico, el
método debe retornar la lista de reservas mostrando por consola todo el detalle de la misma,
el método recibe 2 parámetros que son la fechaInicio y fechaFinal, las cuales deben cumplir
con fechaInicio < fechaFinal, si no se cumple el método retorna null
- Mostrar los datos de los pacientes de un médico que son mayores a una edad ingresada (se
debe ingresar la matrícula del médico), esto se debe construir como un método de la clase
Medico, el método recibe un parámetro que representa la edad a buscar, se debe validar
que sea una edad válida, por ejemplo que esté dentro de un rango [1,100] años. Si la edad
no cumple con este rango se retorna un null.
 */

public class Principal {
	//public static EntityManager manager;
	//public static EntityManagerFactory emf;
	//public static Scanner read = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		int op;
		do {
			System.out.println("---------------------------MENU----------------------------");
			System.out.println("1. Alta de especialidad ");
			System.out.println("2. Alta de un nuevo médico");
			System.out.println("3. Alta de paciente");
			System.out.println("4. Alta de obra social");
			System.out.println("5. Alta de una reserva.");
			System.out.println("6. Listar todas las obras sociales. ");
			System.out.println("7. Listar todas las especialidades. ");
			System.out.println("8. Listar todos los médicos.");
			System.out.println("9. Listar todas las reservas. ");
			System.out.println("10. Eliminar una reserva ingresando el id. ");
			System.out.println("11. Listar todos los pacientes que poseen cierta obra social (Ingresar el id de la obra social)");
			System.out.println("12. Mostrar los datos de los pacientes de un médico que son mayores a una edad ingresada ");
			System.out.println("13. Consultar las reservas de un médico entre dos fechas ingresadas.");
			System.out.println("14. Salir ");
			System.out.println("	Ingrese opción: ");
			op=read.nextInt();
			if(op==1)opcion1();else if(op==2)opcion2(); else if(op==3) 
				opcion3(); else if(op==4)opcion4(); else if(op==5)opcion5(); 
				else if(op==6)opcion6(); else if (op==7)opcion7();else if (op==7)opcion8();
				else if (op==7)opcion9();else if (op==7)opcion10();else if (op==7)opcion11();
				else if (op==7)opcion12();else if (op==7)opcion13();else if (op==7)opcion14();
				
		} while(op!=7);
			
			read.close();
		}
	private static void opcion14() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion13() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion12() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion11() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion10() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion9() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion8() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion7() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion6() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion5() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion4() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion3() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion2() {
		// TODO Auto-generated method stub
		
	}
	private static void opcion1() {
		// TODO Auto-generated method stub
		
	}
		
	

}
