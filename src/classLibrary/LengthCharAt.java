package classLibrary;

public class LengthCharAt {
	public static void main(String[] args) {
		String str = "Java学習開始";
		char ch1 = str.charAt(0);
		char ch7 = str.charAt(6);
		int len = str.length();

		System.out.println("strの1番目の文字は" + ch1 + "です");
		System.out.println("strの7番目の文字は" + ch7 + "です");
		System.out.println("strの文字の長さは" + len + "です");
	}
}
