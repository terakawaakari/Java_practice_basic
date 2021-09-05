package input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {
	private BufferedWriter bw = null;

	public boolean open(String fname) {
		boolean sts = true;

		try {
			bw = new BufferedWriter(new FileWriter(fname));
		} catch (IOException e) {
			System.out.println("ファイル名に誤りがあります\n" + e);
			sts = false;
		}
		return sts;
	}

	public boolean writeIn(String str) {
		boolean sts = true;
		try {
			bw.write(str);
			bw.newLine();
		} catch (IOException e) {
			System.out.println("書き込みエラー\n" + e);
			sts = false;
		}
		return sts;
	}

	public boolean close() {
		boolean sts = true;
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println("ファイルクローズエラー\n" + e);
			sts = false;
		}
		return sts;
	}
}
