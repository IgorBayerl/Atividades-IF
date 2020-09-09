package exercicio2;

public class Texto {
	
	public String frase;
	public String palavra;
	
    public StringBuffer inverter(){
        StringBuffer frase_invertida= new StringBuffer(frase);
        return frase_invertida.reverse();
    }  

    public void inverterOrdem(){
    	String teste = frase;
    	String[] a = teste.split(" ");

    	for(int i=a.length-1; i >= 0; i--)
    	   System.out.print(a[i] + " ");
    } 
    
    public void palindromo() {
        String st = frase;
        String stAux = st.replaceAll("\\s+", "");

        String stReverse = new StringBuilder(stAux).reverse().toString();
        String stReverseAux = new StringBuilder(st).reverse().toString();
        
        System.out.println(" ");

        if (stAux.equals(stReverse))
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");
    }
    
    public void encontrarPalavra()
    {
        String texto = frase;
        String procurarPor = palavra;

        System.out.println(texto.toLowerCase().contains(procurarPor.toLowerCase()));
    }
    
}
