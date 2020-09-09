package exercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Texto texto = new Texto();
		
	    System.out.println("Insira a frase");
	    texto.frase = leia.nextLine(); 
	   
	    
	    System.out.println(texto.inverter());
	    
	    texto.inverterOrdem();
	    
	    texto.palindromo();
	    
	    System.out.println("Insira a palavra");
	    texto.palavra = leia.nextLine(); 
	    
	    texto.encontrarPalavra();
		
	}

}
