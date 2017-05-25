/*
 * Mariazinha quer sair com amigas no domingo a tarde no shopping. Só que ela não

sabe que roupa ela vai usar ainda, por que ela não viu o jornal do clima na tv. Desta

na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual

roupa ela usará. Contudo a Mariazinha já nos disse o que ela usará em cada clima e

temperatura. Desta forma, escreva um algoritmo que verifique as condições do

tempo (clima e temperatura) e imprima no console qual a roupa que a Mariazinha

escolheu para usar.

	a. Se estiver sol ela usuário blusa
	
	b. Se estiver sol e a temperatura estiver acima de 30° ela usará saia
	
	c. Se estiver sol e a temperatura estiver abaixo ou igual a 30° e maior ou igual a
	
	23° ela usará shorts.
	
	d. Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça
	
	jeans.
	
	e. Se estiver nublado e a temperatura estiver mais que 25° graus ela usará
	
	vestido.
	
	f. Se estiver nublado e a temperatura estiver menor ou igual a 25° ela usará
	
	calça de moletom e sobretudo.
	
	g. Se estiver chovendo ela usará bota e calça jean
	
	h. Se estiver chovendo e a temperatura for menor ou igual a 10° ela usará blusa
	
	e um casaco de lã.
	
	i. Se estiver chovendo e a temperatura for maior que 10° e menor que 25° ela
	
	usará camisete.
	
	j. Se estiver chovendo e a temperatura for maior ou igual a 25° ela usará uma
	
	blusa regata
	
	k. Caso contrário ela vai ficar em casa
 */
package exercicios.numero9;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double temperatura;
		String clima;
		
		System.out.println("Digite a temperatura");
		temperatura = scanner.nextDouble();
		
		System.out.println("Digite o clima");
		clima = scanner.next();
		scanner.close();
		
		switch (clima) {
			
			case "sol" :
				System.out.println("Ela usará blusa");
				
				if (temperatura > 30){
					System.out.println("Ela usará saia");
					
				} else if ((temperatura <= 30) || (temperatura >= 23)){
					System.out.println("Ela usará shorts");
				
				}else if (temperatura < 23){
					System.out.println("Ela usará calça jeans");
					
				}
				
				break;
				
			case "nublado" :
				if (temperatura > 25){
					System.out.println("Ela usará vestido");
					
				} else if (temperatura <= 25){
					System.out.println("Ela usará calça de moleton e sobretudo");
				
				}
				break;
				
			case "chovendo" :
			 	if (temperatura <= 15){
					System.out.println("Ela usará blusa e um casaco de lã");
				
				} else if ( (temperatura > 10) && (temperatura < 25)){
					System.out.println("Ela usará camisete");
				} else if ( temperatura >= 25){
					System.out.println("Ela usará regata");
				}
			 	break;
			 	
			default:
				System.out.println("Ela ficará em casa");
			 	break;		
			
		}
		
		
	}
}
