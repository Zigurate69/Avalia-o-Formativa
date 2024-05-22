package AVFormativa;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		int b, a, area;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe a base do quadrado: ");
		b = ler.nextInt();
		
		System.out.println("Informe a altura do quadrado");
		a = ler.nextInt();
		
		area = b*a;
		
		System.out.println("A área do quadrado é: " +area);
		ler.close();
	}
}