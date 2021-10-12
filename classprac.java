//package ajava;
import java.util.*;

  class account{ 
	
	    public int id;
	    public String name;
	    public String add;
	    public float revenue;
	    public int parentAccount;
	    List<contact> contacts;
	    List<opp> opportunity;
	    List<account> childAccount;
	    
	    public account(String name) {
	    	this.name= name;
		}

		
	    public String getName() {
	    	 return name;
	       	       
	      }
	    public float getAmoun() {
	    	return revenue;
	    }
	   
	    public void addrev(opp oppt) {
	    	this.revenue+=oppt.getamount();
	    }
	    
}	
  class opp{
		 public int id ;
		 public String name ;
		 public  int amount;
		 String  date;
		 String stage;
		  
		 public  opp (int amount, String stage,String name){
	            this.name=name;
		        this.amount= amount;
		        this.stage=stage;
		    }
		 public int getamount() {
		        return amount;
		      }
		 public String getStage() {
		        return stage;
		      }
		 public String getname() {
		        return name;
		      }
		
		 
	}

class contact{
	 public int id;
	 public String firstName;
	 public String lastName;
	 public int Number;
	 public int reportsTo;
	 

	    public contact(String lastName) {
	    	this.lastName= lastName;
	}
	    public String getName() {
	        return lastName;
	      }


		
}


public class classprac {

	public static void main(String[] args) {
	 List<account> a1=new ArrayList();
	 List<contact> c1=new ArrayList();
	 List<opp> o1= new ArrayList();
	 
	account aa1= new account("malik");
	account aa12= new account("malik2");
	account aa13= new account("malik3");
	
	aa1.addrev(new opp(3000,"prospecting","malik"));
	aa13.addrev(new opp(30000,"prospecting","malik3"));
	
	contact cc1= new contact("Malik");
	contact cc2=new contact("Malik2");
	contact cc3=new contact("Malik3");
	contact cc4=new contact("Malik4");
	contact cc5=new contact("Malik5");
	contact cc6=new contact("Malik6");
	contact cc7=new contact("Malik7");
	contact cc8=new contact("Malik8");
	contact cc9=new contact("Malik9");
	contact cc10=new contact("Malik10");
	
	opp oop1= new opp(10000,"prospecting","malik2");
	opp oop2= new opp(20000,"prospecting","malik3");
	opp oop3= new opp(20000,"Closed Won","malik");
	
	String ans=aa1. getName();
	
	
	
	a1.add(aa1);
	a1.add(aa12);
	a1.add(aa13);
	
	c1.add(cc1);
	c1.add(cc2);
	c1.add(cc3);
	c1.add(cc4);
	c1.add(cc5);
	c1.add(cc6);
	c1.add(cc7);
	c1.add(cc8);
	c1.add(cc9);
	c1.add(cc10);
	
	
	o1.add(oop1);
	o1.add(oop2);
	o1.add(oop3);
	
	System.out.println("Account List\n");
	for(int i=0;i<a1.size();i++){
	    System.out.println(a1.get(i).getName() +' '+a1.get(i).getAmoun());
	    
	} 
	
	System.out.println("\nAccount List where revenue is greator equal to 10000.\n");
	for(int i=0;i<a1.size();i++){
		if(a1.get(i).getAmoun() >= 10000) {
	    System.out.println(a1.get(i).getName()+" "+a1.get(i).getAmoun());
	    
		}
		else {System.out.println("!!!!");}
	}
	
	System.out.println("\nAccount List Sorted according to revenue.\n");
	  Collections.sort(a1, new Comparator<account>() {
          public int compare(account o1,account o2) {
              return o1.revenue > o2.revenue ? -1 : o1.revenue == o2.revenue ? 0 : 1;
          }
      });
	  
//	  System.out.println(a1);
	
	for(int i=0;i<a1.size();i++){
	    System.out.println(a1.get(i).getName()+" "+a1.get(i).getAmoun());
	    
	} 
	/////////////
	System.out.println("\nOpportunity List\n");
	for(int i=0;i<o1.size();i++){
		 System.out.println(o1.get(i).getname()+" "+o1.get(i).getamount()+" "+ o1.get(i).getStage());
	    
	} 
	
	System.out.println("\nOpportunity List of stage prospecting\n");
	
	for(int i=0;i<o1.size();i++){
		
	if(o1.get(i).getStage() == "prospecting") {
	
		 System.out.println(o1.get(i).getname()+" "+o1.get(i).getamount()+" "+ o1.get(i).getStage());
	   
	} else {
		
	}
	
	}
	////////////
	System.out.println("\nContact List\n\n");
	for(int i=0;i<c1.size();i++){
	    System.out.println(c1.get(i).getName());
	} 
	System.out.println("\n");
	
	Map<Integer,contact> contacts= new HashMap<>();
	Map<Integer,Integer> reportsTo= new HashMap<>();
	
    contacts.put(1,cc1);
    contacts.put(2,cc2);
    contacts.put(3,cc3);
    contacts.put(4,cc4);
    contacts.put(5,cc5);
    contacts.put(6,cc6);
    contacts.put(7,cc7);
    contacts.put(8,cc8);
    contacts.put(9,cc9);
    contacts.put(10,cc10);
    
	reportsTo.put(1, 2);
	reportsTo.put(2, 3);
	reportsTo.put(3, 4);
	reportsTo.put(4, 5);
	reportsTo.put(5, 6);
	
	System.out.println("List of Contacts with unique ID\n");
	contacts.forEach((k, v) -> System.out.println((k + ":" + v.getName())));
	System.out.println("\nList of Contacts with Reports to ID");
	System.out.println(reportsTo);
	
	System.out.println("To find Reach between 1->5 Contact");
	
	Integer startCon=1,endCon=5;
	Integer  curCon=startCon;
	int check= 0;
	
	if( startCon ==endCon) {
		System.out.println("Invalid");	
	}
	else {	
	while(curCon != null) {
		
		if(curCon ==endCon ) {
			check=1;						
			System.out.println("Contact Reach Found");	
			break;
		}
		curCon=reportsTo.get(curCon);	
		System.out.println(curCon);	
		if(curCon==null) {System.out.println("Reach Not Found");	}
		
	}
	
	
	}

	}

}
