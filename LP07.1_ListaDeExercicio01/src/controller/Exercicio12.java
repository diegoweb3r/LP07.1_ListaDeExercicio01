package controller;

import util.Teclado;

public class Exercicio12 {

	/*
	 * Crie dois vetores a e b com 5 elementos cada e preencha-os com números
	 * informados pelo usuário. Ao final apresente os números que existem repetidos
	 * entre os 2 vetores.
	 */

	public static void main(String[] args) {
		double a[] = new double[3], b[] = new double[3], repetidos;
		
		for (int i = 0; i < 3; i++) {
			a[i] = Teclado.lerDouble("Digite um numero para o vetor a");
		}
		
		for (int i = 0; i < 3; i++) {
			b[i] = Teclado.lerDouble("Digite um numero para o vetor b");
		}
		
		
		System.out.println("A lista com os numeros repetidos é:");
		
		for ( int i = 0; i < 3; i++) {
			if ( a[i] == b[i]) {
				repetidos = a[i];
				System.out.println(repetidos);
			}
		}
	}

}
