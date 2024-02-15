package javaPrograms;

public class ClassesObjects {

	public static void main(String[] args) {
		
		Student myStudent = new Student();
		myStudent.firstName = "Amaya";
		myStudent.id = "ab123";
		myStudent.major="ComputerScince";
		myStudent.gender = 'f';
		myStudent.gpa=3.3;
		myStudent.age =27;
		myStudent.onProbation= false;

		
		Student myStudent1 = new Student();
		myStudent1.firstName = "Abid";
		myStudent1.id = "ab124";
		myStudent1.major="ComputerScince";
		myStudent1.gender = 'm';
		myStudent1.gpa=3.0;
		myStudent1.age =26;
		myStudent1.onProbation= true;
		
		
		System.out.println(myStudent1.age);
	}

}
