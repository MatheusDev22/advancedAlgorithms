package model.entity;

public class Student {

	double n1;
	double n2;
	double n3;
	char op;
	
	public Student() {
	}
	public Student(double n1, double n2, double n3, char op) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.op = op;
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public char getOp() {
		return op;
	}
	public void setOp(char op) {
		this.op = op;
	}
}
