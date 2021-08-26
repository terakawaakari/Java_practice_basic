package constructor;

public class Computer1 {
	private String os;
	private int memory;

	public Computer1() {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}
