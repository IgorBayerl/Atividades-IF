import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {

		int quantidade;
		
		System.out.print("Entre com a quantidade de animais : ");
		Scanner sc1 = new Scanner (System.in);
		quantidade = sc1.nextInt();
		
		int dog = 0;
		int cat = 0;
		
		for (int i = 0; i<quantidade; i++) {
			
			int x;
			System.out.println("Destes animais ... digite 1 para cachorro e 2 para gato  ");
			System.out.println("animal " + i );
			Scanner sc2 = new Scanner (System.in);
			x = sc2.nextInt();
			if(x == 1) {
				dog ++;
			}
			if(x == 2) {
				cat ++;
			}
			
		}
		System.out.println(" Cachorros : " + dog );
		System.out.println(" Gatos : " + cat );
		System.out.println(" Total : " + (dog+cat) );
				
			
	}

}
