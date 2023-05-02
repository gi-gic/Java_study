package 객체_ArrayList;

public class Mp3 {
	
	private String title;
	private String singer;
	private String path; 
	
	public Mp3(String title, String singer, String path) {
		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}
	public String getPath() {
		return path;
	}
}
