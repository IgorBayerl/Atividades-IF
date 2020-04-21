import java.util.*;

public class Programa10 {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Insira o nome");
		String pass = myObj.nextLine();
		
		String[] strArray = pass.split("");
		
		int x = strArray.length-1;
		
		for (int i = x; i >= 0; i--) {
			
			System.out.println(strArray[i]);
			
		}
		
	}

}
