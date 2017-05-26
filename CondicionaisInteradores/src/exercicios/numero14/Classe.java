/*
 * Um comerciante comprou um produto e quer vende-lo com um lucro de 50% se o
	valor da compra for menor que R$ 20,00. Caso contrário, o lucro será 35%. Entrar
	com o valor do produto e imprimir o valor de venda.
	
 */
package exercicios.numero14;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double valorProduto;
		
		System.out.println("Informe o valor do produto");
		valorProduto = scanner.nextDouble();
		scanner.close();
		
		if ( valorProduto < 20){
			System.out.println(valorProduto * 1.50);
		}else{
			System.out.println(valorProduto * 1.35);
		}
		
	}

}
