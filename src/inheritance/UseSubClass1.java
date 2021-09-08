package inheritance;

public class UseSubClass1 {
	public static void main(String[] args) {
		NotePc1 npc = new NotePc1();

		npc.setOsMemory("WindowsXP", 1024);

		npc.setUseType("モバイル");

		npc.show();
	}
}
