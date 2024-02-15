package javaPrograms;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num=in.nextInt();
		
		int original=num;
		int reverse=0;
		
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(original==reverse) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}

	}

}
