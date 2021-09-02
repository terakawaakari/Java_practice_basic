package algorithm;

public class Q8 {
	public static void main(String[] args) {
		int[] nums1 = new int[9];
		int[] nums2 = new int[9];

		System.out.print("   ");
		for (int i = 0; i < 9; i++) {
			nums1[i] = i + 1;
			nums2[i] = i + 1;
			System.out.print(" " + nums1[i] + " ");
		}
		System.out.println("");

		for (int i = 0; i < 9; i++) {
			System.out.print(" " + nums1[i] + " ");
			for (int j = 0; j < 9; j++) {
				int n = nums1[i] * nums2[j];
				if ((int) Math.log10(n) + 1 == 1) {
					System.out.print("0" + n + " ");
				} else {
					System.out.print(n + " ");
				}
			}
			System.out.println("");
		}
	}
}
