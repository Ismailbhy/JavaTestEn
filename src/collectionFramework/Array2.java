package collectionFramework;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double[] number = new double[10];
		double sum=0;
		System.out.println("Enter 10 numbers: ");
		for (int i=0;i<5;i++) {
			number[i]=sc.nextDouble();
		}
		for(int i=0; i<5;i++) {
			sum=sum+number[i];
		}
		System.out.println("Sum is: "+sum);
		//double avg=sum/5;
		//System.out.println("Average is: "+avg);
	}

}
