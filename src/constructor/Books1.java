package constructor;

public class Books1 {
	private String title;
	private int price;

	public Books1() {
		this.title = null;
		this.price = 0;
	}

	public Books1(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void show() {
		System.out.println(title + price);
	}
}
