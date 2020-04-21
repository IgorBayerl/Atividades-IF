import java.util.*;


public class Programa4 {

	public static void main(String[] args) {
		
		int[] numeros;
		int[] numerosPares;
		int[] numerosImpares;
		
		int numeroP = 0;
        int numeroI = 0;
        
        numeros = new int[10];
        numerosPares = new int[numeros.length];
        numerosImpares = new int[numeros.length];
        
        
        
        int x;
        System.out.print("Voce ira digitar 10 numeros: ");
        for(int i = 0; i<numeros.length ; i++  ) {
        	System.out.print("Digite numeros");
    		Scanner sc = new Scanner (System.in);
    		x = sc.nextInt();
    		
    		numeros [i] = x;
    		
    		if(x % 2 == 0) {
    			numerosPares [numeroP] = x;
    			numeroP ++;
    		}else {
    			numerosImpares [numeroI] = x;
    			numeroI++;
    		}
    		
    		
        }        
        
        System.out.println("\n Numeros Digitados");
        for(int i=0; i<numeros.length; i++){
    		System.out.print( " - " + numeros[i]);
    		
    	}
        System.out.println("\n Numeros Pares");
        for(int i=0; i<numerosPares.length; i++){
        	if (numerosPares[i] != 0) {
    		System.out.print( " - " + numerosPares[i]);
        	}
    		
    	}
        System.out.println("\n Numeros Impares");
        for(int i=0; i<numerosImpares.length; i++){
        	if (numerosImpares[i] != 0) {
    		System.out.print( " - " + numerosImpares[i]);
        	}
    		
    	}
		
	}
}


