package questao5;

public class Velho extends Imovel {
	private float desconto = 5;
	public Velho(float desconto) {
		this.desconto = desconto;
	}
	public float getDesconto() {
		return this.desconto;
	}
}
