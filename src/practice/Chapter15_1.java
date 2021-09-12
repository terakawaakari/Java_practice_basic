package practice;

public class Chapter15_1 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcb(a, b) + "です");
	}

	public static int gcb(int a, int b) {
		int notMatch = a % b;

		if (notMatch == 0) {
			return b;
		}
		return gcb(b, notMatch);
	}
}
