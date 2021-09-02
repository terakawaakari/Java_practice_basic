package algorithm;

public class Q7 {
	public static void main(String[] args) {
		int n = args.length;

		if(n == 0) {
			System.out.println("引数に年齢を指定してください");
			return;
		} else {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int age = Integer.parseInt(args[i]);
				sum += age;
			}
			int ave = sum / n;
			System.out.println(ave);
		}
	}
}
