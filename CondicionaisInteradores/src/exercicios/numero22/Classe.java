/*
 * 
 Peça para o usuário digitar o nome completo. Busque em qual posição está o último
	espaço “ ” (texto.lastIndexOf(“ ”);). Guarde este valor, e agora some mais 1 neste
	valor utilizando ++. Agora utilizando o substring, coloque o valor do resultado da
	soma e imprima o texto (texto = texto.substring(0);). Veja o que acontece. 
 * 
 */

package exercicios.numero22;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int posicaoUltimoEspaco;
		
		System.out.println("Informe seu nome completo");
		nome = scanner.nextLine();
		scanner.close();
		
		posicaoUltimoEspaco = nome.lastIndexOf(" ");
		posicaoUltimoEspaco++;
		
		System.out.println(nome.substring(posicaoUltimoEspaco));
		
	}

}
