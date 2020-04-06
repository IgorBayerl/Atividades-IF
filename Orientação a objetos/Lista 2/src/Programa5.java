import java.util.*;

public class Programa5 {

	public static void main(String[] args) {

		int x;
		int y;
		
		System.out.print("Entre com um valor x : ");
		Scanner sc1 = new Scanner (System.in);
		x = sc1.nextInt();
		
		System.out.print("Entre com um valor y : ");
		Scanner sc2 = new Scanner (System.in);
		y = sc2.nextInt();
			
			
			System.out.print(x + " elevado a "+ y + " é igual a :"+ Math.pow(x, y) );
				
			
	}

}
