package controller;

import util.Teclado;

public class Exercicio07 {

	/*
	 * Crie um vetor chamado semana com 7 elementos já contendo todos os nomes por
	 * extenso dos dias da semana. Em seguida pergunte ao usuário um número e
	 * apresente o dia correspondente ao número no vetor, ou exiba a mensagem
	 * “Número não corresponde a um dia da semana.”
	 */

	public static void main(String[] args) {
		String diasSemana[] = new String[7];
		diasSemana[0] = "Segunda-feira"; 
		diasSemana[1] = "Terça-feira"; 
		diasSemana[2] = "Quarta-feira"; 
		diasSemana[3] = "Quinta-feira"; 
		diasSemana[4] = "Sexta-feira"; 
		diasSemana[5] = "Sabado"; 
		diasSemana[6] = "Domgingo"; 
		int codigo;
		
		codigo = Teclado.lerInt("Digite um numero para representar a semana:");
		
		switch(codigo) {
		case 1:
			System.out.println("O numero correspondente é: " + diasSemana[0]);
			break;
		case 2:
			System.out.println("O numero correspondente é: " + diasSemana[1]);
			break;
		case 3:
			System.out.println("O numero correspondente é: " + diasSemana[2]);
			break;
		case 4:
			System.out.println("O numero correspondente é: " + diasSemana[3]);
			break;
		case 5:
			System.out.println("O numero correspondente é: " + diasSemana[4]);
			break;
		case 6:
			System.out.println("O numero correspondente é: " + diasSemana[5]);
			break;
		case 7:
			System.out.println("O numero correspondente é: " + diasSemana[6]);
			break;
			
			default: 
				System.out.println("Número não corresponde a um dia da semana.");
			
		}
		
		
	}

}
