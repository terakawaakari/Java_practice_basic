package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 入力パラメータを読み込む
        String input = br.readLine();
        String[] param = input.split(" ");
        int num1 = Integer.parseInt(param[0]);
        int num2 = Integer.parseInt(param[1]);
        System.out.println(num1 + num2);
    }
}