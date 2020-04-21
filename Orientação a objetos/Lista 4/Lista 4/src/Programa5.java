import java.util.*;


public class Programa5 {

	public static void main(String[] args) {
		
		int[] numeros;
		int[] numerosPositivos;
		int[] numerosNegativos;
		
		int numeroP = 0;
        int numeroI = 0;
        
        numeros = new int[10];
        numerosPositivos = new int[numeros.length];
        numerosNegativos = new int[numeros.length];
        
        
        
        int x;
        System.out.print("Voce ira digitar 10 numeros: ");
        for(int i = 0; i<numeros.length ; i++  ) {
        	System.out.print("Digite numeros");
    		Scanner sc = new Scanner (System.in);
    		x = sc.nextInt();
    		
    		numeros [i] = x;
    		
    		if(x > 0) {
    			numerosPositivos [numeroP] = x;
    			numeroP ++;
    		}else {
    			numerosNegativos [numeroI] = x;
    			numeroI++;
    		}
    		
    		
        }        
        
        System.out.println("\n Numeros Digitados");
        for(int i=0; i<numeros.length; i++){
    		System.out.print( " - " + numeros[i]);
    		
    	}
        System.out.println("\n Numeros Positivos");
        for(int i=0; i<numerosPositivos.length; i++){
        	if (numerosPositivos[i] != 0) {
    		System.out.print( " - " + numerosPositivos[i]);
        	}
    		
    	}
        System.out.println("\n Numeros Impares");
        for(int i=0; i<numerosNegativos.length; i++){
        	if (numerosNegativos[i] != 0) {
    		System.out.print( " - " + numerosNegativos[i]);
        	}
    		
    	}
		
	}
}
