package javaPrograms;

public class ClassesObjectsContinued {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1=new Book();
		book1.title="Harry Potter";
		book1.author="JK Rowling";
		book1.publisher="Bloomsbury";
		book1.pages=400;
		book1.language="English";
		

		Book book2=new Book();
		book2.title="The 4 hour work week";
		book2.author="Timothy Ferriss";
		book2.publisher="HarperCollins";
		book2.pages=320;
		book2.language="English";
		System.out.println(book2.title);
	}

}
