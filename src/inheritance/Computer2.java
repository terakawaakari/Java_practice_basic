package inheritance;

public class Computer2 {
	protected String os;
	protected int memory;

	public Computer2() {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました");
	}

	public Computer2 (String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」、メモリサイズ「" + memory + "」のパソコンを作成しました");
	}
	public void setOsMemory(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」、メモリサイズ「" + memory + "」に変更しました");
	}
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です");
		System.out.println("メモリサイズは「" + memory + "」です");
	}

	public String toString() {
		String str = "OS:" + this.os + " " + "Memory:" + this.memory;
		return str;
	}
}
