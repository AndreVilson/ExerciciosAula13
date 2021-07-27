package ExerciciosAula13;

import java.util.Scanner;

public class CalculaSalarioHoraPorMes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora? ");
		double salarioPorHora = scan.nextDouble();

		System.out.println("Quantas horas voê trabalhou este mês? ");
		double horasTrabalhadaNoMes = scan.nextDouble();
		
		double salarioTotalDoMes = salarioPorHora * horasTrabalhadaNoMes;
		System.out.println("Salário referente deste mês é: " + salarioTotalDoMes);

	}

}
