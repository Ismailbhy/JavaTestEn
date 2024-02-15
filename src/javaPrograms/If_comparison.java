package javaPrograms;

public class If_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(12,30,200 ));

	}
	public static int max(int num1,int num2,int num3){
		if(num1>= num2 && num1>=num3) {
			return num1;}
		else if (num2 >= num1 && num2>=num3) {
			return num2;}
		else {
			return num3;
		}

	}
		
	}
