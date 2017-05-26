/*
 * 
 Peça para o usuário digitar sua data de nascimento em texto “01/02/1990”. Busque a
	posição do última barra “/”contida na data. Imprime a posição da barra. (int posicao =
	texto.lastIndexOf("A");) 
 * 
 */

package exercicios.numero21;

import java.util.Scanner;

public class Classe {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String data;
		
		System.out.println("Informe a data de nascimento");
		data = scanner.nextLine();
		scanner.close();
		
		int posicao = data.lastIndexOf("/");
		System.out.println(posicao);
		
	}

}
