package classLibrary;

public class StringSplit {
	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "AB:CD:EF";

		System.out.println("str1の先頭から3文字目は" + str1.substring(0, 3) + "です");
		System.out.println("str1の3文字目から最後の文字は" + str1.substring(2) + "です");

		String[] strArray = str2.split(":");

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(":で分割した" + (i + 1) + "つ目の文字列は" + strArray[i] + "です");
		}
	}
}
