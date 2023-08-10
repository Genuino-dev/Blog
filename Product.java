
public class Product extends Post {

	private String brand;
	private int stars;

	public String getbrand() {
		return brand;
	}

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public int getstars() {
		return stars;
	}

	public void setstars(int stars) {
		this.stars = stars;
	}

	public void show() {

		super.show();
		System.out.println(" The brand is: " + this.brand);
		System.out.println("Stars: " + this.stars);
	}
}
