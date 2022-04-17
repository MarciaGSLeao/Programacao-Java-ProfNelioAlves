package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double descontos;
	
	public String toString() {
		double salarioLiquido = salarioBruto - descontos;
		return "Dados do Funcionário \nNome: "
				+ nome 
				+ "\nSalário Bruto: R$ "
				+ salarioBruto
				+ "\nSalário Líquido: R$ "
				+ salarioLiquido;
	}
	
	public void AplicarAumento(double percentual) {
		this.salarioBruto = salarioBruto*(1 + percentual/100);
	}
}
