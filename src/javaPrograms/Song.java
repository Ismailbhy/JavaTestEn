package javaPrograms;

public class Song {
	private String title;
	private String artist;
	private int lenth;
	
	public Song(String title, String artist, int lenth) {
		this.title = title;
		this.artist = artist;
		this.lenth = lenth;
	}
	
	public void palySong() {
		System.out.println("Playing " +title+" by "+artist+" for "+lenth+" seconds");
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}public void setArtist(String artist) {
		this.artist=artist;
	}
	public String getArtist() {
		return artist;
	}
	public void setLenth(int lenth) {
		this.lenth=lenth;
	}
	public int getLenth() {
		return lenth;
	}

}
