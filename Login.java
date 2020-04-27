import java.util.Scanner;
public class Login{

	public static void main(String arg[]){
	
	Scanner leer = new Scanner(System.in);
	System.out.println("======================");
	String usuario="", password="";
	System.out.print("Porfabor ingrese el Primer usuario: ");
	usuario = leer.nextLine();
	System.out.print("Porfabor ingrese el Segundo Password: ");
	password = leer.nextLine();
	
	System.out.print("");
	
	if(usuario.equals("william") && password.equals("admin123*")){
		System.out.println("Inicio de session correcto ");
	}else{
		System.out.println("nombre de Usuario y password incorrecto");
	}	
	
	
	}


}