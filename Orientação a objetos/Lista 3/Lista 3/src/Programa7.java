import java.util.*;

public class Programa7 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Insira a palavra");
		String pass = myObj.nextLine();
		
		String[] strArray = pass.split("");
		
		int x = 0;
		
		for (int i = 0; i < strArray.length; i++) {
			
			if(strArray[i].toUpperCase().equals("Q") || strArray[i].toUpperCase().equals("Z")) {
				x = x+10;
			}
			
			if(strArray[i].toUpperCase().equals("J") || strArray[i].toUpperCase().equals("X")) {
				x = x+8;
			}
			
			if(strArray[i].toUpperCase().equals("K") ) {
				x = x+5;
			}
			
			if(strArray[i].toUpperCase().equals("F") || strArray[i].toUpperCase().equals("H")
					|| strArray[i].toUpperCase().equals("V")|| strArray[i].toUpperCase().equals("W")
					|| strArray[i].toUpperCase().equals("Y")
					) {
				x = x+4;
			}
			
			if(strArray[i].toUpperCase().equals("B") || strArray[i].toUpperCase().equals("C")
					|| strArray[i].toUpperCase().equals("M")|| strArray[i].toUpperCase().equals("P")) {
				x = x+3;
			}
			
			if(strArray[i].toUpperCase().equals("D") || strArray[i].toUpperCase().equals("G")) {
				x = x+2;
			}
			
			if(strArray[i].toUpperCase().equals("A") || strArray[i].toUpperCase().equals("E")
					|| strArray[i].toUpperCase().equals("I")|| strArray[i].toUpperCase().equals("L")
					|| strArray[i].toUpperCase().equals("N")|| strArray[i].toUpperCase().equals("O")
					|| strArray[i].toUpperCase().equals("R")|| strArray[i].toUpperCase().equals("S")
					|| strArray[i].toUpperCase().equals("T")|| strArray[i].toUpperCase().equals("U")
					) {
				x = x+1;
			}
			
			
		}
		
		System.out.println("Pontos da palavra: " + x);
		
	}

}
