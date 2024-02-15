package javaPrograms;

public class GettersSetters {
	public static void main(String[] args) {
		MovieGS movie=new MovieGS("Dirilis Egtugrul","Ahmed Bogdag","P3");
		MovieGS movie2=new MovieGS("AlpArsalan Büyük Selsuklu","Kübra Şen","P4");
		
		movie2.setRating("Dog");
		System.out.println(movie2.getRating());
	}

}
