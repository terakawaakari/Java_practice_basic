package capsule;

public class Books1 {
	private String title;
	private int price;

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return this.price;
	}

	void show() {
		System.out.println("この本のタイトルは" + this.title + "で、値段は" + this.price + "です");
	}
}
