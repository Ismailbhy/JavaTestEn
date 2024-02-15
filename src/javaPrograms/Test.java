package javaPrograms;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keyboardInput.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
