package ExerciciosAula13;

import java.util.Scanner;

public class ConversorDeMetrosParaCentimetros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor em metros : ");
		double metros = scan.nextDouble();

		double resultado = metros * 100;
		
		System.out.println("Valor é: " + resultado + "cm");

	}

}
