import java.util.*;

public class Programa11 {
	
	

    
    public static void menu(){
        System.out.println("\tEscolha a opera��o");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Opcao:");
    }

    
    public static void main(String[] args) {
    	
    	int x;
    	int y;
  
    	
    	System.out.print("Entre com um valor x : ");
		Scanner sc1 = new Scanner (System.in);
		x = sc1.nextInt();
		
		System.out.print("Entre com um valor y : ");
		Scanner sc2 = new Scanner (System.in);
		y = sc2.nextInt();
		
		
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        
        menu();
        opcao = entrada.nextInt();
            
        switch(opcao){
            case 1:
            	System.out.println("Voc� entrou no m�todo Soma");
                System.out.println(x+"+"+y+"="+(x+y));
                break;
                
            case 2:
            	System.out.println("Voc� entrou no m�todo Subtrai.");
                System.out.println(x+"-"+y+"="+(x-y));
                break;
            case 3:
            	System.out.println("Voc� entrou no m�todo Multiplica��o.");
                System.out.println(x+"x"+y+"="+(x*y));
                break;
                
            case 4:
            	System.out.println("Voc� entrou no m�todo Divide .");
                System.out.println(x+"/"+y+"="+(x/y));
                break;
            
            default:
                System.out.println("Op��o inv�lida.");
            }
    }
}