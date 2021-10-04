package ajava;
import java.util.*;

   class account{ 
	
	    public int id;
	    public String name;
	    public String add;
	    
	    public void accounta (String name){
	          
	        this.name= name;
            System.out.println(name);
	    }
	    
	  
	   
}	
  


class contact{
	 public int id;
	 public String firstName;
	 public String lastName;
	 

	    public void lastName (String name){
	          
	        this.lastName= lastName;
	    }
}
class opp{
	 public int id ;
	 public String name ;
	 public  String amount;
	  
	 public void amount (String amount){
         
	        this.amount= amount;
	    }
	 
}

public class classprac {

	public static void main(String[] args) {
	 List<account> a1=new ArrayList();
	 List<contact> c1=new ArrayList();
	 List<opp> o1= new ArrayList();
	 
	account aa1=new account("malik");
    System.out.println(aa1);
	

	}

}
