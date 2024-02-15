package javaPrograms;
import java.util.Scanner;
public class madlibs {

	public static void main(String[] args) {
		Scanner keyboardInput=new Scanner(System.in);
		System.out.println("Einer any color: ");
		String Color=keyboardInput.nextLine();
		System.out.println("Einer any pluralnoun: ");
		String pluralnoun=keyboardInput.nextLine();
		System.out.println("Einer any calebrity name: ");
		String celebrity=keyboardInput.nextLine();
		System.out.println("Roses are "+Color+"\n"
				+pluralnoun+" are Blue \n"
				+ "I love "+celebrity);
		
		

	}

}
