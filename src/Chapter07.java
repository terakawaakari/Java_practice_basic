
public class Chapter07 {
	public static void main(String[] args) {
//		距離を表すint型の変数を定義し、任意の値で初期化する
		int d = 10;

//		距離が5km以下の場合は "とても近いです" を出力する
//		距離が5kmより長く10km以下の場合は "近いです" を出力する
//		距離が10kmより長く15km以下の場合は "遠いです" を出力する
//		距離が15kmより長い場合は "とても遠いです" を出力する
		if (d <= 5) {
			System.out.println("とても近いです");
		} else if (d <= 10) {
			System.out.println("近いです");
		} else if (d <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

//		信号の色を表すString型の変数を定義
		String c = "red";

//		色がredの場合は "赤信号です" を出力する
//		色がyellowの場合は "黄信号です" を出力する
//		色がblueの場合は "青信号です" を出力する
//		上記以外の色の場合は "信号の色ではありません" を出力する
		switch (c) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("赤信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
