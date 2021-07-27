package ExerciciosAula13;

import java.util.Scanner;

public class velocidadeDownload {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do arquivo para Download em MB");
		double arquivoMb = scan.nextDouble();
		
		System.out.println("Digite a velocidade do link de internet em Mbps");
		double velocidadeMbps = scan.nextDouble();
		
		double tempoDownloadSegundos = arquivoMb / (velocidadeMbps / 8);
		double tempoDownloadMinutos = tempoDownloadSegundos / 60;
		
		
		System.out.println("Tempo estimado para download em segundos é: " + tempoDownloadSegundos);
		System.out.println("Tempo estimado para download em minutos é: " + tempoDownloadMinutos);

	}

}
