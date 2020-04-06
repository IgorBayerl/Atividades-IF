import java.util.*;

public class Programa7 {

	public static void main(String[] args) {

		int x;
		
		System.out.print("Digite valores positivos... para parar digite ´0´ ");
		Scanner sc1 = new Scanner (System.in);
		x = sc1.nextInt();
		
		int menor = x;
		int maior = x;
			
		while (x != 0) {
			System.out.print("Digite valores positivos... para parar digite ´0´ ");
			Scanner sc2 = new Scanner (System.in);
			x = sc2.nextInt();
			if(x > maior) {
				maior=x;
			}
			if(x != 0) {
				if(x < menor) {
					menor=x;
				}
			}
			
		}
		System.out.println("O maior valor é :"+ maior);
		System.out.println("O menor valor é :"+ menor);
				
			
	}

}
