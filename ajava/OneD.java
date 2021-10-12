
package ajava;
import java.util.*;

public class OneD {

	public static void main(String[] args) {
		try {
		Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements of array");
        int n=s.nextInt();
        
        int[] array =new int[n];
        System.out.println("enter elements");
        
        for(int i=0;i<array.length;i++) {
        array[i]=s.nextInt();	
        }
        System.out.println("Printed Array");
        for(int i:array) {
        	System.out.println(i);
        }

	}
		catch (Exception e) {
			
		}
		
	
	
	}

}
