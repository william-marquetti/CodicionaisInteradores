/*
 * Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a

para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel. Com tais

informa��es efetue as seguintes condi��es:
 * 
 * Verifique se o usu�rio mora em �Blumenau� e no bairro �Bela vista�, caso sim,

imprima �Pegue carona com quem v�em de Gaspar, economiza gasolina!�.
 */
package exercicios.numero6.iteme;

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

		if ((cidade.equals("Blumenau")) && (bairro.equals("Bela Vista"))) {
			System.out.println("Pegue carona com quem v�em de Gaspar, economiza gasolina!");

		}
	}
}
