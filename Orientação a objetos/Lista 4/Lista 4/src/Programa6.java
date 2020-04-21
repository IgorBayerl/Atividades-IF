import java.util.*;

public class Programa6 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.print("Insira um numero: ");
			int code = myObj.nextInt();
			
			
			intArray[i] = code;
			
		}
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			
			if(intArray[i] > x) {
				x = intArray[i];
				y = i;
			}
			
			
			
		}
		
		System.out.println(x + " encontrado na posição "+ y);
		
		
		
		
		
	}

}
