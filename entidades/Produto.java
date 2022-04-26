package entidades;

public class Produto {

	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////
	
	public double ValorTotalEmEstoque() {
		return preco * qtd;
	}
	
	public void AdicionarProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public void RemoverProduto(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return "Dados do Produto: " 
				+ nome 
				+ ", R$ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ qtd 
				+ " unidades, Total: R$ " 
				+ String.format("%.2f", ValorTotalEmEstoque());
	}
}
