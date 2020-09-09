package Exercicio10;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		int idEleitor;
		int voto;

		Scanner leia = new Scanner(System.in);
		
		Urna urna = new Urna();
		
		
		do{
			System.out.println("Digite seu numero do titulo de eleitor: ..");
			idEleitor = leia.nextInt();
			
			
			if(idEleitor > 0 ) {
				System.out.println("Vote 1 para joão ou 2 para marcos");
			    voto = leia.nextInt();
				
				switch(voto) {
				  case 1:
				    	urna.numeroDeVotos1++;
				    break;
				  case 2:
					  urna.numeroDeVotos2++;
				    break;
				  default:
					  System.out.println("Voto nulo...");
				}
				
			}
			
			
		}while(idEleitor >0 );
		
		System.out.println("o resultado foi ...");
		System.out.println("candidato 1 == " + urna.numeroDeVotos1);
		System.out.println("candidato 1 == " + urna.numeroDeVotos2);
		
		}

}
