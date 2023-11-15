package programers.newbi;

import java.util.Arrays;

public class ArrayCut {

	public static void main(String[] args) {
		// 문제 설명
		// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
		// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		int num1 = 1;
		int num2 = 3;
		int[] numbers = {1, 2, 3, 4, 5};
		int numSz = numbers.length;
		int ansSz = (num2 - num1) + 1;
		int[] answer = new int[ansSz];
		
        // 반복문을 이용한 방법
//        for(int i = 0; i < ansSz; i++){
//            answer[i] = numbers[i + num1]; 
//        }
//        
//        for(int i = 0; i < ansSz; i++) {
//        	System.out.print(answer[i] + " ");
//		}
        
        
        
        // System.arraycopy() 메소드 사용하는 방법
        System.arraycopy(numbers, num1, answer, 0, ansSz);
        System.out.println(Arrays.toString(answer));
        
	}

}
