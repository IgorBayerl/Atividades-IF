import java.util.*;

public class Programa8 {

	public static void main(String[] args) {

		int x;
		
		System.out.print("(0)Masculino (1)Feminino");
		Scanner sc1 = new Scanner (System.in);
		x = sc1.nextInt();
		
		if(x == 0) {
			System.out.println("Seja bem-vindo, Senhor!");
			
		}
		if(x == 1) {
			System.out.println("Seja bem-vinda, Senhora!");
			
		}
	}

}