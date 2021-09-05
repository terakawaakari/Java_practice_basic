package practice;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int f = 0;
		System.out.println(f);

		f = 1;
		System.out.println(f);

		ArrayList<Integer> fList = new ArrayList<Integer>();
		fList.add(0);
		fList.add(1);

		for (int i = 2; i < 10; i++) {
			fList.add(fList.get(i-1) + fList.get(i-2));
			System.out.println(fList.get(i));
		}
	}
	
	public static int fibonacci(int n){
        return fibonacciHelper(0, 1, n);
    }
    public static int fibonacciHelper(int f1, int f2, int n){
        if (n == 0){
            return f1;
        }
        return fibonacciHelper(f2, f1 + f2, n - 1);
    }
}