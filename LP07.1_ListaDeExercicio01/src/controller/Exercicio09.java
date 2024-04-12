package controller;

import util.Teclado;

public class Exercicio09 {

	/*
	 * Desenvolver um programa que leia 10 nomes de pessoas e armazene no vetor
	 * nomes. Em seguida o programa deve informar que enquanto o usuário responder
	 * SIM, será pedido que ele digite um nome e o programa informará se este nome
	 * existe ou não no vetor nomes. Em resumo, o programa deverá fazer o seguinte:
	 * • Solicitar 10 nomes para preencher o vetor nomes • Perguntar se o usuário
	 * quer fazer uma pesquisa de nomes no vetor nomes. • Se a resposta for SIM,
	 * perguntar qual o nome. • Informar se o nome existe ou não no vetor nomes.
	 */

	public static void main(String[] args) {
		String nomes[] = new String[10], resposta, nomePesquisa;
		
		for (int i = 0; i < 10 ; i++) {
			nomes[i] = Teclado.lerTexto("Digite um nome para ser armazenado").toUpperCase();
		}
		
		
		do {
			resposta = Teclado.lerTexto("Voce quer realizar uma pesquisa? (SIM/NAO)").toUpperCase();
			
			if (resposta.equals("SIM")) {
				nomePesquisa = Teclado.lerTexto("Digite o nome para a pesquisa: ").toUpperCase();
				for (int i = 0; i < 10; i++) {
					if(nomePesquisa.equals(nomes[i])) {
						System.out.println(nomePesquisa + " foi encontrado na posição: " + i + " do vetor de nomes");
					}
			}
			}
		} while (resposta.equals("SIM"));
		System.out.println("Voce encerrou o programa");
	}
}
