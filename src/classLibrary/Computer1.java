package classLibrary;

public class Computer1 {
	 private String os;
	 private int memory;

	 public Computer1() {
		 this.os = "";
		 this.memory = 0;
		 System.out.println("パソコンを作成しました");
	 }

	 public void setComputer(String os, int memory) {
		 this.os = os;
		 this.memory = memory;
		 System.out.println("OS「" + os + "」メモリサイズ「" + memory + "」に設定しました");
	 }

	 public void show() {
		 System.out.println("パソコンのOSは「" + os + "」です");
		 System.out.println("メモリサイズは「" + memory + "」です");
	 }
}
