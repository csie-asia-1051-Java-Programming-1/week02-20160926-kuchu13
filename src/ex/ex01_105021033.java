package ex;

import java.util.Scanner;

/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021033 黃苡珊
 */

public class ex01_105021033 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入使用時間");
		int a = scn.nextInt();
		if (a<=600){
			System.out.println(a*0.5);
		}else if(a>600&&a<1200){
			System.out.println(a*0.5*0.9);
		}else{
			System.out.println(a*0.5*0.79);

		}


	}

}
