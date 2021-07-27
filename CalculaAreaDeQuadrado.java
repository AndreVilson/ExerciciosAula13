package ExerciciosAula13;

import java.util.Scanner;

public class CalculaAreaDeQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do lado do quadrado : ");
		double lado = scan.nextDouble();
		
		//double dobroDaArea = (lado * lado)*2;
		double dobroDaArea = Math.pow (lado,  2);
		System.out.println("O dobro da área é: " + dobroDaArea);

	}

}
