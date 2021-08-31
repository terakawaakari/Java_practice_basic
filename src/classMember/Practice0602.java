package classMember;

import java.util.Scanner;

public class Practice0602 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("本のタイトルを入力してください");
			String title = scan.next();
			System.out.println("本の価格を入力してください");
			int price = scan.nextInt();

			Books2 book1 = new Books2(title, price);
			book1.showBook();
		}

		System.out.println("本の生成回数は「" + Books2.getCount() + "」回です。");

		scan.close();
	}
}
