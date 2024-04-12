package controller;

import util.Teclado;

public class Exercicio03 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos que sejam ímpares.
	 */

	public static void main(String[] args) {
		int a[] = new int [5], soma = 0;
		
		for (int i = 0; i < 5 ; i++) {
			a[i] = Teclado.lerInt("Digite a um numero para a soma: ");
			if ( a[i] % 2 == 1 ) {
				soma = soma + a[i];
			}
		}
		
		System.out.println("A soma dos numeros impares digitados é: " + soma);
		
	}

}
