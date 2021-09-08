package inheritance;

public class NotePc5 extends Computer1{
	private String useType;

	public NotePc5() {
		this.useType = null;
		System.out.println("ノートパソコンを作成しました");
	}

	public NotePc5(String os, int memory, String useType) {
		super(os, memory);
		this.useType = useType;
		System.out.println("タイプは" + useType + "です");
	}

	public void setUseType(String useType) {
		this.useType = useType;
		System.out.println("タイプは" + useType + "です");
	}

	public void show() {
		System.out.println("このノートパソコンのOSは" + super.os + "です");
		System.out.println("メモリサイズは" + super.memory + "です");
		System.out.println("タイプは" + this.useType + "です");
	}
}
