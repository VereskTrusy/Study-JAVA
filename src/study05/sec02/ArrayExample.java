package study05.sec02;

import java.util.Scanner;

public class ArrayExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample obj = new ArrayExample();
		obj.method1();
		obj.method99();
	}

	private void method99() {
		String[] str = {null, null, null, null};
		if(str == null)
			System.out.println("null");
		if(str != null)
			System.out.println(str.length);
		
	}

	private void method1() {
		int[] arr = {10, 30, 34, 54, 7};
		int arrSz = arr.length;
		
		// max값 찾기
		int max = arr[0];
		for(int i = 0; i < arrSz; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		// min값 찾기
		int min = arr[0];
		for(int i = 0; i < arrSz; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
