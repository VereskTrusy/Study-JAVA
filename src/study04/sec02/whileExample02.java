package study04.sec02;

import java.util.Scanner;

public class whileExample02 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		whileExample02 obj = new whileExample02();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
	
	
	
	/*
	 * 반복문에서 continue 사용하기
	 */
	private void method4() {
		for(int i = 0; i < 10; i++) {
			if( i < 2 ) {
				continue;
			}
			System.out.println("i 값은 : " + i);
		}
	}
	

	/*
	 *  while 문 break 시키기
	 */
	private void method3() {
		Out : while(true) {
			System.out.println("바깥 쪽 while 문 : star");
			
			while(true) {
				System.out.println("안쪽 쪽 while 문");
				break Out;
			}
		}
	}
	
	

	/**
	 * 이상하게 더하기
	 * 홀수 : 더함, 짝수 : 뺌
	 * 	1-2+3-4+5-6+7-8+9-10 = ?
	 */
	private void method2() {
		int num = 1;
		int sum = 0;
		//System.out.println("num : " + num + " sum :" + sum);
		
		while( sum > -100 ) {
			if(num % 2 == 1) { // 홀수면
				sum = sum + num; //System.out.println("홀 - num : " + num + " sum :" + sum);
			}else {
				sum = sum - num; //System.out.println("짝 - num : " + num + " sum :" + sum);
			}
			num++;
		}
		System.out.println("num : " + (num-1) + " sum :" + sum);
	}
	
	
	


	/**
	 *  첫날에 100원, 그 다음날부터 전날의 2배식 저축을 할 때 최초로 100만원을 넘는 날과
	 *  그 날까지 저축한 액수를 구하시오. 
	 */
	private void method1() {

		int sum = 0;
		int amount = 100;
		int day = 0;
		
		while( sum < 1000000 ) { // 저축액 100만 넘으면 종료
			sum = sum + amount;
			amount = amount * 2;
			day = day + 1;
			//System.out.println(day + " 일 " + sum + " 저축");
		}
		System.out.println("일   수 : " + day);
		System.out.println("저축액 : " + sum);
	}
}
