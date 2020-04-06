import java.util.*;

public class Programa10 {

	public static void main(String[] args) {

		int x;
		
		System.out.print("Digite valores positivos ou negativos... para parar digite ´0´ ");
		Scanner sc1 = new Scanner (System.in);
		x = sc1.nextInt();
		
		int somaPositivos = 0;
		int somaNegativos = 0;
			
		while (x != 0) {
			System.out.print("Digite valores positivos ou negativos... para parar digite ´0´ ");
			Scanner sc2 = new Scanner (System.in);
			x = sc2.nextInt();
			if(x > 0) {
				somaPositivos = somaPositivos + x;
			}
			
			if(x < 0) {
				somaNegativos = somaNegativos + x	;
			}
			
		}
		System.out.println("Soma dos positivos é :"+ somaPositivos);
		System.out.println("Soma dos negativos é :"+ somaNegativos);
		System.out.println("Soma total é :"+ (somaPositivos + somaNegativos));
				
			
	}

}