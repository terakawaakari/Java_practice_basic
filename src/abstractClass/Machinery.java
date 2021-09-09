package abstractClass;

public abstract class Machinery {
	private int epower;
	
	public Machinery() {
		this.epower = 0;
	}
	
	public void setEpower(int epower) {
		this.epower = epower;
		System.out.println("消費電力を" + epower + "Wに設定しました");
	}
	public int getEpower() {
		return epower;
	}
	
	public abstract void show();
}
