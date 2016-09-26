package hw;

import java.util.Scanner;

public class hw02_105021033 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入身高(公分)及性別(1代表男性；2代表女性)");
		int x = scn.nextInt();	
		int y = scn.nextInt();
		
		if(y==1){
			System.out.println("標準體重"+(x-80)*0.7);
		}else if(y==2){
			System.out.println("標準體重"+(x-70)*0.6);
		}
	}
}
