package model.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entity.Student;



public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Student> student = new ArrayList<>();
		
		
		int qtd = 1;
		int cont = 0;
		double soma = 0;
		double notas;
		char op;
		
		
		
		do {
		
				System.out.print("\nNome do " + qtd + "º Aluno: ");
				String name = sc.nextLine();
			//	sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				System.out.println("Informe a 1ª Nota: ");
				double noteOne = sc.nextDouble();
				System.out.println("Informe a 2ª Nota: ");
				double noteTwo = sc.nextDouble();
				System.out.println("Informe a 3ª Nota: ");
				double noteThree = sc.nextDouble();
				
				soma += noteOne + noteTwo + noteThree;
				qtd++;
				
				student.add(new Student(name, age, noteOne, noteTwo, noteThree));
				cont++;
				
	//			ArithmeticMediaService arithmeticMedia = new ArithmeticMediaService() ;
				
			System.out.print("\nDeseja cadastrar " + qtd + "ª Nota? (S/N): ");
			 op = sc.next().charAt(0);
			
		}while( op == 's' || op == 'S');
		
		
		
		
		System.out.print("\nMenor Nota = "  );
		System.out.println("\nMaior Nota = ");
		System.out.println (student);
			
		
		sc.close();
	}
}
	

