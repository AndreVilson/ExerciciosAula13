package ExerciciosAula13;

import java.util.Scanner;

public class ConverterCelsiusParaFahrenheit {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite a temperatura em Celsius: ");
			double celsius = scan.nextDouble();
			
			double fahrenheit = celsius * 9 / 5 +32;
			
			System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);	

	}

}
