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
	 
		
		String name;
		int age;
		double noteOne, noteTwo, noteThree;
		int qtd = 1;
		int cont = 0;
		double soma = 0;
		char op;
		
		do {
				System.out.print("\nNome do " + qtd + "º Aluno: ");
				name = sc.nextLine();
				sc.nextLine();
				System.out.print("Age: ");
				age = sc.nextInt();
				System.out.print("Informe a 1ª Nota: ");
				noteOne = sc.nextDouble();
				System.out.print("Informe a 2ª Nota: ");
				noteTwo = sc.nextDouble();
				System.out.print("Informe a 3ª Nota: ");
				noteThree = sc.nextDouble();
				
		//		soma += noteOne + noteTwo + noteThree;
				qtd++;
				
				student.add(new Student(name, age, noteOne, noteTwo, noteThree) );
				 
				cont++;
				
	
			System.out.print("\nDeseja cadastrar " + qtd + "ª Nota? (S/N): ");
			 op = sc.next().charAt(0);
			
		}while( op == 's' || op == 'S');
		
		System.out.println();
		 
		System.out.println (student);
			
		
		sc.close();
	}
}
	

