package model.application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int qtd = 1;
		int cont = 0;
		double soma = 0;
		double notas;
		char op;
		do {
		
				System.out.print("\nInforme a nota do " + qtd + "º Aluno: ");
				notas = sc.nextDouble();
				soma += notas;
				qtd++;
				cont++;
				sc.nextLine();
				
			
			System.out.print("\nDeseja cadastrar " + qtd + "ª Nota? (S/N): ");
			 op = sc.next().charAt(0);
			
		}while( op == 's' || op == 'S');
		
		System.out.println(" Media Aritmetica = " + soma/cont);
		
		sc.close();
	}

}
