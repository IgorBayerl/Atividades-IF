import java.util.*;


public class Programa4 {
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Insira o codigo");
		String pass = myObj.nextLine();
		
		System.out.println("Insira a letra");
		String word = myObj.nextLine();

		
		String[] strArray = pass.split("");
		
		
	
		for (int i = 0; i < strArray.length; i++) {
			
			if(strArray[i].equals(word)) {
				System.out.println("letra " + strArray[i]+ " encontrada na posicao " + i);
			}
			
			}
		
	}
}
