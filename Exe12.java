package lista03;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		System.out.println("Digite a temperatura em graus celsius");
		double celsius = sc.nextDouble();
		
	    double resultado = celsius/5 + (fahrenheit-32)/9;
		
	    System.out.printf("O valor correspondente em graus celsius é: " + resultado);
	    
	    sc.close();
	}
	
}
