package controller;

import util.Teclado;

public class Exercicio04 {

	/*
	 * Desenvolver um programa que pergunte oito elementos em um vetor a, construa
	 * um vetor b de mesma dimensão com os elementos do vetor a multiplicados por 3.
	 * Apresente ao final o vetor b. Na exibição, o elemento b[1] deve ser implicado
	 * pelo elemento a[1] * 3, o elemento b[2] implicado pelo a[2] * 3, e assim por
	 * diante, até 8.
	 */

	public static void main(String[] args) {
		int a[] = new int [8], b[] = new int [8];
		
		for (int i = 0; i < 8; i++) {
			a[i] = Teclado.lerInt("Digite um numero para a operação");
			b[i] = a[i] * 3; 
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println(a[i] + " . 3 = " + b[i]);
		}
	}

}
