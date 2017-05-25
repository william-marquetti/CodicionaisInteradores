/*
 * Peça para o usuário digitar dois números, pegue os dois números que o usuário

digitou. Se o primeiro número que o usuário digitar e o segundo número que o

usuário digitou forem múltiplos de 7, imprima “os dois números são múltiplos de 7”,

caso contrário imprima, “os dois números não são múltiplos de 7”.
 */
package exercicios.numero4;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		int numero2;
		
		System.out.println("Digite um número");
		numero = scanner.nextInt();
		
		System.out.println("Digite outro número");
		numero2 = scanner.nextInt();
		scanner.close();

		if ( (numero  % 7 == 0) && (numero2  % 7 == 0)  ){
			System.out.println("os dois números são múltiplos de 7");
			
		} else{
			System.out.println("os dois números não são múltiplos de 7");
		}

	}
}
