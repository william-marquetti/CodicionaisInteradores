/*
 * Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a

para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais

informa��es efetue as seguintes condi��es:
 * 
 * No final pe�a para o usu�rio responder a pergunta �Voc� concorda com o

que eu disse?� utilizando System.out.println e pegue o que o usu�rio digitar

com Scanner. Caso o usu�rio digitar true, imprima �Show de bola�, caso

contr�rio �Ok, problema � nosso!�.
 */
package exercicios.numero6.itemf;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean pergunta;

		System.out.println("Voc� concorda com o que eu disse?");
		pergunta = scanner.nextBoolean();
		scanner.close();


		if (( pergunta == true) ) {
			System.out.println("Show de bola");

		} else{
			System.out.println("Ok, problema � nosso!");
		}
	}

}
