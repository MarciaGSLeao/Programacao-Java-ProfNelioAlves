package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double descontos;
	
	public String toString() {
		double salarioLiquido = salarioBruto - descontos;
		return "Dados do Funcion�rio \nNome: "
				+ nome 
				+ "\nSal�rio Bruto: R$ "
				+ salarioBruto
				+ "\nSal�rio L�quido: R$ "
				+ salarioLiquido;
	}
	
	public void AplicarAumento(double percentual) {
		this.salarioBruto = salarioBruto*(1 + percentual/100);
	}
}
