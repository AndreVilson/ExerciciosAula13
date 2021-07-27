package ExerciciosAula13;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numeroDigitado = numero.nextInt();
		System.out.println("Numero digitado é : " + numeroDigitado);

	}

}
