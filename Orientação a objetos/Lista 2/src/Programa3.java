import java.util.*;

public class Programa3 {

	public static void main(String[] args) {

		int valorpar;
		System.out.print("Entre com um valor par: ");
		Scanner sc = new Scanner (System.in);
		valorpar = sc.nextInt();
			
			if((valorpar % 2)==0 ) {
				System.out.print("O valor par é = ");
				
				for (int i = valorpar; i< (valorpar + 22); i=i+2) {
					System.out.println(i);
				}
				
				
			}else {
				System.out.print("O valor não é par");
			}
	}

}
