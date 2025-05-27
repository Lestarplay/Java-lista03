package lista03;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite o número de carros vendidos: ");
	        int carrosVendidos = sc.nextInt();

	        System.out.print("Digite o valor total das vendas: ");
	        double totalVendas = sc.nextDouble();

	        System.out.print("Digite o salário fixo: ");
	        double salarioFixo = sc.nextDouble();

	        System.out.print("Digite o valor recebido por carro vendido: ");
	        double valorPorCarro = sc.nextDouble();

	        
	        double comissaoCarros = carrosVendidos * valorPorCarro;
	        double comissaoVendas = totalVendas * 0.05;
	        double salarioFinal = salarioFixo + comissaoCarros + comissaoVendas;

	        
	        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

	        sc.close();
	    }
	
			
		
	}

