package practice;

class TriangleMethod {
	public void Triangle1() {
		for (int count = 0; count < 5; count++) {
			for ( int i = 0; i < (count + (count + 1)); i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void Triangle2() {
		for (int i = 0; i < 6; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int count = 0; count < 4; count++) {
			for ( int i = 0; i < (5 - (count + 1)); i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void Triangle3() {
		for (int count = 0; count < 5; count++) {
			for (int i = 0; i < 5 - count; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (count*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void Triangle4() {
		for (int count = 0; count < 5; count++) {
			for (int i = 0; i < count + 1; i++) {
				System.out.print(" ");
			}
			for ( int j = 0; j < 9 - (count*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void Triangle5() {
		for (int count = 0; count < 5; count++) {
			for (int i = 0; i < 5 - count; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (count*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int count = 0; count < 4; count++) {
			for (int i = 0; i < count + 2; i++) {
				System.out.print(" ");
			}
			for ( int j = 0; j < 7 - (count*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

public class Triangle {
	public static void main(String[] args) {
		TriangleMethod tri = new TriangleMethod();

		System.out.println("1問目");
		tri.Triangle1();

		System.out.println("\n2問目");
		tri.Triangle2();

		System.out.println("\n3問目");
		tri.Triangle3();

		System.out.println("\n4問目");
		tri.Triangle4();

		System.out.println("\n5問目");
		tri.Triangle5();
	}
}
