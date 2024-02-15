package javaPrograms;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num1 = keyboardInput.nextDouble();
		System.out.print("Enter another number: ");
		double num2 = keyboardInput.nextDouble();
		System.out.println(num1 + num2);

	}

}
