import java.util.*;

public class Programa7 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.print("Insira um numero: ");
			int code = myObj.nextInt();
			
			
			intArray[i] = code;
			
		}
		
		for (int i = 0; i < intArray.length; i++) {
			
				if(intArray[i]%2 == 0)
				{ 
					intArray[i] = 1;
				}else {
					intArray[i] = -1;
				}
				
			
		}
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.println(intArray[i]);
			
		}
		
		
	}

}
