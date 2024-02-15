package javaPrograms;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int []nums= {1,2,3,4,5};
		//System.out.println(nums[5]);

		try {
			//System.out.println(nums[5]);
			double num =keyboardInput.nextDouble();
			System.out.println(num);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//EXCEPTION E IS A CLASS,OR A DATA TYPE IN JAVA
			//System.out.println("Invalid input");
			System.out.println(e);
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}catch(Exception e) {
			
		}catch(Throwable e) {
			
		}
	}

}
