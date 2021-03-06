package model;

public class Diretor extends Funcionario {
	private float beneficio;
	
	public Diretor(String nome, String email, float salario, float beneficio) {
		super(nome, email, salario);
		this.beneficio = beneficio;
	}
	
	public float getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(float beneficio) {
		this.beneficio = beneficio;
	}
	
	public String imprimirInfo() {
		return "Diretor	"+super.imprimirInfo()+" Beneficio R$ "+this.beneficio;
	}
	
}
