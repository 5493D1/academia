package view;

import java.util.Scanner;
import java.util.ArrayList;

import model.Cliente;
import model.Pessoa;

public class AcademiaView {
	int _idIndex = 1;
	private Scanner entrada;
    private ArrayList<Pessoa> pessoas;
    
	int opcoes () {
		System.out.println("** Bem-vindo a Academia Digital**\n");
		System.out.println("** O que vc deseja fazer? **\n");
		System.out.println("** 1 - Cadastrar usuários**\n");
		System.out.println("** 2 - Ver usuárioss**\n");
		System.out.println("** 3 - Deletar usuários**\n");
		
		entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		
		return opcao;
	}
	
	void realizaOperacao (int opcao) {
		switch(opcao) {
			case 1: {
				System.out.println("**Qual o tipo do usuario?**\n");
				System.out.println("** 1 - Cliente**\n");
				System.out.println("** 2 - Treinador**\n");
				
				entrada = new Scanner(System.in);
				int opcaoUsuario = entrada.nextInt();
				
				System.out.println("Digite o nome : \n");
				String nome = entrada.nextLine();
				
				System.out.println("Digite o peso\n");
				double peso = entrada.nextDouble();
				
				System.out.println("Digite a altura\n");
				double altura = entrada.nextDouble();
				
				if (opcaoUsuario == 1) {
					System.out.println("Digite o plano desejado\n ");
					System.out.println("** 1 - Musculação**\n");
					System.out.println("** 2 - Musculação e aeróbica**\n");
					System.out.println("** 3 - musculação,  aeróbica, e luta**\n");
					int plano = entrada.nextInt();
					
					pessoas.add(new Cliente(nome, this._idIndex, peso, altura, plano));
					this._idIndex++;
				} else if (opcaoUsuario == 2) {
					
				} else {
					System.out.println("Opção incorreta!\n");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		AcademiaView academia = new AcademiaView();
		int opcao = academia.opcoes();
		academia.realizaOperacao(opcao);
	}

}
