/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça

para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais

informações efetue as seguintes condições:
	Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”, caso sim,

	imprima “Você se atrasará muito mais para o trabalho!”.
*/
package exercicios.numero6.itemb;

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
		
		if ( (cidade.equals("Blumenau") ) && (bairro.equals("Fortaleza"))){
			System.out.println("Você se atrasará muito mais para o trabalho!");
			
		}
	}

}
