/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça

para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais

informações efetue as seguintes condições:
 * 
 * Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”, caso sim,

imprima “Pegue carona com quem vêem de Gaspar, economiza gasolina!”.
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
			System.out.println("Pegue carona com quem vêem de Gaspar, economiza gasolina!");

		}
	}
}
