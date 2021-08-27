package overload;

public class Computer1 {
	private String os;
	private int memory;
	
	public void setComputer(String os) {
		this.os = os;
		System.out.println("OSを「" + os + "」に変更しました。");
	}
	
	public void setComputer(int memory) {
		this.memory = memory;
		System.out.println("メモリサイズを「" + memory + "」に変更しました。");
	}
	
	public void setComputer(String os, int memory) {
		this.os = os;
		this.memory = memory;
		System.out.println("OS「" + os + "」メモリサイズ「" + memory + "MByte」に変更しました。");
	}
	
	public void show() {
		System.out.println("パソコンのOSは「" + os + "」です。");
		System.out.println("メモリサイズは「" + memory + "MByte」です。");
	}
}
