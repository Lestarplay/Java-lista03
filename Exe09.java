package lista03;

import java.util.Scanner;

public class Exe09 {
    
	public static void main(String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o salário mensal do Funcionario: ");
		double salarioAtual = sc.nextDouble();
		
        System.out.println("Digite o percentual de reajuste: ");
        double percentualReajuste = sc.nextDouble();
        
        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);
        
        System.out.printf("O novo salário do funcionario é: R$ %.2f%n", novoSalario);
        
        sc.close();
		
	}
	
}
