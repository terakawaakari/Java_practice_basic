package capsule;

public class Books2 {
	private String title;
	private int price;

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		if (price < 0) {
			this.price = 0;
			System.out.println("設定する値が" + price + "のため、価格は0を設定しました");
		} else {
			this.price = price;
		}
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
