package study06.sec04.test04;

import java.util.Arrays;

public class MethodCopy {

	public static void main(String[] args) {
		MethodCopy mc = new MethodCopy();
		
		int[] arr = {1,2,3};
		int[] arr2 = new int[arr.length];
		arr2 = mc.arrCopyMultiple(arr, arr2); // 배열 원본 2배로 증가
		
		// copy() 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		// sum() 출력
		int sum = mc.sum(arr); // 배열의 원소들 총합
		System.out.println(sum);
	}
	
	
	public int[] arrCopyMultiple(int[] arr, int[] arr2) {
		int num = 0;
		
		// 2배로 증가시키기
		for(int i = 0; i < arr.length; i++) {
			num = arr[i];
			arr2[i] = num * 2;
		}
		return arr2;
	}
	
	
	public int sum(int[] arr) {
		int sum = 0;
		int num = 0;
		
		// 2배로 증가시키기
		for(int i = 0; i < arr.length; i++) {
			num = arr[i];
			sum = num * 2;
		}
		return sum;
	}

}
