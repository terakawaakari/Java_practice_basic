package algorithm;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.print(">");
			String param = scan.nextLine();

			if (param.equals("EXIT")) {
				break;
			} else if (param.equals("")) {
				System.out.println("未入力です");
			} else {
				System.out.println(param);
			}
		}
	scan.close();
	}
}
