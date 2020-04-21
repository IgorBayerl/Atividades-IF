import java.util.*;

public class Programa5 {

	public static void main(String[] args) {
		
		int[] numeros;
        
        numeros = new int[10];
        
        int x;
        System.out.print("Voce ira digitar 10 numeros: ");
        for(int i = 0; i<numeros.length ; i++  ) {
        	System.out.print("Digite numeros");
    		Scanner sc = new Scanner (System.in);
    		x = sc.nextInt();
    		
    		numeros [i] = x;
        }
        System.out.println();
        
        for(int i=0; i<numeros.length; i++){
    		System.out.println("posicao " + (i) + " = " +numeros[i] );
    		
    	}
        
		
	}
}
