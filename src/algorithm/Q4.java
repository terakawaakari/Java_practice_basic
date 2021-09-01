package algorithm;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] params = line.split(" ");
		int sum = calc(params, 0, params.length - 1);
		System.out.println(sum);
	}


	public static int calc(String[] params, int startIdx, int endIdx) {
		int sum = 0;
		String type = null;
		for(int i = startIdx; i < endIdx + 1; i++) {
			if (params[i].equals("+") || params[i].equals("-") ) {
				type = params[i];
			} else if (params[i].equals("(") || params[i] == "「") {
				int endOfFormula = checkEndOfFormula(params, i);
				if (type != null) {
					if (type.equals("+")) {
						sum += calc(params, i + 1, endOfFormula -1);
					}
				} else {
					int num = Integer.parseInt(params[i]);
					if (type.equals("+")) {
						sum += num;
					} else if (type.equals("-")) {
						sum -= num;
					} else {
						sum = num;
					}
				}
			}
		}
		return sum;
	}

	public static int checkEndOfFormula(String[] params, int startIdx) {
		int end = startIdx + 1;
		int startCount = 0;
		for ( int i = startIdx + 1; i < params.length; i++) {
			end = i;
			if (params[i].equals("(")) {
				startCount++;
			} else if (params[i].equals(")")) {
				if (startCount == 0) {
					break;
				} else {
					startCount--;
				}
			}
		}
		return end;
	}
}
