import java.util.*;


public class Programa8 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        
        String stringNormal;
            
        
        System.out.println(" Digite uma palavra: ");
        stringNormal = entrada.next();
        
        StringBuffer numero = new StringBuffer(stringNormal);
      
        
        if(stringNormal.equals(numero.reverse().toString())) 
      	System.out.printf("  %s � um pal�ndromo.", stringNormal);
        else
      	System.out.printf("  %s n�o � um pal�ndromo.", stringNormal);
        
  
	}

}