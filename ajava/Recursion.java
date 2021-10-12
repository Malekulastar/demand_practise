package ajava;
import java.util.*;

public class Recursion {
	
	static int fact(int i) {
		
		if (i == 0)    
		    return 1;    
		  else    
		    return(i * fact(i-1));    
		 } 
	

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println(" Enter number to find factorial of :\t");
	int i=s.nextInt();
	int ans= fact(i);
	System.out.println(ans);
	}

}
