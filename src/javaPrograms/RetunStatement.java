package javaPrograms;

public class RetunStatement {

	public static void main(String[] args) {
		int myNum = cube(4);
		System.out.println(myNum);
		String myNum1 = cube1("0");
		System.out.println(myNum1);
		boolean myNum2 = cube2(5);
		System.out.println(myNum2);

	}
	public static int cube(int numberToCube) {
		System.out.println("top");
		return numberToCube * numberToCube * numberToCube;
		
		
	}
	public static String cube1(String numberToCube1) {
		System.out.println("top");
		return "apple";
		
	}
	public static boolean cube2(int numberToCube) {
		System.out.println("Top");
		return true;
		
		
	}


}
