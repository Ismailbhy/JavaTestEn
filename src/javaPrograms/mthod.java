package javaPrograms;

public class mthod {

	public static void main(String[] args) {
		String phrase = "giraffe";
		System.out.println("Hello "+phrase.toUpperCase());
		System.out.println("Hello "+phrase.toLowerCase());
		System.out.println("Hello "+phrase.length());
		System.out.println("Hello "+phrase.charAt(0));
		System.out.println("Hello "+phrase.charAt(phrase.length()-1));
		System.out.println("Hello "+phrase.substring(3));
		System.out.println("Hello "+phrase.substring(0,3));
		System.out.println("Hello "+phrase.substring(phrase.length()-3));
		System.out.println(phrase.contains("giraffe"));

	}

}
