import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Blog {

	Scanner input = new Scanner(System.in);
	private List<Post> posts = new ArrayList<Post>();

	void showAll() {

		if (this.posts.size() == 0) {
			System.out.println(" The list is Empty! ");
		}
		for (int i = 0; i < this.posts.size(); i++) {
			posts.get(i).show();
		}
	}

	public void AddPost(Post post) {
		this.posts.add(post);
	}

	public void readData(Post post) {
		System.out.println("Write down the title of your post");
		post.setTitle(input.next());
		System.out.println("Write down the content");
		post.setContent(input.next());

		if (post instanceof News) {
			System.out.println("Write down the source ");
			News news = (News) post;
			news.setsource(input.next());
		}
		if (post instanceof Product) {
			System.out.println("Write down the brand");
			Product product = (Product) post; // downcast
			product.setbrand(input.next());
			System.out.println("Insert how much stars");
			product.setstars(input.nextInt());
		}
		this.posts.add(post);
	}

	void likePost() {
		System.out.println("Write the code that you like");
		int code = input.nextInt();
		try {
			Post post = this.posts.get(code);
			post.setLikes(post.getLikes() + 1);

		} catch (IndexOutOfBoundsException erro) {
			System.out.println("The value doesn't exist " + code);
		}
	}

	void dislikePost() {
		System.out.println("Wite down the code that you dislike");
		int code = input.nextInt();
		try {
			Post post = this.posts.get(code);
			post.setDislikes(post.getDislikes() + 1);
		} catch (IndexOutOfBoundsException error) {
			System.out.println("The value doesn't exist " + code);
		}
	}

	public void date() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Date date = null;
		System.out.println(formatter.format(date));
	}
}