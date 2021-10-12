package ajava;
import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Binary to HexaDecimal");
			 
			 
			System.out.println("\nEnter the number :");
			int num = Integer.parseInt(s.nextLine(), 2);
			
			String hexa = Integer.toHexString(num);
			System.out.println("HexaDecimal Value is : " + hexa);
		}
		
		catch(Exception e) {
			System.out.println("invalid");
		
		}
		

}}
