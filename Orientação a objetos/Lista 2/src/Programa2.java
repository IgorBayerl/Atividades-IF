import java.util.*;

public class Programa2 {

	public static void main(String[] args) {

		int valor;
		System.out.print("Entre com um valor: ");
		Scanner sc = new Scanner (System.in);
		valor = sc.nextInt();
			
			if(valor == 0 ) {
				System.out.print("O valor � === NULO === ");
				
			}else {
				if(valor > 0) {
				System.out.print("O valor � === POSITIVO ===");
				} else {
				System.out.print("O valor � === NEGATIVO ===");
			}}
	}

}
