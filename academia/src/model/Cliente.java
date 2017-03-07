package model;

public class Cliente extends Pessoa {
	private int plano;
	
			
	public Cliente (String nome, int _id, double peso, double altura, int plano) {
		super(nome, _id, peso, altura);
		this.plano = plano;
	}
}
