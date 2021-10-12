package ajava;
import java.util.*;

public class stackprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[][]= new int[5][10];
		
		
//		for (int x = 0; x < 5; x++) 
//		{
//		    for (int y = 0; y < 10; y++) 
//		    {
//		        numbers[x][y] = (int)(Math.random() * 100) + 1;
//		    }
//		}
//		
//		for (int x = 0; x < 5; x++) 
//		{
//			System.out.println("Stack no:"+(x+1));
//		    for (int y = 0; y < 10; y++) 
//		    {
//		        System.out.println(numbers[x][y]) ;
//		    }
//		    System.out.println("\n");
//		}
//		
		
		boolean flag=true;
		
		
		while(flag) {
			int a=(int)(Math.random()*5);
			
			for (int y = 0; y < 10; y++) 
		    {
		        numbers[a][y] = (int)(Math.random() * 100) + 1;
		    }
			flag=false;	
			System.out.println(a);
			
		}
		for (int x = 0; x < 5; x++) 
		{
			System.out.println("Stack no:"+(x+1));
		    for (int y = 0; y < 10; y++) 
		    {
		        System.out.println(numbers[x][y]) ;
		    }
		    System.out.println("\n");
		}		
		
		
		
	}

}
