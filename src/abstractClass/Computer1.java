package abstractClass;

public class Computer1 extends Machinery {
	private String os;
	private int memory;

	public Computer1(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory
				+ "」のパソコンを作成しました");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です");
		System.out.println("メモリサイズは「" + memory + "]です");
	}
}
