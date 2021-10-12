package ajava;
import java.util.*;

public class star {

	public static void main(String[] args) {
		int i, j,number;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Number of layers: ");
		int row= s.nextInt();
		
		  for(i=1;i<=row;i++ ) {
			  
			  
			  for(j=i;j<row;j++) {
				  System.out.print(" ");
			  }
			  for(number=1;number<(i*2);number++) {
				  System.out.print("*"); 
				  
			  }
			  
			  
			  System.out.print("\n");
			  
		  } 

	}

}
