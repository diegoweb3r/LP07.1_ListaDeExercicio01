package controller;

import util.Teclado;

public class Exercicio14 {

	/*
	 * Desenvolver um programa que pergunte os valores de um vetor a com 15
	 * elementos, construa um vetor b de mesmo tipo, sendo que cada elemento do
	 * vetor b deve ser o fatorial do elemento correspondente no vetor a. Apresentar
	 * como resposta todo o conteúdo do vetor b.
	 */

	public static void main(String[] args) {
		int a[] = new int [2], b[]= new int [2], fatorial = 1;
		
		for (int i = 0; i < 2; i++) {
			a[i] = Teclado.lerInt("Digite um numero");
		}
		
		for (int i = 0; i < 2; i++) {
			fatorial = 1;
			for (int j = 1; j <= a[i]; j++) {
				fatorial = fatorial * j;
			}
			b[i] = fatorial;
		}
		
		for(int i = 0; i < 2; i++) {
			System.out.println(a[i] + " " + b[i]);
		}
		

		
				
	}

}
