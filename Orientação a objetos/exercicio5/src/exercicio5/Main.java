package exercicio5;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		DataT data = new DataT();
		
	    System.out.println("Insira o ano 1");
	    Integer ano1 = leia.nextInt(); 
	    
	    System.out.println("Insira o mes 1");
	    Integer mes1 = leia.nextInt(); 
	    
	    System.out.println("Insira o dia 1");
	    Integer dia1 = leia.nextInt(); 
	    
	    System.out.println("Insira o ano 2");
	    Integer ano2 = leia.nextInt(); 
	    
	    System.out.println("Insira o mes 2");
	    Integer mes2 = leia.nextInt(); 
	    
	    System.out.println("Insira o dia 2");
	    Integer dia2 = leia.nextInt(); 
	    
	    data.verificar(ano1, mes1, dia1, ano2, mes2, dia2);
	    
	    
		
		
		
		
	}
}
