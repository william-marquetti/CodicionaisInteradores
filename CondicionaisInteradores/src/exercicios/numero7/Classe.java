/*Calculadora

a. Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero

b. Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e armazene o

o operador

c. Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero

d. Caso o usu�rio digitou o operador +, some os dois n�meros e imprima o

resultado �Valor da soma: &lt;resultado&gt;�.

e. Caso o usu�rio digitou o operador -, subtraia os dois n�meros e imprima o

resultado �Valor da subtra��o: &lt;resultado&gt;�.

f. Caso o usu�rio digitou o operador /, divida os dois n�meros e imprima o

resultado �Valor da divis�o: &lt;resultado&gt;�.

g. Caso o usu�rio digitou o operador *, multiplique os dois n�meros e imprima o

resultado �Valor da multiplica��o: &lt;resultado&gt;�.
*/
package exercicios.numero7;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero1;
		double numero2;
		String operacao;
		
		System.out.println("Digite um n�mero");
		numero1 = scanner.nextDouble();
		
		System.out.println("Informe a opera��o (+, -, /, x)");
		operacao = scanner.next();
		
		System.out.println("Digite um n�mero");
		numero2 = scanner.nextDouble();
		scanner.close();
		
		switch (operacao) {
			
			case "+":
				System.out.println("Valor da soma: " + (numero1 + numero2));
				break;
			
			case "-":
				System.out.println("Valor da subtra��o: " + (numero1 - numero2));
				break;
			
			case "/":
				System.out.println("Valor da divis�o: " + (numero1 / numero2));
				break;
				
			case "*":
				System.out.println("Valor da multiplica��o: " + (numero1 * numero2));
				break;
		}
			
	}

}
