package exercicio5;

public class DataT {
	
    public void verificar(int ano1, int mes1, int dia1, int ano2, int mes2, int dia2){
    	
    	if(ano1 < ano2 ) System.out.println("primeira data vem antes da segunda");
    	if(ano1 > ano2 ) System.out.println("a primeira data vem depois da segunda");
    	if(ano1 == ano2 && mes1 < mes2) System.out.println("a primeira data vem antes da segunda");
    	if(ano1 == ano2 && mes1 > mes2) System.out.println(" primeira data vem depois da segunda");
    	if( ano1 == ano2 && mes1 == mes2 && dia1 < dia2 ) System.out.println("a primeira data vem antes da segunda");
    	if( ano1 == ano2 && mes1 == mes2 && dia1 > dia2 ) System.out.println("primeira data vem depois da segunda");
    	if(ano1 == ano2 && mes1 == mes2 && dia1 == dia2) System.out.println("Datas iguais!");
    	
    	
 
    }  

}
