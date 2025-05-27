package lista03;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite o número total de eleitores: ");
		double eleitores = sc.nextInt();
        
		System.out.println("Digite o número de votos brancos: ");
		double votoBrancos = sc.nextInt();
         
		System.out.println("Digite o número de votos nulos: ");
		double votoNulos = sc.nextInt();

		System.out.println("Digite o número de votos válidos: ");
		double votoValidos = sc.nextInt();
        
		
		double votoBrancos1 = (double) votoBrancos / eleitores * 100;
		double votoNulos1 = (double) votoNulos / eleitores * 100;
		double votoValido1   = (double) votoValidos / eleitores * 100;
        
		
		System.out.println("Percentual de votos brancos: %.2f%%\n" + votoBrancos1);
		System.out.println("Porcentual de votos nulos: %.2f%%\n" + votoNulos1);
		System.out.println("Percentual de votos válidos %.2f%%\n: "+ votoValido1);
		
		sc.close();
		
		
	}
}
