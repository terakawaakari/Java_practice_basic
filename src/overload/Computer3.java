package overload;

public class Computer3 {
	private String os;
	private int memory;

	public Computer3() {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました");
	}

	public Computer3(String os, int memory) {
		this();
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ" + "「" + memory + "MByte」のパソコンを作成しました。" );
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}
