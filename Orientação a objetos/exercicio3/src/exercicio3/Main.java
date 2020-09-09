package exercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Venda venda = new Venda();
		
	    System.out.println("Insira o valor de compra");
	    Integer compra = leia.nextInt(); 
	    
	    venda.calcular(compra);
		
	}

}
