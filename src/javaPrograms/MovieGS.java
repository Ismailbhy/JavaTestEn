package javaPrograms;

public class MovieGS {
	private String title;
	private String director;
	private String rating;
	
	public MovieGS(String title, String director, String rating) {
		this.setTitle(title);
		this.setDirector(director);
		this.setRating(rating);
	}

	public void setRating(String rating) {
		if(rating.equals("G")|| rating.equals("R") || rating.equals("p-13")) {
		this.rating=rating;
		}else {
			this.rating="NR";
		}
		
	}
	public String getRating() {
		return rating;
		}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setDirector(String director) {
		this.director=director;
	}
	public String getDirector() {
		return director;
	}
	
}
