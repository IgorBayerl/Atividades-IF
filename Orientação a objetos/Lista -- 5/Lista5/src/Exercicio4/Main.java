package Exercicio4;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ComparaNum comparaNum = new ComparaNum();
		
	    System.out.println("insira o primerio numero ");
	    comparaNum.Num1 = leia.nextInt(); 
		
	    System.out.println("insira o segundo numero ");
	    comparaNum.Num2 = leia.nextInt();	
	    
	    if (comparaNum.Num1 == comparaNum.Num2) {
	    	System.out.println( "Os dois numeros digitados são identicos : "+ comparaNum.Num1 );
	    }else {
	    	if(comparaNum.Num1 % 2 == 0) {
	    		System.out.println(comparaNum.Num1+ " é par");
	    	}else {
	    		System.out.println(comparaNum.Num1+ " é impar");
	    	}
	    	if(comparaNum.Num2 % 2 == 0) {
	    		System.out.println(comparaNum.Num2+ " é par");
	    	}else {
	    		System.out.println(comparaNum.Num2+ " é impar");
	    	}
	    }
	    
	    
	}

}
