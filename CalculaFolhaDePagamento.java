package ExerciciosAula13;

import java.util.Scanner;

public class CalculaFolhaDePagamento {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Qual seu salario por hora?");
		double salarioHora = scan.nextDouble();

		System.out.println("Quantas horas trabalhadas este mês?");
		double mesHoras = scan.nextDouble();

		double salarioTotal = salarioHora * mesHoras;

		double taxaImposto = 0.11;
		double taxaInss = 0.08;
		double taxaSindicato = 0.05;

		double impostoDeRenda = salarioTotal * taxaImposto;
		double inss = salarioTotal * taxaInss;
		double sindicato = salarioTotal * taxaSindicato;
		double salarioLiquido = salarioTotal - impostoDeRenda - inss - sindicato;
		
		//calcular total de desconto

		System.out.println("Salario Bruto deste mês é: " + salarioTotal);
		System.out.println("Desconto do Imposto de renda: " + impostoDeRenda);
		System.out.println("Desconto do INSS: " + inss);
		System.out.println("Desconto do Sindicato: " + sindicato);
		System.out.println("Salario liquido : " + salarioLiquido);

	}

}
