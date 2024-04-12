package controller;

import util.Teclado;

public class Exercicio01 {

	/*
	 * Crie 2 vetores chamados nome e profissao, cada um com 5 elementos. Pergunte
	 * ao usuário o nome e a profissão de 5 pessoas e preencha estes vetores. Ao
	 * final exiba um relatório apontando o nome e a profissão de cada uma das 5
	 * pessoas cadastradas.
	 */

	public static void main(String[] args) {
		String nome[] = new String [5], profissao[] = new String [5];
		
		for (int i = 0; i < 5; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome da pessoa:");
			profissao[i] = Teclado.lerTexto("Digite a profissao da pessoa");
		}
		
		System.out.println("Relatório:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("| " + nome[i] + " " + profissao[i]);
		}
	}

}
