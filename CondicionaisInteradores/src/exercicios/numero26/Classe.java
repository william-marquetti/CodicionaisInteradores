/*
 * Da data em texto �25/05/2015�, extraia o dia, m�s e ano e imprima a data da

seguinte forma (O dia � {dia}, do m�s {m�s}, do ano {ano}).
 * 
 * 
 */
package exercicios.numero26;

public class Classe {
	public static void main(String[] args) {

		String data = "25/05/2015";
		
		String[] lista = data.split("/");
		
		String dia = lista[0];
		String mes = lista[1];
		String ano = lista[2];
		
		System.out.println("Dia: "+ dia + " M�s: "+ mes + " Ano: "+ ano);

	}

}
