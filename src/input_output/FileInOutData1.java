package input_output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileInOutData1 {
	public static void main(String[] args) {
		int sum = 0;
		double ave = 0.0;
		String[] strData = null;

		ArrayList<String> subjectList = new ArrayList<String>();
		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		try {
			Scanner sin = new Scanner(new File("subject_data.csv"));

			while (sin.hasNextLine()) {
				strData = sin.nextLine().split(",");
				subjectList.add(strData[0]);
				scoreList.add(Integer.parseInt(strData[1]));
			}
			sin.close();
			System.out.println("ファイルの読み込みが終了しました");

			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
					"statistics.txt")));

			for (int i = 0; i< scoreList.size(); i++) {
				pw.println(subjectList.get(i) + "<--->" + scoreList.get(i));
				sum += scoreList.get(i);
			}
			pw.println("合計点：" + sum);

			ave = (double) sum / scoreList.size();
			pw.println("平均点：" + ave);

			pw.close();
			System.out.println("ファイルへの書き込みが終了しました");
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません");
		} catch (IOException e) {
			System.out.println(e + "入出力エラーです");
		}
	}
}
