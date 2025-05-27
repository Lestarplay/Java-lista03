package lista03;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI*Math.pow(raio,2);
		
		System.out.printf("A área do círculo com raio %.2fé: %.2f\n",raio,area);
		
		sc.close();
	}
}
