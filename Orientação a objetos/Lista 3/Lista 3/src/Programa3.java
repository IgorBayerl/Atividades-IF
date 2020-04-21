import java.util.*;

public class Programa3 {

	public static void main(String[] args) {

		ArrayList Alunos = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		 for(int i = 0 ; i<2;i++ ) {

		  System.out.println("Digite o nome: ");
		  String nome = sc.nextLine();
		  
		  Alunos.add(nome);
		  
		}
		 Collections.sort(Alunos);  
		 System.out.println(Alunos);
	}

}