package javaPrograms;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=keyboardInput.nextInt();
		System.out.println("Enter 2nd number: ");
		int num2=keyboardInput.nextInt();
		int result;
		for(int i=1;i<=10;i++) {
			result=num*num2;
			System.out.println(result+" x " +i+" = "+result*i);
			
		}

	}

}
