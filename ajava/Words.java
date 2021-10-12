package ajava;

public class Words {

	public static void main(String[] args) {
		String str = "abc abc abc abc abcjnjncijnaj abc abc ";
	    String word = "abc";
	    
	    String a[] = str.split(" ");
	    int count=0;
	    
	    for (int i = 0; i < a.length; i++) {
	    {
	    
	    if (word.equals(a[i]))
	        count++;
	    }}
	    
	    System.out.println("Number of Occurrences of abc is: "+ count);
	    

	}

}
