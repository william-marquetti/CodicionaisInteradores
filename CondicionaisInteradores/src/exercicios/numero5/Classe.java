/*
 * Pe�a para o usu�rio digitar a idade e ano de nascimento. Pegue os valores que o

usu�rio digitou. Verifique se a idade digitada condiz com o ano de nascimento do

usu�rio, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima

�Voc� n�o mentiu para mim�, caso contr�rio, imprima �Voc� mentiu para mim, voc�

n�o � mais meu amigo�.
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
			System.out.println("Voc� n�o mentiu para mim");
		}else{
			System.out.println("Voc� mentiu para mim, voc� n�o � mais meu amigo");
		}
		
	}

}
