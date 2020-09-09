package Exercicio2;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		Animal animal = new Animal();
		
	    System.out.println("Insira o Nome do animal");
	    animal.Nome = leia.nextLine(); 
		
	    System.out.println("Insira o peso do animal ");
	    animal.peso = leia.nextInt();	
	    
	    System.out.println("Insira a especie do animal ");
	    animal.especie = leia.next();
	    
	    

	    
	    System.out.println("Nome do animal: " + animal.Nome + "  -- peso do animal: " + animal.peso );
	    System.out.println("especie: " + animal.especie);
	    
		}

}
