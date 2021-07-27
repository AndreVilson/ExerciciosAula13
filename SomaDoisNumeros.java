package ExerciciosAula13;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = scan.nextInt();

		System.out.println("Digite outro numero: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("A soma dos numeros é: " +  resultado);
	}

}
