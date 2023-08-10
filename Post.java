import java.util.*;

public class Post {

	private String title;
	private int date;
	private String content;
	private int likes;
	private int dislikes;

	public void show() {
		System.out.println("The title is: " + this.title);
		System.out.println(" Date:  " + this.date);
		System.out.println(" Content: " + this.content);
		System.out.println(" Likes: " + this.likes);
		System.out.println(" Dislikes: " + this.dislikes);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {

		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}

}
