package ExerciciosAula13;

import java.util.Scanner;

public class ConverterFarenheitParaCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
	
		double fahrenheit = scan.nextDouble();
		
		
		double celsius = (5*(fahrenheit-32)/9 );
		
		System.out.println("A temperatura em Celsius é: " + celsius + "°C");

	}

}
