/*
 * 
 Pe�a para o usu�rio digitar o nome completo. Procure o primeiro espa�o � � (int
	posicao = texto.indexOf(" ");). Guarde o valor. 
	Procure agora pelo o �ltimo espa�o � �
	no qual fizemos no exerc�cio anterior. Agora, utilizando a fun��o substring (texto =
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
