import java.util.*;
import java.io.*; 


public class Programa1 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
        String palavra ;
        char[] letras = null;
        

        System.out.println("Digite uma nome: ");
        palavra = input.nextLine();
        
        
        letras = palavra.toCharArray();
        
        String stringUnica = Arrays.toString(letras);
        String stringNova = stringUnica.replace("[", "");
        String stringNovaNova = stringNova.replace("]", "");
        
        
        
        System.out.println(stringNovaNova);

        ///////////////////////////////////////////////
        
         
        char[] temparray = stringNovaNova.toCharArray(); 
        int left, right=0; 
        right = temparray.length-1; 
  
        for (left=0; left < right ; left++ ,right--) 
        { 
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right]=temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
         	System.out.println(); 
        ////////////////////////////////////////////
        
        int i = 0;
        int e = 3;
        
        while (i<letras.length) {
        	if(e!=0) {
        		System.out.print(letras[i]);
        		i++;
        		e--;
        	}else {
        		System.out.print(",");
        		e = 3;
        	}
		}
	}

}