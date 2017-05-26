/*
 * 
 * Peça para o usuário digitar um texto e altere todas as vogais do texto, para a letra w,
	utilizando o replace. (texto = texto.replace(&quot;antigoCaracter&quot;, &quot;novoCaracter&quot;);) 
 * 
 */
package exercicios.numero19;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String texto;
	
		char[] vogais = "aeiouAEIOU".toCharArray();
		
		System.out.println("Digite um texto");
		texto = scanner.nextLine();
		scanner.close();
		
		for (int aux = 0; aux < vogais.length; aux++){
			texto = texto.replace(vogais[aux], 'w');
		}
		
		System.out.println(texto);
					
	}
}
