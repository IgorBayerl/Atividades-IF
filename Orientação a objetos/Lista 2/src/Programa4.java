import java.util.*;

public class Programa4 {

	public static void main(String[] args) {

		int valor;
		System.out.print("Entre com um valor de 2 a 10 : ");
		Scanner sc = new Scanner (System.in);
		valor = sc.nextInt();
			
			
				System.out.print("Tabuada de = ");
				
				System.out.println(valor);
				for (int i = valor; i< (valor+(valor * 10)); i=i+valor) {
					System.out.println(i);
				}
				
				
	}

}
