/*
 * Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a

para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais

informa��es efetue as seguintes condi��es:
 * Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, caso sim,

imprima �OK, voc� gosta de pegar tr�nsito!�.
 */
package exercicios.numero6.itemd;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String cidade;
		String bairro;

		System.out.println("Dgite sua cidade");
		cidade = scanner.nextLine();

		System.out.println("Digite seu bairro");
		bairro = scanner.nextLine();
		scanner.close();

		if ((cidade.equals("Gaspar")) && (bairro.equals("Belchior"))) {
			System.out.println("Voc� tem que sair de madrugada para n�o pegar tr�nsito!");

		}
	}

}
