package entidades;

public class Produto {

	public String nome;
	public double preco;
	public int qtd;
	
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
