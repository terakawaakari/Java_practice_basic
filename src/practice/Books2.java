package practice;

public class Books2 {
	private String title;
	private int price;

	public Books2(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void setBookInfo(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public void showBookInfo() {
		System.out.println("この本のタイトルは" + this.title + "です");
		System.out.println("この本の価格は「" + this.price + "」円です。");
		System.out.println("-------------------------------------------");
	}
}
