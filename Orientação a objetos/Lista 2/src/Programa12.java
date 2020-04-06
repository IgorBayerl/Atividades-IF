import java.util.Scanner;

public class Programa12 {
	

    
    public static void main(String[] args) {
    	
    	int funcionarios;
    	
    	
    	
    	System.out.print("Entre com o valor de funcionarios : ");
		Scanner sc1 = new Scanner (System.in);
		funcionarios = sc1.nextInt();
		
		String[] nome = new String[funcionarios];
        int tempo ;
        
        Scanner sc2 = new Scanner(System.in);
        
        
        for (int i = 0; i < funcionarios; i++) {
            System.out.println("Digite o nome: ");
            nome[i] = sc2.next();
            System.out.println("Digite o tempo de empresa ( MESES ):");
            tempo = sc2.nextInt();
            if(tempo > 12) {
            	System.out.print(nome + " Tem direito a ferias");
            }else {
            	System.out.print(nome + " Não tem direito a ferias");
            }
        }
  
    	
    }
}

