package controller;

import util.Teclado;

public class Exercicio11 {

	/*
	 * Crie um vetor a com 10 elementos e pergunte ao usuário 10 números para
	 * preencher este vetor. Ao final, apresente o maior e o menor valor informados,
	 * além da média dos 10 números informados.
	 */

	public static void main(String[] args) {
		int numero[] = new int [10], maior = 0, menor = 0;
		double media, soma = 0;
		
		for (int i = 0; i < 10; i++) {
			numero[i] = Teclado.lerInt("Digite um numero para a operação");
		}
		
		for ( int i = 0; i < 10; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
			}
		}
		
		for ( int i = 0; i < 10; i++) {
			if (numero[i] < maior) {
				menor = numero[i];
			}
		}
		
		for ( int i = 0; i <10; i++) {
				soma = soma + numero[i];
			}
		
		media = soma / numero.length;
		
		System.out.println("O programa retornou os seguintes resultados:");
		System.out.println("| Maior: " + maior + " | Menor: " + menor + " | Média: " + media);
		}
	
}
