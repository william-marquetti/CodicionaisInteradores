/*
 * Peça para o usuário digitar um número, pegue o número que o usuário digitou.

Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, caso

contrário imprima “o valor é par”.
 */
package exercicios.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número");
		numero = scanner.nextInt();
		scanner.close();
		
		if ( numero % 2 != 0 ){
			System.out.println("O valor digitado é impar");
			
		} else{
			System.out.println("O valor digitado é par");
		}
	}

}
