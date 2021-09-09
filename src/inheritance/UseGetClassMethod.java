package inheritance;

public class UseGetClassMethod {
	public static void main(String[] args) {
		Computer1 com = new Computer1();
		NotePc6 npc = new NotePc6();
		
		System.out.println("comオブジェクトのクラスは" + com.getClass() + "です");
		System.out.println("npcオブジェクトのクラスは" + npc.getClass() + "です");
	}
}
