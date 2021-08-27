package classMember;

class Computer3 {
	private String os;
	private int memory;
	public static int sum;

	public Computer3() {
		this.os = null;
		this.memory = 0;
		sum++;
		System.out.println("パソコンを作成しました");
	}

	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OSを「" + os + "」に、メモリを「" + memory + "」に変更しました");
	}

	public static void showSum() {
		System.out.println("パソコンは合計" + sum + "台作成されています");
	}

	public void checkSum() {
		if (sum > 2) {
			System.out.println(sum + "台パソコンが作成されたので、メンテナンスを実行してください");
		} else {
			System.out.println(sum + "台目なので、メンテナンスは必要ありません");
		}
	}
}

public class ClassMemberFromInstanceMethod {
	public static void main(String[] args) {
		Computer3 com1 = new Computer3();
		com1.setOsMemory("WindowsXP", 2048);
		com1.checkSum();

		Computer3 com2 = new Computer3();
		com2.setOsMemory("Windows2000", 512);
		com2.checkSum();

		Computer3 com3 = new Computer3();
		com3.setOsMemory("WindowsVista", 3072);
		com3.checkSum();
	}
}
