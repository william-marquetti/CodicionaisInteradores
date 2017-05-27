/*
 * 
 
 Do texto abaixo, extraia apenas o nome da rua, utilizando indexOf e substring
	a. Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC
	b. SC - Blumenau, rua Joiville nº 2011.
  
 * 
 */

package exercicios.numero25;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String a = "Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC";
		String b =  "SC - Blumenau, rua Joiville nº 2011.";
		
		int posicaoPrimeiroSeparador;
		int posicaoSegundoSeparador;


		posicaoPrimeiroSeparador = a.indexOf(" ");
		posicaoSegundoSeparador = a.indexOf(",");
		posicaoPrimeiroSeparador++;
		
		System.out.println(a.substring(posicaoPrimeiroSeparador, posicaoSegundoSeparador));
		
		posicaoPrimeiroSeparador = b.indexOf(" ");
		posicaoSegundoSeparador = b.indexOf("n");
		posicaoPrimeiroSeparador++;

		System.out.println(b.substring(posicaoPrimeiroSeparador, posicaoSegundoSeparador));

	}
}
