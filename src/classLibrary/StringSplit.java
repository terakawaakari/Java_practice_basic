package classLibrary;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		String str1 = "12345";
		String str2 = "AB:CD:EF";

		System.out.println("str1の先頭から3文字目は" + str1.substring(0, 3) + "です");
		System.out.println("str1の3文字目から最後の文字は" + str1.substring(2) + "です");

		String[] strArray = str2.split(":");

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(":で分割した" + (i + 1) + "つ目の文字列は" + strArray[i] + "です");
		}

		System.out.println(">");
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum;
        int l_sum;
        int s_sum;
        int pass_count = 0;
        sc.close();

        for (int i = 0; i < n; i++) {
        	Scanner sc2 = new Scanner(System.in);
            String line = sc2.nextLine();
            String[] params = line.split(" ");
            String t = params[0];
            int e = Integer.parseInt(params[1]);
            int m = Integer.parseInt(params[2]);
            int s = Integer.parseInt(params[3]);
            int j = Integer.parseInt(params[4]);
            int g = Integer.parseInt(params[5]);
            sc2.close();

            sum = e+m+s+j+g;
            s_sum = m+s;
            l_sum = j+g;

            if (t.equals("l")) {
            	if (sum >= 350 && l_sum >= 160) {
            		pass_count++;
            	}
            } else {
            	if (sum >= 350 && s_sum >= 160) {
            		pass_count++;
            	}
            }
        }
        System.out.println(pass_count);


	}
}
