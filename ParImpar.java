import java.util.Scanner;

public class ParImpar{
	public static void main(String []arg){
	 //suma de pares e impares  poniendo un digito
	 Scanner leer = new Scanner(System.in);
	 int numero=0;
	 int sumaPar=0;
	 int sumaImpar = 0;
	 
	 numero = leer.nextInt();
	 for( int i = 0 ; i<= numero ; i++){
	    if( i % 2 == 0 ){
		sumaPar = sumaPar + i;
		//cityTrops app.heroesencasa.com
		}else{
		sumaImpar = sumaImpar + i;
		}
	 }
	 System.out.println("Suma Par = "+sumaPar);
	 System.out.println("Suma Impar = "+sumaImpar);
	 
	 
System.out.println("============================================");
	int num = leer.nextInt();
	if(num < 0 ) // el numero es negarivo
	{ 
	  System.out.println("el numero es NEGATIVO");
		if(num%2 == 0){
			System.out.println("El numero es PAR");
		}else{
			System.out.println("El numero es Impar");
		}
		
	}else{
		System.out.println("el numero es POSITIVO");
		if( num%2 == 0){
			System.out.println("El numero es PAR");
		}else{
			System.out.println("El numero es Impar");
		}
		
	}
		

	
	 
	 }
	
	 
}