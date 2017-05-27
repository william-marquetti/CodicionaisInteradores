/*

Pergunte o nome da pessoa, o dia e mês e ano de aniversário. Pergunte para outra
	pessoa o nome, o dia, mês e ano de aniversário. Agora verifique qual é a pessoa
	mais velha, e imprima o nome da mais velha e o nome da mais nova, utilizando
	apenas um Sysout. Sendo considerado o dia, mês e ano, cada uma sendo uma
	variável int. 

 
 */

package exercicios.numero18;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome1;
		String nome2;
		
		int dia1;
		int dia2;
		int mes1;
		int mes2;
		int ano1;
		int ano2;
		
		String maisNova = "";
		String maisVelha = "";


		
		System.out.println("Digite seu nome");
		nome1 = scanner.next();
		
		System.out.println("digite o dia de nascimento");
		dia1 = scanner.nextInt();
		
		System.out.println("digite o mes de nascimento");
		mes1 = scanner.nextInt();
		
		System.out.println("digite o ano de nascimento");
		ano1 = scanner.nextInt();
		
		System.out.println("Digite seu nome");
		nome2 = scanner.next();
		
		System.out.println("digite o dia de nascimento");
		dia2 = scanner.nextInt();
		
		System.out.println("digite o mes de nascimento");
		mes2 = scanner.nextInt();
		
		System.out.println("digite o ano de nascimento");
		ano2 = scanner.nextInt();
		scanner.close();
		
		if ( ano1 > ano2){
			maisVelha = nome2;
			maisNova = nome1;
			
		} else if ( ano2 > ano1){
			maisVelha = nome1;
			maisNova = nome2;
			
		} else if ( ano1 == ano2 ){
			if ( mes1 == mes2 ){
				
				if (dia1 < dia2 ){
					maisVelha = nome1;
					maisNova = nome2;
					
				} else {
					maisVelha = nome2;
					maisNova = nome1;
				}
			} else if ( mes1 > mes2 ){
				maisVelha = nome2;
				maisNova = nome1;
			}else if ( mes2 > mes1 ){
				maisVelha = nome1;
				maisNova = nome2;
			}
		}
			
		System.out.println(maisVelha + " é mais velha\r\n" + maisNova + " é mais nova.");
		
	}
}
