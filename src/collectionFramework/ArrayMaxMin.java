package collectionFramework;

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {

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
		double avg=sum/5;
		System.out.println("Average is: "+avg);
		
		double max=number[0];
		double min=number[0];
		for(int i=1;i<5;i++) {
			if(max<number[i]) {
				max=number[i];
			}
			if(min>number[i]) {
				min=number[i];
			}
		}
		System.out.println("Max is: "+max);
		System.out.println("Min is: "+min);
		
	}

	}
