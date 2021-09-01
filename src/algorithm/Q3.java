package algorithm;

import java.util.Scanner;

public class Q3 {
//	public static void plus(int n1, int n2) {
//		System.out.println(n1 + n2);
//	}
//
//	public static void minus(int n1, int n2) {
//		System.out.println(n1 -n2);
//	}
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String f = scan.nextLine();
//
//		String[] nums = f.split(" ");
//		int num1 = Integer.parseInt(nums[0]);
//		String type1 = nums[1];
//		int num2 = Integer.parseInt(nums[2]);
//		String type2 = nums[3];
//		int num3 = Integer.parseInt(nums[4]);
//
//		if (type1.equals("+")) {
//			int sum = num1 + num2;
//			if (type2.equals("+")) {
//				plus(sum, num3);
//			} else if (type2.equals("-")) {
//				minus(sum, num3);
//			}
//		} else if (type1.equals("-")) {
//			int sum = num1 - num2;
//			if (type2.equals("+")) {
//				plus(sum, num3);
//			} else if (type2.equals("-")) {
//				minus(sum, num3);
//			}
//		}
//
//		scan.close();
//	}


//	リファクタリング
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String f = scan.nextLine();
		String[] nums = f.split(" ");

		String type = null;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i].equals("+") || nums[i].equals("-")) {
				type = nums[i];
			} else {
				int num = Integer.parseInt(nums[i]);
				if (type != null) {
					if (type.equals("+")) {
						sum += num;
					} else if (type.equals("-")) {
						sum -= num;
					}
				} else {
					sum = num;
				}
			}
		}
		System.out.println(sum);
		scan.close();
	}
}
