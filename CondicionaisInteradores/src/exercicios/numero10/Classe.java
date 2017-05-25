/*
 * Peça para o usuário digitar dois números double. E efetue as seguintes validações:
		
		a. Se a soma dos números for maior que 20, imprima no console “&lt;resultado da
		
		soma&gt; é maior que 20”
		
		b. Se a soma dos números for maior que 30, imprima no console “&lt;resultado da
		
		soma&gt; é maior que 30”
		
		c. Se a soma dos números for maior que 10 ou maior que 20, imprima no
		
		console “&lt;resultado da soma&gt; é maior que 10 ou &lt;resultado da soma&gt; maior
		
		que 20 ”
		
		d. Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console
		
		“&lt;resultado da soma&gt; é múltiplo de 5 e &lt;resultado da soma&gt; de 10”
		
		e. Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro
		
		número digitado é 5, imprima no console “&lt;resultado da soma&gt; é múltiplo de
		
		5 e &lt;resultado da soma&gt; de 10 ou o &lt;primeiro número digitado&gt; é 5”
 */
package exercicios.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double soma;
		
		System.out.println("Digite um número");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite um número");
		numero2 = scanner.nextDouble();
		scanner.close();
		
		soma = (numero1 + numero2);

		if (soma > 20){
			System.out.println(soma + " É maior que 20");
		} else if (soma > 30) {
			System.out.println(soma+ " É maior que 30");
			
		} else if( (soma > 10) || (soma > 20)){
			System.out.println(soma +" É maior que 10 ou "+ soma +" maior que 20");
		} else if ( ( soma % 5 == 0 ) && (soma % 10 == 0 )){
			System.out.println(soma + " É multiplo de 5 e "+ soma + " É multiplo de 10");
			
		} else if ( ( ( soma % 5 == 0 ) && (soma % 10 == 0 )) || (numero1 == 5) ){
			System.out.println(soma + " É multiplo de 5 e "+ soma + " É multiplo de 10 ou "+ numero1  + " é 5");
			
		}
	}
}
