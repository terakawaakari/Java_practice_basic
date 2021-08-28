package practice;

public class Practice0701 {
	public static void main(String[] args) {
		Books book = new Books();

		book.setTitle("Java基礎テキスト");
		book.setPrice(2980);

		System.out.println("本のタイトルは" + book.getTitle() + "です。");
		System.out.println("本の価格は" + book.getPrice() + "です。");
	}
}
