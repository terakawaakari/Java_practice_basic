package algorithm;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String formula = scan.nextLine();
		String[] nums = formula.split(" ");

		int num1 = Integer.parseInt(nums[0]);
		int num2 = Integer.parseInt(nums[2]);

		if (formula.contains("+")) {
			System.out.println(num1 + num2);
		} else if (formula.contains("-")) {
			System.out.println(num1 - num2);
		} else if (formula.contains("*")) {
			System.out.println(num1 * num2);
		} else if (formula.contains("/")) {
			System.out.println(num1 / num2);
		}

		scan.close();
	}
}
