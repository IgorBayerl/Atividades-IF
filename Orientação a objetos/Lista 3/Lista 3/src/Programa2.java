import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
        String nome;
        int nota1 , nota2 ;

        System.out.println("Digite uma nome: ");
        nome = input.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextInt();
        
        System.out.println(nome);
        System.out.println("A media de " + nome + " é " + ((nota1+nota2)/2));
        
        

	}

}