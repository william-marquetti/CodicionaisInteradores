/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça

para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais

informações efetue as seguintes condições:
 * Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim,

imprima “OK, você gosta de pegar trânsito!”.
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
			System.out.println("Você tem que sair de madrugada para não pegar trânsito!");

		}
	}

}
