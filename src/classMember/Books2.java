package classMember;

public class Books2 {
	private static int count = 0;
	private String title;
	private int price;
	private int number;

	public Books2(String title, int price) {
		count ++;
		this.title = title;
		this.price = price;
		this.number = Books2.count;
	}

	public void showBook() {
		System.out.println("この本のタイトルは" + title + "、価格は" + price + "です。");
		System.out.println("生成番号は" + number + "です。");
	}

	public static int getCount() {
		return count;
	}
}
