/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça

para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais

informações efetue as seguintes condições:
 * 
 * No final peça para o usuário responder a pergunta “Você concorda com o

que eu disse?” utilizando System.out.println e pegue o que o usuário digitar

com Scanner. Caso o usuário digitar true, imprima “Show de bola”, caso

contrário “Ok, problema é nosso!”.
 */
package exercicios.numero6.itemf;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean pergunta;

		System.out.println("Você concorda com o que eu disse?");
		pergunta = scanner.nextBoolean();
		scanner.close();


		if (( pergunta == true) ) {
			System.out.println("Show de bola");

		} else{
			System.out.println("Ok, problema é nosso!");
		}
	}

}
