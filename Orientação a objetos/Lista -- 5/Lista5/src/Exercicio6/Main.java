package Exercicio6;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Lampada lampada = new Lampada();
		int response ;
		
	    System.out.println("digite 1 para acenter a lampada e 2 para apagar");
	    response = leia.nextInt(); 
	    
	    if (response == 1) {
	    	lampada.acesa = true;
	    }
	    if (response == 2) {
	    	lampada.acesa = false;
	    }
		
	    System.out.println("is lamp on ? : "+ lampada.acesa);
		}

}
