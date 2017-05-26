/*
 
 Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua
	idade. Imprima o nome da pessoa mais velha e a idade dela, e o nome da pessoa
	mais nova e a idade dela, utilizando apenas um Sysout. Sendo considerado a idade
	uma variável int.

  */
package exercicios.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome1;
		String nome2;
		String maisVelha;
		String maisNova;
		
		int idade1;
		int idade2;
		
		System.out.println("Informe seu nome");
		nome1 = scanner.next();
		
		System.out.println("Informe sua idade");
		idade1 = scanner.nextInt();
		
		System.out.println("Informe seu nome");
		nome2 = scanner.next();
		
		System.out.println("Informe sua idade");
		idade2 = scanner.nextInt();		
		scanner.close();
		
		if ( idade1 > idade2){
			maisVelha = "Pessoa mais velha: "+ nome1+ " idade: "+ idade1+ " anos";
			maisNova = "Pessoa mais nova: "+ nome2+ " idade: "+ idade2+ " anos";
		}else{
			maisVelha = "Pessoa mais velha: "+ nome2+ "idade: "+ idade2+ " anos";
			maisNova = "Pessoa mais nova: "+ nome1+ " idade: "+ idade1+ " anos";
		}
		
		System.out.println(maisVelha+"\r\n"+maisNova);
		
	}

}
