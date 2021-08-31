package practice;

public class Test {
	public static void main(String[] args) {
		int f = 0;
		System.out.println(f);

		f = 1;
		System.out.println(f);

		for (int i = 2; i < 10; i++) {
			f = (i-1) + (i-2);
			System.out.println(f);
		}
	}
}
