package ajava;

class Test<T>
{
    
    T obj;
    Test(T obj) {  this.obj = obj;  } 
    public T getObject()  { return this.obj; }
}

public class generic {

	public static void main(String[] args) {
		 Test <Integer> iObj = new Test<Integer>(15);
	        System.out.println(iObj.getObject());
	   
	        // instance of String type
	        Test <String> sObj =
	                          new Test<String>("hello vsdvdv");
	        System.out.println(sObj.getObject());

	}

}
