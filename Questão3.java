package AVFormativa;

import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double v1, v2, resultado;
		char operador;
		
		System.out.println("Digite o primeiro número: ");
		v1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		v2 = ler.nextDouble();
		
		System.out.println("Digite o tipo de operação que você irá utilizar (+, -, *): ");
		operador = ler.next().charAt(0);
		
		resultado = 0;
		
		switch (operador) {
		case '+':
			resultado = v1 + v2;
			break;
		case '-':
			resultado = v1 - v2;
			break;
		case '*':
			resultado = v1 * v2;
			break;
			default:
			System.out.println("Operação Inválida");
			return;
		}
		System.out.println("Resultado: " +resultado);
	}
}
