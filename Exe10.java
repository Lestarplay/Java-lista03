package lista03;

import java.util.Scanner;

public class Exe10 {
  
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o preço do Carro: ");
		double carroFabrica = sc.nextDouble();
		
		double percentualDistribuidor = 0.28;
		double percentualImpostos = 0.45;
		
		double custoDistribuidor = carroFabrica * percentualDistribuidor;
		double custoImposto = carroFabrica * percentualImpostos;
		
		double custoFinal = carroFabrica + custoDistribuidor + custoImposto;
		
		System.out.printf("O custo final do carro ao consumidor é: R$ %.2f\n", custoFinal);
		
		sc.close();
	}
	
}
