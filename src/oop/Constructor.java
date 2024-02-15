package oop;

public class Constructor {
	String name,gender;
	int id;
	
	Constructor(String n,String m,int ph){
		name=n;
		gender=m;
		id=ph;
	}
	
	public void displayinformation() {
		System.out.println("Name: "+name);
		System.out.println(gender);
		System.out.println("id no: "+id);
		System.out.println();
	}

}
