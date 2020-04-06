import java.util.Scanner;

public class Programa14 {
    
    public static void menu(){
        System.out.println("\tMENU");
        System.out.println("1 - 10 Primeiros numeros primos.");
        System.out.println("2 - 10 Primeiros numeros pares.");
        System.out.println("3 - 10 Primeiros numeros impares.");
        System.out.println("4 - 10 Primeiros numeros de Fibonacci.");
        System.out.println("5 - Sair");
        System.out.println("Opcao:");
    }

    public static void primos(){
        System.out.println("10 Primeiros numeros primos.");
        
        int numerosImpressos = 10;

        for (int i = 2; numerosImpressos > 0; i++) {
            boolean ehPrimo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i );
                numerosImpressos --;
            } 
        }
 
        

    }
    
    public static void pares(){
        System.out.println("10 Primeiros numeros pares.");
        int numerosImpressos = 10;
        for (int i = 2; numerosImpressos > 0; i=i+2) {
			System.out.println(i);
			numerosImpressos --;
		}
    }
    
    public static void impares(){
        System.out.println("10 Primeiros numeros impares.");
        int numerosImpressos = 10;
        for (int i = 1; numerosImpressos > 0; i=i+2) {
			System.out.println(i);
			numerosImpressos --;
		}
    }
    
    public static void fibonacci(){
        System.out.println("10 Primeiros numeros de Fibonacci.");
        int n1 = 0;
        int n2 = 1;
        int nr =n1 + n2;
        int numerosImpressos = 10;
        for (int i = 1; numerosImpressos > 0; i=i+2) {
        	nr =n1 + n2;
        	n1 = n2;
        	n2 = nr;
			System.out.println(nr);
			numerosImpressos --;
		}
    }
    
    public static void main(String[] args) {
    	
    	
		
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
            	primos();
                break;
                
            case 2:
            	pares();
                break;
                
            case 3:
            	impares();
                break;
                
            case 4:
            	fibonacci();
                break;
            
            case 5:
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 5);
    }
}