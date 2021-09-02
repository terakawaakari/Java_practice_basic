package algorithm;

import java.util.Calendar;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("今日は何月何日でしょう？");
		System.out.print("何月？==>");
		int m = scan.nextInt();
		System.out.print("何日？ ==>");
		int d = scan.nextInt();

		Calendar cal = Calendar.getInstance();
		int mon = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		if ( m == mon && d == day) {
			System.out.println("正解！");
		} else {
			System.out.println("間違っています");
		}
	}
}
