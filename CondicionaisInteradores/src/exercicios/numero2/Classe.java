/*
 * Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou.

Verifique se o n�mero � �mpar, caso sim, imprima �o valor digitado � �mpar�, caso

contr�rio imprima �o valor � par�.
 */
package exercicios.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um n�mero");
		numero = scanner.nextInt();
		scanner.close();
		
		if ( numero % 2 != 0 ){
			System.out.println("O valor digitado � impar");
			
		} else{
			System.out.println("O valor digitado � par");
		}
	}

}
