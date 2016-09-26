package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021033 黃苡珊
 */

import java.util.Scanner;

public class ex03_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入停車的時間 _點:_分~_點:_分(24小時制)");
		int a = scn.nextInt();	
		int b = scn.nextInt();
		int c = scn.nextInt();	
		int d = scn.nextInt();	
		if((c-a)<=2){
			System.out.println(((c*60+d)-(a*60+b))/30*30);
		}else if((c-a)>2&&(c-a)<4){
			System.out.println((((c*60+d)-(a*60+b))-120)/30*40+120/30*30);			
		}else{
			System.out.println((((c*60+d)-(a*60+b))-240)/30*60+120/30*30+120/30*40);			

		}
		
		
		
	}

}
