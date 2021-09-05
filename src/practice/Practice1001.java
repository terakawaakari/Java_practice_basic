package practice;

import input_output.FileIn;
import input_output.FileOut;

public class Practice1001 {
	public static void main(String[] args) {
		FileIn in = new FileIn();
		FileOut out = new FileOut();
		String strLine = null;

		if (out.open("practice.txt") == false) {
			System.exit(1);
		}

		out.writeIn("Java基礎");
		out.writeIn("ファイル入出力の練習問題を実施中");

		if (out.close() == false) {
			System.exit(2);
		}

		if (in.open("practice.txt") == false) {
			System.exit(3);
		}
		while ((strLine = in.readLine()) != null) {
			System.out.println(strLine);
		}

		if (in.close() == false) {
			System.exit(4);
		}
	}
}
