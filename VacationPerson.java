import java.util.Scanner ;

public class VacationPerson{


public static void main(String arg[] ){
	Scanner leer = new Scanner(System.in);
	
	String nombre;
	int clave=0;
	int antiguedad=0;
	System.out.println("******************************************************");
	System.out.println("Bienvenido al Sistema Vacacional de Cocacola company*");
	System.out.println("******************************************************");
	System.out.println("");
	System.out.println("");
	System.out.print("cual es tu Nombre Trabajador?: ");
	nombre = leer.nextLine();
	
	System.out.println("");
	System.out.print("Antiguedad Trabajador: ");
	antiguedad = leer.nextInt();
	
	System.out.println("");
	System.out.print("Cual es la Clave de su Departamento: ");
	clave = leer.nextInt();
	System.out.println("");
	System.out.println("******************************************************");
	System.out.println("");
	if(clave == 1){
		if(antiguedad == 1){
			//recibe 6 dias de vacaciones
			System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			System.out.println("merece 6 dias de vacaciones");
		}else{
			if( antiguedad >= 2 && antiguedad <=6 ){
				//recive 15 dias de vacaiones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			System.out.println("merece 14 dias de vacaciones");
			}else{
				if(antiguedad >= 7 ){
					//reciben 20 dias de vacaciones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
				System.out.println("merece 20 dias de vacaciones");					
				}
				else{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
			}
		
		}
		
	}
	else if(clave == 2 ){
		if(antiguedad == 1){
			//recibe 6 dias de vacaciones
			System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			System.out.println("merece 7 dias de vacaciones");
		   }else{
			if(antiguedad >= 2 && antiguedad <=6 ){
				//recive 15 dias de vacaiones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			    System.out.println("merece 15 dias de vacaciones");
			}else{
				if(antiguedad >= 7 ){
					//reciben 20 dias de vacaciones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
				System.out.println("merece 22 dias de vacaciones");					
				}
				else{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
			}
		
		   }
		
	}
	else if(clave == 3 ){
			
				if(antiguedad == 1){
			//recibe 6 dias de vacaciones
			System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			System.out.println("merece 10 dias de vacaciones");
		}else{
			if(antiguedad >= 2 && antiguedad <=6 ){
				//recive 15 dias de vacaiones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
			System.out.println("merece 20 dias de vacaciones");
			System.out.println("");
			}else{
				if(antiguedad >= 7 ){
					//reciben 20 dias de vacaciones
				System.out.println("Nombre: "+nombre +" tiene "+antiguedad +" de Servicio");
				System.out.println("merece 30 dias de vacaciones");	
				System.out.println("");			
				}
				else{
					System.out.println("Aun no tiene derecho a vacaciones");
				}
			}
		
		  }
		
			
	}else {
		System.out.println("Error la clave del Departamento no Existe!!");
	}
		
		
		
	
	
	
	
	
}
 
}