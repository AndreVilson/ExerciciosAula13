package ExerciciosAula13;

import java.util.Scanner;

public class NumerosInteirosEReal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int inteiro1 = scan.nextInt();

		System.out.println("Digite outro número inteiro:");
		int inteiro2 = scan.nextInt();

		System.out.println("Digite um número real:");
		double real = scan.nextDouble();

		// a = o produto do dobro do primeiro com metade do segundo.
		double a = inteiro1 * 2 + (inteiro2 / 2);
		// b = a soma do triplo do primeiro com o terceiro
		double b = inteiro1 * 3 + real;
		// c = o terceiro elevado ao cubo
		//double c = real * real * real;
		double c = Math.pow (real, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + b);
		System.out.println("O terceiro elevado ao cubo: " + c);

	}

}
