package input_output;

import java.util.ArrayList;

public class FileInOutData2 {
	public static void main(String[] args) {
		int sum = 0;
		double ave = 0.0;
		String[] strData = null;
		String strLine = null;

		ArrayList<String> subList = new ArrayList<String>();
		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		FileIn in = new FileIn();
		FileOut out = new FileOut();

		if (in.open("subject_data.csv") == false) {
			System.exit(1);
		}

		while((strLine = in.readLine()) != null) {
			strData = strLine.split(",");

			subList.add(strData[0]);
			scoreList.add(Integer.parseInt(strData[1]));
		}

		if (in.close() == false) {
			System.exit(2);
		}
		System.out.println("ファイルの読み込みが終了しました");

		if (out.open("statistics.txt") == false) {
			System.exit(3);
		}

		for (int i=0; i < scoreList.size(); i++) {
			out.writeIn(subList.get(i) + "<--->" + scoreList.get(i));
			sum += scoreList.get(i);
		}
		out.writeIn("合計点：" + sum);
		ave = (double) sum / scoreList.size();
		out.writeIn("平均点：" + ave);

		if (out.close() == false) {
			System.exit(4);
		}
		System.out.println("ファイルへの書き込みが終了しました");


	}
}
