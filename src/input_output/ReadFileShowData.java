package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileShowData {
	public static void main(String[] args) {
		try {
			Scanner sin = new Scanner(new File("Sample.txt"));

			while (sin.hasNextLine()) {
				String strLine = sin.nextLine();
				System.out.println(strLine);
			}
			sin.close();
		} catch (FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません");
		}
	}
}
