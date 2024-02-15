package p2;
import java.util.Scanner;

public class Namta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int nu = keyboardInput.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(nu+"x"+i+"="+(i*nu));
		}

	}

}
