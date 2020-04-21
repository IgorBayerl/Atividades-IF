import java.util.*;

public class Programa4 {

	public static void main(String[] args) {
		/*
		String palavra [] = {"b","a","n","a","n","a"};
		
		
		int jogo = 1, ganhou = 0, perdeu = 0, cont = 0;
		String digito, lDigitadas[] = new String[20];
		System.out.println("Dica: fruta");
		while (jogo == 1) {
			int ep=0;
			System.out.println("digite a letra: ");
			digito = in.next();
			lDigitadas[cont] = digito ;
			for (int i = 0; i < lDigitadas.length; i++) {
				if ( lDigitadas[i] != null) {
					if (lDigitadas[i].equals(digito)) {
						ep++;
					}
				}
			}
			for (int p = 0; p<palavra.length; p++) {
				if (palavra[p].equals(digito)) {
					System.out.println("Correto, proxima letra");
					ganhou++;
					break;
					
				}else {
					if (p == 4) {
						System.out.println("Mano essa letra não exite ! ");
						perdeu++;
						
					}
					if (perdeu == 10) {
						System.out.println("Perdeu");
						System.exit(0);
						
					}else if (ganhou == 5) {
						System.out.println("Ganhou");
						System.out.println(palavra);
						System.exit(0);
					}
				}
			}
		}
		*/
		String[] chave = {"ZENITPOLAR"};
		String[] word = {"DANILO"}; 

		if(chave[0].equals(word[0]))//se as Strings forem iguais
		{
		        System.out.println("Acesso permitido!");
		    }else{
		        System.out.println("Acesso negado!");
		}
		
		
		
		
	}

}
