
public class Chapter08 {
	public static void main(String[] args) {
	    //1以上5未満の数の2乗を出力
		int num = 1;
		while (num >= 1 && num < 5) {
			int val = num * num;
			System.out.println(val);
			num++;
		}

		//要素数が4の「int」配列を初期化
		//配列のサイズ分ループして、要素を出力
		int[] array = { 1, 2, 3, 4 };
		for (int num2 = 0; num2 < array.length; num2++) {
			System.out.println(array[num2]);
		}

		//拡張for文で上の配列をループ
		//要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		for (int a: array) {
			if (a % 2 == 0) {
				continue;
			}
			System.out.println(a);
		}
	}
}
