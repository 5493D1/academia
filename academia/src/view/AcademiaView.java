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
		System.out.println("** bem-vindo a academia digital**\n");
		System.out.println("** Oque vc deseja fazer? **\n");
		System.out.println("** 1 - cadastrar usu�rios**\n");
		System.out.println("** 2 - ver usu�rioss**\n");
		System.out.println("** 3 - deletar usu�rios**\n");
		
		entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		
		return opcao;
	}
	
	void realizaOperacao (int opcao) {
		switch(opcao) {
			case 1: {
				System.out.println("**qual o tipo do usuario?**\n");
				System.out.println("** 1 - cliente**\n");
				System.out.println("** 2 - treinador**\n");
				
				entrada = new Scanner(System.in);
				int opcaoUsuario = entrada.nextInt();
				
				System.out.println("Digite o nome : \n");
				String nome = entrada.nextLine();
				
				System.out.println("Digite o peso\n");
				double peso = entrada.nextDouble();
				
				System.out.println("Digite a altura\n");
				double altura = entrada.nextDouble();
				
				if (opcaoUsuario == 1) {
					System.out.println("Digite o plano\n ");
					System.out.println("** 1 - muscula��o**\n");
					System.out.println("** 2 - muscula��o e dan�a**\n");
					System.out.println("** 3 - muscula��o,  dan�a e luta**\n");
					int plano = entrada.nextInt();
					
					pessoas.add(new Cliente(nome, this._idIndex, peso, altura, plano));
					this._idIndex++;
				} else if (opcaoUsuario == 2) {
					
				} else {
					System.out.println("op��o incorreta\n");
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
