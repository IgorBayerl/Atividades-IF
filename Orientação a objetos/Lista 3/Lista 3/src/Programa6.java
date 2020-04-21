import java.util.*;

public class Programa6 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Insira o codigo");
		String pass = myObj.nextLine();
	

		
		String[] strArray = pass.split("");
		
		String[] strArray2= pass.split("");
		
	
		
		for (int i = 0; i < strArray.length; i++) {
			
			strArray2[i] = "-";
			
			
		}
		
		
		for(int j = 0; j<=10;j++) {
			
			System.out.println("Insira a letra");
			String word = myObj.nextLine();
	
		for (int i = 0; i < strArray.length; i++) {
			
			
			
			
			if(strArray[i].equals(word)) {
				
				
				strArray2[i] = word;
				
				for (int k = 0; k < strArray2.length; k++) {
					
					System.out.print(strArray2[k]);
					
				}
				
				System.out.println(" ");
				
			    }
			
			
			}
	   }

		

		
		
	}

}
