package abstractClass;

public class Computer3 implements IMachinery, IProduct {
	private String os;
	private int memory;

	public Computer3(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "」のパソコンを作成しました");
	}

	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です");
		System.out.println("メモリサイズは「" + memory + "」です");
		System.out.println("製造元は「" + MANUFACTURER + "」です");
	}

	public void pShow() {
		System.out.println("このパソコンの製造日は2021/1/1です");
	}
}
