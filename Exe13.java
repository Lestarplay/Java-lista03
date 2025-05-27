package lista03;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int n3 = sc.nextInt();
		
		int mediafinal = (n1 * 2 + n2 * 3 + n3 * 5)/10;
		
		System.out.println("A média final do aluno é: " + mediafinal);
		
		sc.close();
	}
	
}
