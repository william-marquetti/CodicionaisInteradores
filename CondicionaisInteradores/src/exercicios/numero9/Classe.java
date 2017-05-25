/*
 * Mariazinha quer sair com amigas no domingo a tarde no shopping. S� que ela n�o

sabe que roupa ela vai usar ainda, por que ela n�o viu o jornal do clima na tv. Desta

na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual

roupa ela usar�. Contudo a Mariazinha j� nos disse o que ela usar� em cada clima e

temperatura. Desta forma, escreva um algoritmo que verifique as condi��es do

tempo (clima e temperatura) e imprima no console qual a roupa que a Mariazinha

escolheu para usar.

	a. Se estiver sol ela usu�rio blusa
	
	b. Se estiver sol e a temperatura estiver acima de 30� ela usar� saia
	
	c. Se estiver sol e a temperatura estiver abaixo ou igual a 30� e maior ou igual a
	
	23� ela usar� shorts.
	
	d. Se estiver sol e a temperatura estiver abaixo de 23� graus ela usu�rio cal�a
	
	jeans.
	
	e. Se estiver nublado e a temperatura estiver mais que 25� graus ela usar�
	
	vestido.
	
	f. Se estiver nublado e a temperatura estiver menor ou igual a 25� ela usar�
	
	cal�a de moletom e sobretudo.
	
	g. Se estiver chovendo ela usar� bota e cal�a jean
	
	h. Se estiver chovendo e a temperatura for menor ou igual a 10� ela usar� blusa
	
	e um casaco de l�.
	
	i. Se estiver chovendo e a temperatura for maior que 10� e menor que 25� ela
	
	usar� camisete.
	
	j. Se estiver chovendo e a temperatura for maior ou igual a 25� ela usar� uma
	
	blusa regata
	
	k. Caso contr�rio ela vai ficar em casa
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
				System.out.println("Ela usar� blusa");
				
				if (temperatura > 30){
					System.out.println("Ela usar� saia");
					
				} else if ((temperatura <= 30) || (temperatura >= 23)){
					System.out.println("Ela usar� shorts");
				
				}else if (temperatura < 23){
					System.out.println("Ela usar� cal�a jeans");
					
				}
				
				break;
				
			case "nublado" :
				if (temperatura > 25){
					System.out.println("Ela usar� vestido");
					
				} else if (temperatura <= 25){
					System.out.println("Ela usar� cal�a de moleton e sobretudo");
				
				}
				break;
				
			case "chovendo" :
			 	if (temperatura <= 15){
					System.out.println("Ela usar� blusa e um casaco de l�");
				
				} else if ( (temperatura > 10) && (temperatura < 25)){
					System.out.println("Ela usar� camisete");
				} else if ( temperatura >= 25){
					System.out.println("Ela usar� regata");
				}
			 	break;
			 	
			default:
				System.out.println("Ela ficar� em casa");
			 	break;		
			
		}
		
		
	}
}
