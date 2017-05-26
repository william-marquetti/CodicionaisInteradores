/*
 
 Pergunte para o usuário um dia do mês e número do mês. Faça um algoritmo que
	valide se o dia e o mês existem no calendário, utilizando apenas um Sysout. Sendo
	considerado duas variáveis int um para dia e outra para mês.
  
 */
package exercicios.numero15;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int mes;
		int dia;
		int qtDias;
		
		System.out.println("Informe o dia");
		dia = scanner.nextInt();
		
		System.out.println("Informe o mes");
		mes = scanner.nextInt();
		scanner.close();
		
		if (
				(mes == 1) ||
				(mes == 3) ||
				(mes == 5) ||
				(mes == 7) ||
				(mes == 8) ||
				(mes == 10)||
				(mes == 12)
			) {
			
			qtDias = 31;
					
		}else if (mes == 2){
			qtDias = 28;
		}else{
			qtDias = 30;
		}
		
		if ( ( dia <= qtDias ) && ( (mes <= 12) &&  (mes >=1) ) ){
			System.out.println("Data válida: " + dia +" - "+ mes);
		}else{
			System.out.println("Data inválida!:  " + dia +" - "+ mes);
		}
		
		
				
		
	}
}
