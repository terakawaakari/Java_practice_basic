package practice;

public class Books3 {
	private String title;
	private int price;

	public Books3() {
		this.title = null;
		this.price = 0;
		System.out.println("本を作成しました");
	}

	public void setBook(String title, int price) {
		this.title = title;
	}
	public void showBook() {
		System.out.println("この本のタイトルは" + this.title + "です");
	}
}
