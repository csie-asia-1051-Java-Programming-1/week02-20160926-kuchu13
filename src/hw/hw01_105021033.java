package hw;

import java.util.Scanner;

public class hw01_105021033 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("媽媽給了多少元");
		int n = scn.nextInt();
		System.out.println("買了幾顆蘋果、柳丁、桃子");
		int a1 = scn.nextInt();
		int a2 = scn.nextInt();
		int a3 = scn.nextInt();
		
		int a4 = (n-(a1*15+a2*20+a3*30))/50;
		int a5 = ((n-(a1*15+a2*20+a3*30))-a4*50)/5;
		int a6 = ((n-(a1*15+a2*20+a3*30))-a4*50-a5*5)/1;

		if(n>=a1*15+a2*20+a3*30){
			System.out.println("共找小明"+a6+"個1元，"+a5+"個5元及"+a4+"個50元");
		}else{
			System.out.println(0);
		}
	}
}
