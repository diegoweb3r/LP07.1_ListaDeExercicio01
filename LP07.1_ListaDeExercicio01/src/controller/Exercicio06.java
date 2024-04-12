package controller;

import util.Teclado;

public class Exercicio06 {

	/*
	 * Desenvolver um programa que pergunte 20 elementos de um vetor a e construa um
	 * vetor b de mesma dimensão com os mesmos elementos de a, os quais devem estar
	 * invertidos, ou seja, o primeiro elemento de a passa a ser o último elemento
	 * de b, e assim por diante. Apresentar os vetores a e b.
	 */

	public static void main(String[] args) {
		int a[] = new int [20], b[] = new int [20];
		
		for(int i = 0; i < 20; i++) {
			a[i] = Teclado.lerInt("Digite um numero: ");
			b[4 - i] = a[i];
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Vetor a[]: " + a[i] + "| Vetor b[]: " + b[i]);
		}
	}

}
