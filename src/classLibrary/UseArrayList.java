package classLibrary;

import java.util.ArrayList;

public class UseArrayList {
	public static void showArrayListData (ArrayList<String> tmpstrList) {
		for (int i = 0; i < tmpstrList.size(); i++) {
			System.out.println((i + 1) + "つ目のデータは" + tmpstrList.get(i) + "です");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();

		strList.add("Goood morning");
		System.out.println("1つ目追加時の全データは" + strList + "です");

		strList.add("Hello");
		System.out.println("2つ目追加時の全データは" + strList + "です");

		strList.add("Bye");
		System.out.println("3つ目追加時の全データは" + strList + "です");

		System.out.println("格納されているデータは" + strList.size() + "つです");

		for (String strData : strList) {
			System.out.println("格納データは" + strData + "です");
		}

		strList.set(2, "GoodBye");
		showArrayListData(strList);

		int index = strList.indexOf("Hello");

		if (index != -1) {
			System.out.println("Helloは要素番号「" + index + "」に格納されています");
		} else {
			System.out.println("Helloは見つかりませんでした");
		}

		strList.remove(1);
		showArrayListData(strList);
		index = strList.indexOf("Hello");
		if (index != -1) {
			System.out.println("Helloは要素番号「" + index + "」に格納されています");
		} else {
			System.out.println("Helloは見つかりませんでした");
		}

		strList.clear();
		if (strList.isEmpty()) {
			System.out.println("データは1件もありません");
		} else {
			showArrayListData(strList);
		}

	}
}
