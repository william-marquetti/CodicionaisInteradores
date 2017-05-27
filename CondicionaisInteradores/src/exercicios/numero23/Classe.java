/*
 * 
 Peça para o usuário digitar o nome completo. Procure o primeiro espaço “ ” (int
	posicao = texto.indexOf(" ");). Guarde o valor. 
	Procure agora pelo o último espaço “ ”
	no qual fizemos no exercício anterior. Agora, utilizando a função substring (texto =
	texto.substring(0, 10);), insira os dois valores guardados anteriormente, e imprima o
	texto resultante.
  
 * 
 */
package exercicios.numero23;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nome;
		int posicaoPrimeiroEspaco;
		int posicaoUltimoEspaco;

		System.out.println("Informe seu nome completo");
		nome = scanner.nextLine();
		scanner.close();

		posicaoPrimeiroEspaco = nome.indexOf(" ");
		posicaoUltimoEspaco = nome.lastIndexOf(" ");
		posicaoPrimeiroEspaco++;

		System.out.println(nome.substring(posicaoPrimeiroEspaco, posicaoUltimoEspaco));

	}

}
