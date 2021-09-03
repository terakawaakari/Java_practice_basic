package classLibrary;

public class StringEquals {
public static void main(String[] args) {
	String str1 = "おはようございます";
	String str2 = "こんにちは";
	String str3 = "さようなら";
	String str4 = "こんにちは";

	if (str1.equals("おはようございます")) {
		System.out.println("str1" + str1 + "の文字列は「おはようございます」");
	}

	if (str2.equals(str4)) {
		System.out.println("str2" + str2 + "とstr4" + str4 + "の文字列は同じです");
	}

	if (!str2.equals(str3)) {
		System.out.println("str2" + str2 + "とstr3" + str3 + "の文字列は違います");
	}
}
}
