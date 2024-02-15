package javaPrograms;

public class StaticClassAttributesSub {

	private String title;
	private String artist;
	private int lenth;
	private static int count=0;
	
	public StaticClassAttributesSub(String title, String artist, int lenth) {
		this.title = title;
		this.artist = artist;
		this.lenth = lenth;
		count++;
		System.out.println("total " +count);
		
	}
	public int getCount() {
		return count;
	}
	public void setArtist(String artist) {
		this.artist=artist;
	}
	public String getArtist() {
		return artist;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
		
	}
	public void setLenth(int lenth) {
		this.lenth=lenth;
	}
	public int getLenth() {
		return lenth;
	}
}
