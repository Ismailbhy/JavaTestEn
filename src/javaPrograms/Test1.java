package javaPrograms;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String str = keyboardInput.nextLine();
		String Original = str;
		
		String reverse = "";
		
		int length = str.length();
		for(int i = length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(Original.equals(reverse)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(reverse);

	}

}
