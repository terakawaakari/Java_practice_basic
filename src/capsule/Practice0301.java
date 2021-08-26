package capsule;

public class Practice0301 {
	public static void main(String[] args) {
		Books2 book1 = new Books2();
		Books2 book2 = new Books2();

		book1.setTitle("Java入門テキスト");
		book1.setPrice(2580);
		book1.show();

		book2.setTitle("Java基礎テキスト");
		book2.setPrice(-3800);
		book2.show();
	}
}
