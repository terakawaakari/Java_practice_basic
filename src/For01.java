
public class For01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}

		int[] array = { 1, 2, 3, 4, 5 };
		for (int number2: array) {
			System.out.println("For02 = " + number2);
		}

		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}

		for (int count2 = 0; count2 < 5; count2++) {
			if (count2 == 2) {
				continue;
			}
			System.out.println("Continue01 = " + count2);
		}

		int number3 = 1;
		printNum(number3);
	}
	public static int printNum(int number) {
		if (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
			printNum(number);
		}
		return number;
	}
}
