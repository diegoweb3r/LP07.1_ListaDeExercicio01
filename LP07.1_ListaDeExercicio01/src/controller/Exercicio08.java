package controller;

import util.Teclado;

public class Exercicio08 {

	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
	 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
	 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
	 * aluno.
	 */
	
	public static void main(String[] args) {
		String nome[] = new String[3], situacao[] = new String[3];
		double pr1[] = new double[3], pr2[] = new double[3], media[] = new double[3];
		
		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome do aluno");
			pr1[i] = Teclado.lerDouble("Digite a PR1 do aluno");
			pr2[i] = Teclado.lerDouble("Digite a PR2 do aluno");
			media[i] = (pr1[i] + pr2[i])/2;
			if (media[i] >= 6) {
				situacao[i] = "Aprovado!"; 
			} else {
				situacao[i] = "Reprovado!";
			}
		}
		
		System.out.println("Lista Final:");
		for (int i = 0; i < 3; i++) {
		System.out.println("Nome: " + nome[i] + " PR1: " + pr1[i] + " PR2: " + pr2[i] + " Média: " + media[i] + " Situação: " + situacao[i]);
		}

	}

}
