package controller;

import util.Teclado;

public class Exercicio05 {

	/*
	 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie
	 * um vetor b de mesma dimensão contendo os valores ao quadrado correspondentes
	 * no vetor a. Ao final exibir os 2 vetores
	 */

	public static void main(String[] args) {
		int a[] = new int [5];
		double b[] = new double[5];
		
		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerInt("Digite um numero para a operação");
			b[i] = Math.pow(a[i], 2);
		}
		
		System.out.println("Os resutlados para os numeros digitados foram:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i] + " ^2 = " + b[i]);
		}

	}

}
