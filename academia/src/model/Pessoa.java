package model;

public class Pessoa {
	private int _id;
	private String nome;
	private double peso;
	private double altura;
	
	Pessoa (String nome, int _id, double peso, double altura) {
		this.nome = nome;
		this._id = _id;
		this.peso = peso;
		this.altura = altura;
	}
}
