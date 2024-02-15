package javaPrograms;

public class ObjectInstance {
	String name;
	String major;
	double gpa;
	String gender;
	
	public ObjectInstance(String name, String address, double gpa, String gender) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
		this.gender = gender;
	}
	public boolean isOnHonorRoll() {
		if(this.gpa >= 3.5) {
			return true;
		}
		return false;
	}

}
