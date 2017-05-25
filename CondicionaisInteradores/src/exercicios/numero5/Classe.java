/*
 * Peça para o usuário digitar a idade e ano de nascimento. Pegue os valores que o

usuário digitou. Verifique se a idade digitada condiz com o ano de nascimento do

usuário, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima

“Você não mentiu para mim”, caso contrário, imprima “Você mentiu para mim, você

não é mais meu amigo”.
 */
package exercicios.numero5;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
		int ano;
		
		System.out.println("Informe sua idade");
		idade = scanner.nextInt();
		
		System.out.println("Informe o ano de nascimento");
		ano = scanner.nextInt();
		
		scanner.close();
		
		if ( ( 2017 - ano ) == idade){
			System.out.println("Você não mentiu para mim");
		}else{
			System.out.println("Você mentiu para mim, você não é mais meu amigo");
		}
		
	}

}
