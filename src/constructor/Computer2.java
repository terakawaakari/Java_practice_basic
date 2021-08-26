package constructor;

public class Computer2 {
	private String os;
	private int memory;

	public Computer2(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + memory + "MByteのパソコンを作成しました。");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}

}
