package javaPrograms;

public class method {

	public static void main(String[] args) {
		System.out.println("Top");
		sayhi();
		System.out.println("Bottom");
		
		String myname="Mathew";
		sayhello(myname, 32);
		sayHI("Boby");
		sayHI("Martial");
		

	}
	public static void sayhi() {
		System.out.println("Hi Mathew");
		System.out.println("Hi Deshtany");
	}

public static void sayHI(String name) {
	System.out.println("Hello "+name);
}

	
	public static void sayhello(String name, int age) {
		System.out.println("Hi "+name+" you are "+age);
	}
	

}
