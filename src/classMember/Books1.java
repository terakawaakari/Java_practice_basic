package classMember;

public class Books1 {
	private static int count = 0;
	private String title;
	private int price;
	private int number;

	public Books1(String title, int price) {
		count++;
		this.title = title;
		this.price = price;
		this.number = Books1.count;
	}

	public static void main(String[] args) {
		Books1 book = new Books1("Java入門" , 2980);
		System.out.println(book.title + book.price + book.number);
	}
}
