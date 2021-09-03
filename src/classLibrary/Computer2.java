package classLibrary;

public class Computer2 {
	private String os;
	private int memory;

	public Computer2() {
		this.os = null;
		this.memory = 0;
		System.out.println("パソコンを作成しました");
	}

	public String getOs() {
		return this.os;
	}
	public int getMemory() {
		return this.memory;
	}

	public void setOs(String os) {
		this.os = os;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void show() {
		System.out.println("パソコンのOSは「" + this.os + "」です。");
		System.out.println("メモリサイズは「" + this.memory + "MByte」です。");
	}
}
