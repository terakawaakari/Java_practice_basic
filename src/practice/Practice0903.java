package practice;

public class Practice0903 {
	public static void main(String[] args) {
		String[] title = {"Java超入門", "Java入門", "Java基礎", "Java応用", "Java超応用"};
		int[] price = {800, 1200, 1800, 2500, 3000};

		Books2[] Books = new Books2[5];

		for (int i = 0; i < Books.length; i++) {
			Books2 book = new Books2(title[i], price[i]);
			Books[i] = book;
		}

		for (int i = 0; i < Books.length; i++) {
			Books[i].showBookInfo();
		}
	}
}
