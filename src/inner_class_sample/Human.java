package inner_class_sample;

public class Human {
	public class Leg {
		public void kick() {
			System.out.println("蹴る");
		}
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		Human.Leg leg = human.new Leg();
		leg.kick();
	}
}
