package controller;

import util.Teclado;

public class Exercicio13 {

	/*
	 * Desenvolver um programa que armazene nome e salário de 20 pessoas, calcule e
	 * armazene o novo salário sabendo-se que houve um reajuste de 8%. Exibir uma
	 * listagem numerada com nome e novo salário.
	 */
	
	public static void main(String[] args) {
		String nome[] = new String [3];
		double salario[] = new double[3];
		
		for (int i = 0; i < 3; i++) {
			nome[i] = Teclado.lerTexto("Digite o nome do funcionario:");
			salario[i] = Teclado.lerDouble("Digite o salario do funcionario");
		}

		for (int i = 0; i < 3; i++) {
			salario[i] = salario[i] * 1.08;
		}
		
		System.out.println("-- Lista de Funcionarios e Salarios reajustados:");
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome: " + nome[i] + " Novo salário: " + salario[i]);
		}
	}

}
