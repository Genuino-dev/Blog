
public class News extends Post {

	private String source;

	public void show() {
		super.show();
		System.out.println(" The source is: " + this.source);
	}

	public String getsource() {
		return source;
	}

	public void setsource(String source) {
		this.source = source;
	}
}