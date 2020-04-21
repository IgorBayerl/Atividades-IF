import java.util.*;

public class Programa8 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.print("Insira um numero: ");
			int code = myObj.nextInt();
			
			
			intArray[i] = code;
			
		}
		
		int[] intArray2 = new int[5];
		
		intArray2[0] = intArray[0] + intArray[9];
		intArray2[1] = intArray[1] + intArray[8];
		intArray2[2] = intArray[2] + intArray[7];
		intArray2[3] = intArray[3] + intArray[6];
		intArray2[4] = intArray[4] + intArray[5];
		
		for (int i = 0; i < intArray2.length; i++) {
			 
			System.out.println(intArray2[i]);
			
		}
		
	}

}
