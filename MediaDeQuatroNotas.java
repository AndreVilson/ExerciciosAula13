package ExerciciosAula13;

import java.util.Scanner;

public class MediaDeQuatroNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota 1 : ");
		int nota1 = scan.nextInt();
		

		System.out.println("Digite a nota 2 : ");
		int nota2 = scan.nextInt();
		
		System.out.println("Digite a nota 3 : ");
		int nota3 = scan.nextInt();
		
		System.out.println("Digite a nota 4 : ");
		int nota4 = scan.nextInt();
		
		
		double media = (nota1 + nota2 + nota3 + nota4)/4 ;
		System.out.println("A media das notas é : " +  media);

	}

}
