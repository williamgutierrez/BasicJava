
public class Fibonaci{

public static void main (String arl[] ){
	int i=0;int a = 0 ; int b= 1; int c = 0;
	for( i = 0 ; i< 10 ; i++){
		if( i< 9 ){
		System.out.print(a+" ");
		c= a + b ;
		a=b ;
		b=c;
		}else{
		System.out.print(a);
		}
	}
	System.out.print("");
	
	i =0 ;
	b=1;
	a = 0;
	c = 0;
	System.out.println("");
	while(i < 10){
		
		if(i< 9 ){
			System.out.print(a +" ");
			c = a+b;
			a = b ;
			b = c ;
		}else{
			System.out.print(a);
		}
		
		i++;
		
	}
	
	i =0 ;
	b=1;
	a = 0;
	c = 0;
	System.out.println("");
	do{
		if(i< 9 ){
			System.out.print(a +" ");
			c = a+b;
			a = b ;
			b = c ;
		}else{
			System.out.print(a);
		}
		i++;
	}while( i < 10 );
	
	

}
}