package inheritance;

public class NotePc6 extends Computer1 {
	private String useType;

	public NotePc6() {
		this.useType = null;
		System.out.println("ノートパソコンを作成しました");
	}

	public NotePc6(String os, int memory, String useType) {
		super(os, memory);
		this.useType = useType;
		System.out.println("タイプは" + useType + "です");
	}

	public void setUseType(String useType) {
		this.useType = useType;
		System.out.println("タイプは" + useType + "です");
	}

	public void show() {
		super.show();
		System.out.println("タイプは" + this.useType + "です");
	}
}
