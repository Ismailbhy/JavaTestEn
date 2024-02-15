package javaPrograms;

public class BuldingAnExponentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = pow(4, 3);
		System.out.println(Math.pow(4, 3));
		System.out.println(result);

	}
	public static int pow(int baseNum, int powNum){
		int result = 2;	
		for(int i =0; i<powNum;i++) {
			result = result * baseNum;
		}
		return result;
	}

}
