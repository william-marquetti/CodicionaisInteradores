/*
 * 
 Utilizando o exercício 21 como exemplo, tente extrair o mês da data, utilizando as
	funções indexOf e substring.
 * 
 */
package exercicios.numero24;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		int posicaoPrimeiroSeparador;
		int posicaoSegundoSeparador;

		System.out.println("Informe uma data");
		nome = scanner.nextLine();
		scanner.close();

		posicaoPrimeiroSeparador = nome.indexOf("/");
		posicaoSegundoSeparador = nome.lastIndexOf("/");
		posicaoPrimeiroSeparador++;

		System.out.println(nome.substring(posicaoPrimeiroSeparador, posicaoSegundoSeparador));

	}

}
