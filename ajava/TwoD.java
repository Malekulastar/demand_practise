package ajava;
import java.util.*;

public class TwoD {

	public static void main(String[] args) {
		
		try {
		
		System.out.println("A 3 x 3 Matrix");
		int[][] array= new int[3][3];
		
		
		for(int n=0;n<array.length;n++) {
			for(int m=0;m<array.length;m++) {
				array[n][m]=(int) (Math.random() * 99);
			}
			
			
			
		}

		
		
		 System.out.println("Elements in Matrix are : ");
         System.out.println("");
			for(int i=0;i<=2;i++)
			{
			for(int j=0;j<=2;j++)
			{
			System.out.print(array[i][j]+"\t");
			}
			System.out.println();
			}
			
		}catch(Exception e) {
			
			System.out.println("Some error");
		}

		

	}

}