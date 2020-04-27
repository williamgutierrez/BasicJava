public class Ejercicio2{

 public static void main(String []arg){
    //1,99,2,98,3,97,4,96,5,95
	
	int j = 99;
	for (int i= 1; i <=5 ; i++){
		if(i< 5){
		System.out.print(i+", ");
		System.out.print(j+", ");
		}else{
		System.out.print(i+", ");
		System.out.print(j);
		}
		j--;
			
	}
	
	System.out.println();
	System.out.println( "=================================");
    System.out.println( "WHILE");
	System.out.println( "=================================");
     int k = 1;
	 int m = 99;
		while(k<=5){
			if(k< 5){
			System.out.print(k+", ");
	    	System.out.print(m+", ");
			}else{
		    System.out.print(k+", ");
		    System.out.print(m);		
			}
			
			k++;
			m--;
		}
		
		System.out.println();
	System.out.println( "=================================");
    System.out.println( "DO WHILE");
	System.out.println( "=================================");
	int r = 1;
	 int p = 99;
	do{
		if(r < 5){
			System.out.print(r+", ");
	    	System.out.print(p+", ");
			}else{
		    System.out.print(r+", ");
		    System.out.print(p);		
			}
			
			r++;
			p--;
	}while(r<=5);
   
  }

}