package ExerciciosAula13;

import java.util.Scanner;

public class CalculaAreaComRaio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Digite o valor do Raio : ");
		double raio = scan.nextDouble();
		
		//double area = 3.14 * (raio * raio);
		double area = Math.PI * Math.pow(raio,  2);
		System.out.println("Total da área é : " + area);

	}

}
