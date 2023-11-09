package study04.sec01;

import java.util.Scanner;

public class IFExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IFExample02 obj = new IFExample02();
		obj.method1();
	}

	private void method1() {
		/*
		 *   수도 요금을 계산하시오.
		 *   사용량 별 단가 :
		 *   1-9   : 200
		 *   10-19 : 250
		 *   20-29 : 350
		 *   30-39 : 500
		 *   그 이상  : 750
		 *   
		 *   하수도 사용량 : 톤당 150원
		 *   
		 *   수도 요금 = 사용량별 요금 + 물 이용 분담금(3000) + 하수도 요금
		 *   ex)  26 톤 사용 시 (9*200 + 10*250 + 7*350 ) + (3000) + (26*100) 
		 */
		
		
		int ton = sc.nextInt();
		int price = 0;
		int sudo = 0;
		int hasu = 0;
		price += 3000;
		
		
		if(ton < 10) {
			// price += (200 * ton) + (150 * ton);
			sudo = 200 * ton;
			hasu = 150 * ton;
			price += sudo + hasu;
		}else if(ton < 20) {
			sudo = (200 * 9) + (250 * (ton-9));
			hasu = 150 * ton;
			price += sudo + hasu;
		}else if(ton < 30) {
			sudo = (200*9) + (250*9) + 350*(ton-19);
			hasu = 150 * ton;
			price += sudo + hasu;
		}else if(ton < 40) {
			sudo = (200*9) + (250*9) + (350*9) + 500*(ton-29);
			hasu = 150 * ton;
			price += sudo + hasu;
		}
		else if(ton < 40) {
			sudo = (200*9) + (250*9) + (350*9) + (500*9) + 750*(ton-39);
			hasu = 150 * ton;
			price += sudo + hasu;
		}
		
		
		System.out.println("사용요금은 : " + price);
	}
}
