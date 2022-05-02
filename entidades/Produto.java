package entidades;

public class Produto {

	private String nome;
	private double preco;
	private int qtd;
	
	// Construtor Padr�o Java sem especifica��o de par�metros
	public Produto() {
	}
	
	// Definindo um Construtor Java especificando par�metros.
	public Produto (String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		// Neste exemplo de construtor, como n�o foi passado o par�metro de quantidade,
		// a mesma vai ser inicializada com o valor zerado.
	}

	// Defininfo Getters e Setters para manipula��o de valores dos atributos.
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
	//   Atributo  = par�metro de entrada;
	}
	
	public int getQtd() {
		return qtd;
	}
	
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
