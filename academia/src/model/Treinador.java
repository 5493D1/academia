package model;

public class Treinador extends Pessoa {
	private double salario;
	private String especializacao;
	private String horario;
	
	Treinador (String name, int _id, double peso, double altura, double salario, String especializacao, String horario) {
		super(name, _id, peso, altura);
		this.salario = salario;
		this.especializacao = especializacao;
		this.horario = horario;
	}
}
