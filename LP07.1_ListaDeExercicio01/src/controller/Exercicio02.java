package controller;

import util.Teclado;

public class Exercicio02 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos deste vetor.
	 */
	public static void main(String[] args) {
		int a[] = new int[5], soma = 0;
		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um numero para a soma:");
			soma = soma + a[i];
		}
		
		System.out.println("A soma de todos os numeros digitados é: " + soma);
	}

}
