package classLibrary;

public class AssigbValueOfClassType1 {
 public static void main(String[] args) {
	 Computer1 com1 = new Computer1();
	 System.out.println("com1を宣言しました");

	 com1.setComputer("WindowsXP", 1024);

	 Computer1 com2 = new Computer1();
	 System.out.println("com2を宣言しました");

	 com2 = com1;
	 System.out.println("com2にcom1を代入しました");

	 System.out.println("\n-[情報変更前のPC情報表示]--------------------");
	 System.out.print("com1の");
	 com1.show();
	 System.out.println();
	 System.out.print("com2の");
	 com2.show();
	 System.out.println("-------------------------------------------");
 }
}
