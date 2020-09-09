package Exercicio8;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Contador contador = new Contador();
		
	    System.out.println("Insira o Nome do animal");
	    contador.valor = leia.nextInt(); 
		

	    System.out.println("valor: " + contador.valor);
	    
		}

}
