/*Calculadora

a. Peça para o usuário digitar um número, e armazene o número

b. Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o

o operador

c. Peça para o usuário digitar outro número, e armazene o número

d. Caso o usuário digitou o operador +, some os dois números e imprima o

resultado “Valor da soma: &lt;resultado&gt;”.

e. Caso o usuário digitou o operador -, subtraia os dois números e imprima o

resultado “Valor da subtração: &lt;resultado&gt;”.

f. Caso o usuário digitou o operador /, divida os dois números e imprima o

resultado “Valor da divisão: &lt;resultado&gt;”.

g. Caso o usuário digitou o operador *, multiplique os dois números e imprima o

resultado “Valor da multiplicação: &lt;resultado&gt;”.
*/
package exercicios.numero7;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero1;
		double numero2;
		String operacao;
		
		System.out.println("Digite um número");
		numero1 = scanner.nextDouble();
		
		System.out.println("Informe a operação (+, -, /, x)");
		operacao = scanner.next();
		
		System.out.println("Digite um número");
		numero2 = scanner.nextDouble();
		scanner.close();
		
		switch (operacao) {
			
			case "+":
				System.out.println("Valor da soma: " + (numero1 + numero2));
				break;
			
			case "-":
				System.out.println("Valor da subtração: " + (numero1 - numero2));
				break;
			
			case "/":
				System.out.println("Valor da divisão: " + (numero1 / numero2));
				break;
				
			case "*":
				System.out.println("Valor da multiplicação: " + (numero1 * numero2));
				break;
		}
			
	}

}
