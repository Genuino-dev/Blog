
import java.util.Scanner;
import java.util.*;

public class Application {

	public static void main(String[] args) {

		Blog blog = new Blog();
		int opcao = -1;
		int code;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Welcome to our Blog! Tell us what you want to do? ");
			System.out.println("1- New post of notice");
			System.out.println("2- New review of product");
			System.out.println("3- New post of other subjects ");
			System.out.println("4- List all the posts");
			System.out.println("5- Like on post");
			System.out.println("6- Dislike on post");
			System.out.println("7- EXIT");
			System.out.println("Choose an option");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				Post post = new News();
				blog.readData(post);
				break;

			case 2:
				Post p = new Product();
				blog.readData(p);
				break;

			case 3:
				Post p1 = new Post();
				blog.readData(p1);
				break;

			case 4:
				blog.showAll();
				break;

			case 5:
				System.out.println("What is the code?");

				Post p2 = new Post();
				p2.setLikes(opcao);
				break;
			case 6:
				Post p3 = new Post();
				p3.setDislikes(opcao);

			case 7:
				System.out.println("Finishing our envirolment");
				break;
			}
		} while (opcao != 7);
	}
}
