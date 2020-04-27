 
 public class Ejercicios{
	 
	 
	 public static void main(String arg[]){
		 
		 for(int i= 1; i <= 10 ; i++){
			 
			 if(i< 10){
			System.out.print( i+",");	 
			 }else{
				 System.out.print( i);
			 }
			 
			 
		 }
		 System.out.println();
		 System.out.println( "=================================");
		 System.out.println( "WHILE");
		 System.out.println( "=================================");
		 int j = 1;
		 while(j<=10 ){
			if(j< 10){
			System.out.print( j+",");	 
			 }else{
				 System.out.print( j);
			 } 
			 
			 j++;
			 
		 }
		 
		 System.out.println();
		 System.out.println( "=================================");
		 System.out.println( "DO WHILE");
		 System.out.println( "=================================");
		 int k= 1;
		 do{
			if( k< 10){
		    	System.out.print( k+",");	 
			 }else{
				 System.out.print( k );
			 }
			 	k++;		 
		 }while(k<=10);
		 
	 }
 }