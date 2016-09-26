package hw;

import java.util.Scanner;

public class hw03_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入年份(西洋)");
		int x = scn.nextInt();
		if((x%4==0&&x%100!=0)||x%400==0){
			System.out.println("為閏年");
		}else{
			System.out.println("平年");
		}
	}
}
