/*
 * Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a

para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais

informa��es efetue as seguintes condi��es:

Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�, caso sim,

imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.
*/
package exercicios.numero6.itemc;

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

		if ((cidade.equals("Blumenau")) && (bairro.equals("Garcia"))) {
			System.out.println("OK, voc� gosta de pegar tr�nsito!");

		}
	}

}
