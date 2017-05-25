/*
 * Peça para o usuário digitar dois números, pegue os dois números que o usuário

digitou. Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5

imprima “o resultado é múltiplo de 5”, caso contrário, imprima “o resultado não foi o

esperado”. Após o teste da da condição do if, imprima o resultado da multiplicação.
 */
package exercicios.numero3;

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

		if ( ((numero * numero2) % 5 == 0) ){
			System.out.println("O resultado é multiplo de 5");
			
		} else{
			System.out.println("O resultado não foi o esperado");
		}
		
		System.out.println("Resultado: "+ numero * numero2);
	}
}
