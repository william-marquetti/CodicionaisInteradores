/*
 * Pe�a para o usu�rio digitar dois n�meros double. E efetue as seguintes valida��es:
		
		a. Se a soma dos n�meros for maior que 20, imprima no console �&lt;resultado da
		
		soma&gt; � maior que 20�
		
		b. Se a soma dos n�meros for maior que 30, imprima no console �&lt;resultado da
		
		soma&gt; � maior que 30�
		
		c. Se a soma dos n�meros for maior que 10 ou maior que 20, imprima no
		
		console �&lt;resultado da soma&gt; � maior que 10 ou &lt;resultado da soma&gt; maior
		
		que 20 �
		
		d. Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, imprima no console
		
		�&lt;resultado da soma&gt; � m�ltiplo de 5 e &lt;resultado da soma&gt; de 10�
		
		e. Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, ou o primeiro
		
		n�mero digitado � 5, imprima no console �&lt;resultado da soma&gt; � m�ltiplo de
		
		5 e &lt;resultado da soma&gt; de 10 ou o &lt;primeiro n�mero digitado&gt; � 5�
 */
package exercicios.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double soma;
		
		System.out.println("Digite um n�mero");
		numero1 = scanner.nextDouble();
		
		System.out.println("Digite um n�mero");
		numero2 = scanner.nextDouble();
		scanner.close();
		
		soma = (numero1 + numero2);

		if (soma > 20){
			System.out.println(soma + " � maior que 20");
		} else if (soma > 30) {
			System.out.println(soma+ " � maior que 30");
			
		} else if( (soma > 10) || (soma > 20)){
			System.out.println(soma +" � maior que 10 ou "+ soma +" maior que 20");
		} else if ( ( soma % 5 == 0 ) && (soma % 10 == 0 )){
			System.out.println(soma + " � multiplo de 5 e "+ soma + " � multiplo de 10");
			
		} else if ( ( ( soma % 5 == 0 ) && (soma % 10 == 0 )) || (numero1 == 5) ){
			System.out.println(soma + " � multiplo de 5 e "+ soma + " � multiplo de 10 ou "+ numero1  + " � 5");
			
		}
	}
}
