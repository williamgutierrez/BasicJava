/* reliazar unprograma que compare dos nombres para verificar que son 
iguales, mostrnado un mensaje en pantalla al final que diga"
los nombre son iguales/ los nombre son diferentes.
*/

/*realizar un programa que simula un inicio de sesion solicitando el 
nombre de usuario y la contrasenia, para posteriiormente comprarlos 
y mostrar un mensjae en pantalla que diiga: inicio de session correcto/
nombre de usuario o password incorrectos.*/

import java.util.Scanner;
public class PractNombre{

	public static void main(String arg[]){
	
	Scanner leer = new Scanner(System.in);
	System.out.println("======================");
	String nombre="", nombre2="";
	System.out.print("Porfabor ingrese el Primer nombre: ");
	nombre = leer.nextLine();
	System.out.print("Porfabor ingrese el Segundo nombre: ");
	nombre2 = leer.nextLine();
	
	System.out.print("");
	
	if(nombre.equals(nombre2) ){
		System.out.println("Los nombres son iguales");
	}else{
		System.out.println("Los nombre son diferentes");
	}
	
	
	
	
	}


}