import java.util.*;

public class Programa3 {

	public static void main(String[] args) {
		
		int tamanhoDoVetor;
		
		System.out.print("Digite o tamanho do vetor: ");
		Scanner sc = new Scanner (System.in);
		tamanhoDoVetor = sc.nextInt();
		
		int[] numeros;
        
        numeros = new int[tamanhoDoVetor];
        
        int x;
		
        for(int i = 0; i<numeros.length ; i++  ) {
        	System.out.print("Digite numeros: ");
    		Scanner sc1 = new Scanner (System.in);
    		x = sc1.nextInt();
    		
    		numeros [i] = x;
        }
        System.out.println();
        
        for(int i=0; i<numeros.length; i++){
    		System.out.println("posicao " + (i) + " = " +numeros[i] );
    		
    	}
		
	}
}
