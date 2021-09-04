package input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFileData {
	public static void main(String[] args) {
		String[] strArray = {"◾️世界の「ありがとう」",
				"日本語はありがとう",
				"韓国語はカムサハムニダ",
				"英語はサンキュー",
				"中国語はシェシェ",
				"ネパールごはダンニャバード",
				"ドイツ語はダンケシェーン",
				"スペイン語はグラシァス"};
		try {
			PrintWriter pw = new PrintWriter
					(new BufferedWriter(new FileWriter("output2.txt")));
			for (int i = 0; i < strArray.length; i++) {
				pw.println(strArray[i]);
			}
			pw.close();
			System.out.println("ファイルに書き込みが終了しました");
		} catch (IOException e){
			System.out.println(e + "出力エラーです");
		}
	}
}
