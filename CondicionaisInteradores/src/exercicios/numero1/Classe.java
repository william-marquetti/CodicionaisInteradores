/*
 * Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou.

Verifique se o n�mero � maior que 10, caso sim, imprima �o valor digitado � maior

que 10�, caso contr�rio imprima �o valor digitado � menor que 10�.
 */
package exercicios.numero1;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero");
		numero = scanner.nextInt();
		scanner.close();
		
		if ( numero > 10 ){
			System.out.println("O valor digitado � maior que 10");
			
		} else{
			System.out.println("O valor digitado � menor que 10");
		}
	}
}
