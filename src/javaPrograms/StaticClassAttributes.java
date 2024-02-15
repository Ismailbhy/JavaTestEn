package javaPrograms;

public class StaticClassAttributes {

	public static void main(String[] args) {
		StaticClassAttributesSub book1 = new StaticClassAttributesSub("Harry Potter","JK Rowling",500);
		StaticClassAttributesSub book2 = new StaticClassAttributesSub("The Da Vinci Code","Dan Brown",400);
		//System.out.println(book2.getArtist());
		
		System.out.println(book1.getCount());
		System.out.println(book2.getCount());
		
		StaticClassAttributesSub book3 = new StaticClassAttributesSub("Harry Potter","JK Rowling",500);
		
		System.out.println(book3.getCount());
		System.out.println(book1.getCount());
		System.out.println(book2.getCount());

	}

}
