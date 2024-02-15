package javaPrograms;
import java.util.Scanner;

public class buldingaBetterCalcultor {

	public static void main(String[] args) {
		Scanner keybordinput = new Scanner(System.in);
	
		
		System.out.println("Enter the first number: ");
		double num1= keybordinput.nextDouble();
		

		System.out.println("Enter an oparetor: ");
		String op = keybordinput.next();


		System.out.println("Enter the second number: ");
		double num2= keybordinput.nextDouble();
		if(op.equals("+")) {
			System.out.println(num1+num2);
			}else if(op.equals("-")) {
				System.out.println(num1-num2);
			}else if(op.equals("*")) {
				System.out.println(num1*num2);
			}else if(op.equals("/")) {
				System.out.println(num1/num2);
			}else {
				System.out.println("Invalid operator");
			}


	}

}
