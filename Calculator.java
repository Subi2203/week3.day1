package week3.day1;

public class Calculator {
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	public void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public void multiply(Double num1, int num2) {
		System.out.println(num1*num2);
	}
	public void substract(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public void substract(double num1, double num2) {
		System.out.println(num1-num2);
	}
	public void divide(int num1, int num2) {
		System.out.println(num1/num2);
	}
	public void divide(double num1, int num2) {
		System.out.println(num1/num2);
	}
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add(35, 25);
		calc.add(12, 22, 32);
		calc.multiply(10, 20);
		calc.multiply(10.435, 20);
		calc.substract(10, 20);
		calc.substract(10.35, 20.230);
		calc.divide(30, 20);
		calc.divide(45.45, 20);

	}

}
