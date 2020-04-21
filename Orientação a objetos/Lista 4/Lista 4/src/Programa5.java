import java.util.*;


public class Programa5 {

	public static void main(String[] args) {
		
		int[] numeros;
		
		boolean[] numerosTF;
	
        
        numeros = new int[10];
        numerosTF = new boolean[numeros.length];
        
     
        
        
        
        int x;
        System.out.print("Voce ira digitar 10 numeros: ");
        for(int i = 0; i<numeros.length ; i++  ) {
        	System.out.print("Digite numeros");
    		Scanner sc = new Scanner (System.in);
    		x = sc.nextInt();
    		
    		numeros [i] = x;
    		
    		if(x > 0) {
    			numerosTF [i] = true;
    			
    		}else {
    			numerosTF [i] = false;
    		
    		}
    		
        }        
        
        System.out.println("\n Resultado");
        for(int i=0; i<numerosTF.length; i++){
    		System.out.println( " - " + numerosTF[i]);
    		
    	}
        
		
	}
}
