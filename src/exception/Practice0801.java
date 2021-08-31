package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice0801 {
	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		int ave = 0;
		int[] num = new int[3];

		Scanner sin = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("数値を入力して下さい。(999で強制終了)＞");
				int tmpNum = sin.nextInt();

				if (tmpNum == 999) {
					break;
				}
				num[cnt] = tmpNum;
				cnt++;
			}

			for (int i = 0; i < cnt; i++) {
				sum += num[i];
			}

			ave = sum / cnt;

			System.out.println("入力数は" + cnt + "です");
			System.out.println("合計点は" + sum + "です");
			System.out.println("平均点は" + ave + "です");
		} catch (InputMismatchException e){
			System.out.println("文字が入力されました。整数を入力してください");
			sin.next();
		} catch (ArithmeticException e) {
			System.out.println(e + "という例外が発生しました");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + "という例外が発生しました");
		}

		sin.close();
	}
}
