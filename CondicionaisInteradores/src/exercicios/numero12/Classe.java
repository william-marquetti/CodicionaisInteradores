/*
 * Escreve um algoritmo que o usu�rio entre com tr�s n�meros, e imprima os n�meros
	em ordem decrescente.
 */
package exercicios.numero12;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int maior;
		int menor = 0;
		int meio =0;
		
		System.out.println("digite o primeiro n�mero");
		numero1 = scanner.nextInt();
		maior = numero1;
		meio = numero1;
		menor = numero1;
		
		System.out.println("digite o segundo n�mero");
		numero2 = scanner.nextInt();
		
		if (numero2 > maior){
			meio = maior;
			maior = numero2;
		}else {
			meio = numero2;
		}
		
		System.out.println("digite o terceiro n�mero");
		numero3 = scanner.nextInt();
		scanner.close();
		
		if (numero3 > maior){
			menor = meio;
			meio = maior;
			maior = numero3;
		}else if (numero3 > meio){
			menor = meio;
			meio = numero3;
			
		}else{
			menor = numero3;
		}
		
		System.out.println(maior);
		System.out.println(meio);
		System.out.println(menor);
		
		
	}

}
