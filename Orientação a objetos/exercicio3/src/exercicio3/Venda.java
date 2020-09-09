package exercicio3;

public class Venda {

	public double lucro;
	
    public void calcular(double compra){
    	if(compra < 10) lucro = compra*0.70;
    	if(compra >= 10 && compra<30) lucro = compra*0.50;
    	if(compra >= 30 && compra<50) lucro = compra*0.40;
    	if(compra >= 50) lucro = compra*0.30;
    	
    	System.out.println(lucro);
    }  
	
	

}
