package exercicio1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	Livro livro = new Livro();
	
    System.out.println("Insira as palavras");
    livro.palavras = leia.nextLine(); 
	
    System.out.println("Insira o numero de paginas ");
    livro.Numero_de_paginas = leia.nextInt();	
    
    System.out.println("Insira o nome do autor ");
    livro.nome_do_autor = leia.next();
    
    System.out.println("Insira o titulo do livro");
    livro.Titulo = leia.next();  
    

    

    
    System.out.println("Livro feito por: " + livro.nome_do_autor + " /titulo: " + livro.Titulo + " /contem " + livro.Numero_de_paginas + " paginas");
    System.out.println("conteudo: " + livro.palavras);
    
	}
	

}
