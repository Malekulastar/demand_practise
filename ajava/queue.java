package ajava;
import java.util.*;


public class queue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("__Queue operations using array__\n"); 
		boolean flag=true;
		
		
		while(flag==true) {
			   System.out.println("\n1. PUSH\n 2. PEEK\n 3. POP\n 4. DISPLAY\n 5. QUIT\n Select one operation : ");
	             int o = in.nextInt();
	             
	             switch(o) {
	             case 1: System.out.println(" Enter a number you want to insert in Queue : ");
                     int num = in.nextInt();
                     q.push(num);
	            	 break;
	             case 2:q.pop();
	            	 break;
	             case 3:q.peek();
	            	 break;
	             case 4:q.display();	            	 
	            	 break;
	             case 5: flag=false;
	                 break;
	             
	             
	             
	             
	             }
			
			
		}

	}

}
