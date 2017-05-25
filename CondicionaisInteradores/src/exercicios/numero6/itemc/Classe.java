/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça

para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais

informações efetue as seguintes condições:

Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, caso sim,

imprima “Você tem que sair de madrugada para não pegar trânsito!”.
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
			System.out.println("OK, você gosta de pegar trânsito!");

		}
	}

}
