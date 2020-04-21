import java.util.*;

public class Programa5 {
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Insira o codigo");
		String pass = myObj.nextLine();
		


		
		String[] strArray = pass.split("");
		
		int x = 0;
		
		for(int j = 0; j<=10;j++) {
			System.out.println("tentativa "+ j);
			System.out.println("Insira a letra, voce nao pode escolher a mesma letra duas vezes");
			String word = myObj.nextLine();
	
		for (int i = 0; i < strArray.length; i++) {
			
			
			
			if(strArray[i].equals(word)) {
				System.out.println("letra " + strArray[i]+ " encontrada na posicao " + i+"\n");
				x++;
				
			}
			
			}
		
	}
		
		System.out.println("Pontos: " + x);
		
	}
}
