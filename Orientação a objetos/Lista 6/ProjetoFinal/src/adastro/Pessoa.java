package adastro;

public class Pessoa {
	private String nome;
	private int idade;
	private int id;
	
	Pessoa(int id, String n, int i){
		this.id = id;
		this.nome = n;
		this.idade = i;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	public void setIdade(int i) {
		this.idade = i;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setId(int id) {
		System.out.println(id);
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
}
