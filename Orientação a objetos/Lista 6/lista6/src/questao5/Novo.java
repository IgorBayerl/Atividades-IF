package questao5;


public class Novo extends Imovel {
	
	
	
	private static float acrescimo = 5;
	
	public Novo(float acrescimo) {
		super(acrescimo, null);
		Novo.acrescimo = acrescimo;
		
	}
	public float getAcrescimo() {
		return Novo.acrescimo;
	}
	public static void main(String[] args) {
        Novo n = new Novo(acrescimo);
        n.getPreco();
        n.adicionaPreco(11);
        System.out.println(n.getPreco());
    }
	private void adicionaPreco(int i) {
		
		
	}
}

