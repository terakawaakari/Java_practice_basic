package exception;

public class ThrowZeroException1 {
	public static void calcTest() {
		System.out.println("10/0を実行します");
		int num = 10 / 0;
		System.out.println("10/0の結果は" + num);
	}

	public static void main(String[] args) {
		try {
			calcTest();
		} catch (ArithmeticException e) {
			System.out.println(e + "例外が発生しました");
		}
		System.out.println("処理終了");
	}
}
