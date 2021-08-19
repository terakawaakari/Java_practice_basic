
public class Null01 {
	public static void main(String[] srgs) {
		String string1;

		string1 = "あいう";
		System.out.println(string1 + "の文字数：" + string1.length());

		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());

		int[] array1 = new int[3];
		array1[0] = 60;
		array1[2] = 20;
		array1[1] = 20;
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);

		int int2 = array1[2];
		System.out.println(int2);

//		プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long num1 = 1000000000000000L;
		System.out.println(num1);

		double num2 = 1.11;
		System.out.println(num2);

		boolean bool = true;
		System.out.println(bool);

//		ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float num3 = 2.22f;
		System.out.println(num3);

		Integer num4 = 12345;
		System.out.println(num4);

		Character key = 'あ';
		System.out.println(key);

//		要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int[] array3 = { 1, 2, 3, 4, 5 };
		array3[3] = 10;
		System.out.println(array3[3]);
	}
}
