package constructor;

public class Constructor2 {
	public static void main(String[] args) {
		System.out.println("--「引数ありコンストラクタ」の実行前--");
		Computer2 com = new Computer2("WindowsXP", 2048);
		System.out.println("--「引数ありコンストラクタ」の実行後--");
		com.show();
	}
}
