package collectionFramework;
import java.util.Scanner;

public class p{

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = keyboardInput.nextLine();
		String Original = str;
		
		String reverse = "";
		
		int length = str.length();
		
		for(int i = length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);}
			if(Original.equals(reverse)) {
				System.out.println("This is a palindrome");
				
			}else {
				System.out.println("This is not a palindrome");
			}
		System.out.println(reverse);}
	}
