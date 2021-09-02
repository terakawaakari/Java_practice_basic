package algorithm;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println(">");
			String param = scan.next();

			if (param.equals("EXIT")) {
				break;
			} else {
				System.out.println("未入力です");
			}
		}
	scan.close();
	}
}
