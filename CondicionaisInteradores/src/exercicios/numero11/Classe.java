/*
 * Escreve um algoritmo que o usuário entre com três números e imprima o maior
	número entre eles, utilizando apenas um System.out.println.
 */
package exercicios.numero11;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior;
		
		System.out.println("digite o primeiro número");
		numero1 = scanner.nextInt();
		maior = numero1;
		
		System.out.println("digite o segundo número");
		numero2 = scanner.nextInt();
		
		if (numero2 > maior){
			maior = numero2;
		}
		
		System.out.println("digite o terceiro número");
		numero3 = scanner.nextInt();
		scanner.close();
		
		if (numero3 > maior){
			maior = numero3;
		}
		
		System.out.println(maior+ " é o maior número");
		
	}

}
