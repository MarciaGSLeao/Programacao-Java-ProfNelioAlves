package entidades;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double TotalDePontos() {
		return n1+n2+n3;
	}
	
	public double PontosFaltantes() {
		
		if (this.TotalDePontos() < 60) {
			return 60 - this.TotalDePontos();
		}else {
			return 0.0 ;
		}
	}
	
}
