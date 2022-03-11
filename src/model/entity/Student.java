package model.entity;

import model.services.AvarengMediasService;

public class Student implements AvarengMediasService{
	
	private String name;
	private int age;
	private double noteOne;
	private double noteTwo;
	private double noteThree;
	
	
	
	public Student() {
	}
	public Student(String name, int age, double noteOne, double noteTwo, double noteThree) {
		this.name = name;
		this.age = age;
		this.noteOne = noteOne;
		this.noteTwo = noteTwo;
		this.noteThree = noteThree;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getNoteOne() {
		return noteOne;
	}
	public void setNoteOne(double noteOne) {
		this.noteOne = noteOne;
	}
	
	public double getNoteTwo() {
		return noteTwo;
	}
	public void setNoteTow(double noteTwo) {
		this.noteTwo = noteTwo;
	}
	
	public double getNoteThree() {
		return noteThree;
	}
	public void setNoteThree(double noteThree) {
		this.noteThree = noteThree;
	}
	
	
	@Override
	public double calcMedia(double noteOne, double noteTwo, double noteThree) {
		double calcMedia = ((noteOne + noteTwo + noteThree) / 3);
		return calcMedia;
	}
	
	
	
	 
	@Override
	public double largerNote( double noteOne, double noteTwo, double noteThree) {
		
		double nota[] = new double[] {getNoteOne(), getNoteTwo(), getNoteTwo()};
		double maior = nota[0];
		
		for (int i = 0; i < nota.length; i++) {
			
			if(nota[i] > maior) {
				maior += nota[i];
			}
		}
		return maior;
	}
		 
  
	
	@Override
	public double smallNote(double noteOne, double noteTwo, double noteThree) {
		 
		double nota[] = new double[] {getNoteOne(), getNoteTwo(), getNoteTwo()};
		double menor = nota[0];
 
		
		for (int i = 0; i > nota.length; i++) {
			
			if(nota[i] < menor) {
				menor += nota[i];
			}
		}
		return menor;
            
    }
	
	
	public String toString() {
		
		return "\n" + "Small Note = " + smallNote(getNoteOne(), getNoteTwo(), getNoteTwo() ) +
			   "\n" + "Larger Note = " + largerNote(getNoteOne(), getNoteTwo(), getNoteTwo() ) +
			   "\n" + "Arithimetic Media = " + calcMedia(noteOne, noteTwo, noteThree) + "\n";
	}
	
}
