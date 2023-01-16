package lambdas.consumer;

public class Produto {
	public String nome;
	public double preco;
	public double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return "Nome: " + nome + " tem preço R$ " + precoFinal;
	}
	
}
