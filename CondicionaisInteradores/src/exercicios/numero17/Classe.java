/*
 
 Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua
	idade. Pergunte o nome da terceira pessoa e sua idade. Imprima o nome e idade de
	pessoas mais velha, do meio e a mais nova, utilizando apenas um Sysout. Sendo
	considerado a idade uma variável int.
 
 * 
 */
package exercicios.numero17;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome1;
		String nome2;
		String nome3;
		String maisVelha;
		String doMeio;
		String maisNova;
		
		int idade1;
		int idade2;
		int idade3;
		
		int idadeMaisVelha;
		int idadeDoMeio;
		int idadeMaisNova;
		
		System.out.println("Informe seu nome");
		nome1 = scanner.next();
		
		System.out.println("Informe sua idade");
		idade1 = scanner.nextInt();
		
		idadeMaisVelha = idade1;
		idadeDoMeio = idade1;
		idadeMaisNova = idade1;
		
		maisVelha = nome1;
		doMeio = nome1;
		maisNova = nome1;
		
		System.out.println("Informe seu nome");
		nome2 = scanner.next();
		
		System.out.println("Informe sua idade");
		idade2 = scanner.nextInt();		
		
		if (idade2 > idadeMaisVelha){
			maisVelha = nome2;
			idadeMaisVelha = idade2;
			
		}else{
			doMeio = nome2;
			idadeDoMeio = idade2;
		}
		
		System.out.println("Informe seu nome");
		nome3 = scanner.next();
		
		System.out.println("Informe sua idade");
		idade3 = scanner.nextInt();	
		
		if ( idade3 > idadeMaisVelha){
			maisNova = doMeio;
			doMeio = maisVelha;
			maisVelha = nome3;
			
			idadeMaisNova = idadeDoMeio;
			idadeDoMeio = idadeMaisVelha;
			idadeMaisVelha = idade3;
			
		}else if (idade3 > idadeDoMeio){
			maisNova = doMeio;
			doMeio = nome3;
			
			idadeMaisNova = idadeDoMeio;
			idadeDoMeio = idade3;
			
		}
		
		scanner.close();
		
			
		System.out.println(maisVelha + " idade : "+ idadeMaisVelha+ "\r\n"+doMeio + "idade : "+idadeDoMeio + "\r\n"+ maisNova+" idade: "+ idadeMaisNova );
		
	}
}
