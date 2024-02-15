
package javaPrograms;
import java.util.Scanner;

public class Scannerapp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Hey "+name+"!");
		System.out.println("enter your age: ");
		int age=scan.nextInt();
		System.out.println("you are "+age+" old");
	}
}
