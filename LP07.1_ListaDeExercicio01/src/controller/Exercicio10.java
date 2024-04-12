package controller;

import util.Teclado;

public class Exercicio10 {

	/*
	 * Crie 3 vetores (nomes, telefones, endereços) e pergunte ao usuário o nome,
	 * telefone e endereço de 5 pessoas. Em seguida peça ao usuário para digitar um
	 * número de 1 a 5, e exibir como resposta os dados da pessoa cadastrada no
	 * número informado.
	 */
	
	public static void main(String[] args) {
		String nome[] = new String [5], endereco[] = new String [5];
		int telefone[] = new int [5], codigo;
		
		for ( int i = 0; i < 5; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome");
			endereco[i] = Teclado.lerTexto("Digite o endereco");
			telefone[i] = Teclado.lerInt("Digite o telefone");
		}
		
		codigo = Teclado.lerInt("Dgite um código de 1 a 5 para exibição");
		
		switch (codigo) {
		case 1: 
			System.out.println("--- Código: " + codigo + " ---");
			System.out.println("--- Nome: " + nome[0] + " Endereço: " + endereco[0] + " Telefone: " + telefone[0]);
			break;
		case 2: 
			System.out.println("--- Código: " + codigo + " ---");
			System.out.println("--- Nome: " + nome[1] + " Endereço: " + endereco[0] + " Telefone: " + telefone[1]);
			break;
		case 3: 
			System.out.println("--- Código: " + codigo + " ---");
			System.out.println("--- Nome: " + nome[2] + " Endereço: " + endereco[2] + " Telefone: " + telefone[2]);
			break;
		case 4: 
			System.out.println("--- Código: " + codigo + " ---");
			System.out.println("--- Nome: " + nome[3] + " Endereço: " + endereco[3] + " Telefone: " + telefone[3]);
			break;
		case 5: 
			System.out.println("--- Código: " + codigo + " ---");
			System.out.println("--- Nome: " + nome[4] + " Endereço: " + endereco[4] + " Telefone: " + telefone[4]);
			break;
			default: 
				System.out.println("Numero digitado nao encontrado");
		}

		
	}

}
