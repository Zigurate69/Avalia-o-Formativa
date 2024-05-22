package AVFormativa;

import java.util.Scanner;

public class Questão1 {

	public static void main(String[] args) {
		
		double c, f;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe Quantos Graus Fahrenheit: ");
		f = ler.nextDouble();
		
		c = (f-32)*5/9;
		
		System.out.println("A Conversão de Graus Fahrenheit para Graus Celsius é de: " +c);
		ler.close();
	}
}