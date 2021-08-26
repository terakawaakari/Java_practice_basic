package constructor;

public class Constructor1 {
	public static void main(String[] args) {
		System.out.println("--「引数なしコンストラクタ」の実行前--");
		Computer1 com = new Computer1();
		System.out.println("--「引数なしコンストラクタ」の実行後--");
		com.show();
	}
}
