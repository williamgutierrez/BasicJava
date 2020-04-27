import java.util.Scanner;
 
public class  Suma{
  
  public static void main(String arg []){
	//estructuras conduciona
	Scanner entrada = new Scanner(System.in);
	System.out.println("Eliga un numero del 1-4 para ejecuta la operacion");
	int operacion =entrada.nextInt();
	int numeroUno=4;
	int numeroDos = 6;
	int resultado =0;
	
	
	if(operacion ==1){
		//suma
		resultado= numeroUno +numeroDos;
		System.out.println("Resultado de la Suma :"+resultado);
	}else{
		if(operacion == 2){
			//resta
			resultado = numeroUno - numeroDos;
			System.out.println("Resultado de la Resta :"+resultado);
		}else{
			if(operacion==3){
				//multiplicaion
				resultado = numeroUno * numeroDos;
				System.out.println("Resultado de la Multiplicacion :"+resultado);
			}else{
				if(operacion==4){
					//division
				 resultado=	numeroUno /numeroDos;
				 System.out.println("Resultado de la Division :"+resultado);
				 
				}else{
					//mensaje
					System.out.println("La opcion que elegiste no existe");
				}
			}
		}
	}
	
		
	
	
   }
  
  
}