package practice;

public class Books3 {
	private String title;

	public Books3() {
		this.title = null;
		System.out.println("本を作成しました");
	}

	public void setBook(String title) {
		this.title = title;
		System.out.println("この本のタイトルは" + title + "です");
	}
	public void showBook() {
		System.out.println("この本のタイトルは" + this.title + "です");
	}
}
