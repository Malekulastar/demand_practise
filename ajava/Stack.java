package ajava;
import java.util.*;

class MyStack{
	 private int top=-1;
	 private int stk[] = new int[100];
	 
	 boolean empty()
	    {
	        if(top >= 0)
	        {
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    }
	 
void push(int num) {
	   if(top == 100)
       {
           System.out.println("n Stack is in overflow state");
       }
       else
       {
           stk[++top] = num;
           System.out.println("\n "+num+" is inserted in stack");
       }
}

void pop() {
	if(top<0) {System.out.println(" Stack is in underflow state");}
	else {
		int x=stk[top--];
		System.out.println("\n"+x+"Has been removed!!!");
	}
	
}

int peek() {
	if(empty())
    {
        System.out.println("n Stack is empty");
        return 0;
    }
    else
    {
        System.out.println("n The top most position of stack holds "+stk[top]);
        return stk[top];
    }
	
}
	
 void display() {
	 if(empty()) {
		 System.out.println("\nStack is Empty!!");
	 }else {
		 for(int i=0;i<=top;i++) { System.out.println("|"+stk[i]+"|");}
		 
	 }
	 
	 
 }	
}

public class Stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("__Stack operations using array__\n"); 
		boolean flag=true;
		MyStack s= new MyStack();
		
		while(flag==true) {
			   System.out.println("\n1. PUSH\n 2. PEEK\n 3. POP\n 4. DISPLAY\n 5. QUIT\n Select one operation : ");
	             int o = in.nextInt();
	             
	             switch(o) {
	             case 1: System.out.println(" Enter a number you want to insert in stack : ");
                        int num = in.nextInt();
                        s.push(num);
	            	 break;
	             case 2:s.pop();
	            	 break;
	             case 3:s.peek();
	            	 break;
	             case 4:s.display();	            	 
	            	 break;
	             case 5: flag=false;
	                 break;
	             
	             
	             
	             
	             }
			
			
		}
		

	}

}
