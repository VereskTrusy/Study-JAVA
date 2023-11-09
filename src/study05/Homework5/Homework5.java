package study05.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework5 obj = new Homework5();
		obj.method1();
	}

	private void method1() {
		/*
		 * 단어 맞추기 게임
		 * 랜덤으로 1개 뽑고,
		 * 단어의 순서를 뒤섞어서 원래 글자가 무엇이였는지 맞추는 게임
		 */
		String[] words = {"apple", "banana", "melon", "strawberry"};
		int random = new Random().nextInt(words.length); // 0 ~ 3 까지의 숫자
		String answer = words[random];
		char[] charArr = answer.toCharArray(); // 문자열을 쪼개서 문자배열로 만듬
		
		// 단어 스펠링 위치 섞기
		for(int i = 0; i < 10000; i++) {
			int suffle = new Random().nextInt(charArr.length);
			char temp = charArr[0];
			charArr[0] = charArr[suffle];
			charArr[suffle] = temp;
		}
		
		System.out.println("순서가 섞인 과일이름이 있습니다. 맞춰보세요!"); // 안내문
		suffleWord(charArr); // 순서 섞인 영단어 출력
		
		String inputWord = null; // 사용자 입력값 저장 변수
		int count = 0; // 도전 횟수 카운트 변수
		
		// 맞출때까지 실행, 맞출 경우 실행횟수 출력
		while(true) {
			inputWord = sc.nextLine();
			count++;
			
			if(words[random].contentEquals(inputWord)) {
				System.out.println("정답 입니다 !! ");
				System.out.println(count + " 번만에 맞추셨어요 !!");
				break;
			}
			
			System.out.println("땡 ! 틀렸습니다. 다시 맞춰보세요!");
			suffleWord(charArr); // 순서 섞인 영단어 출력
		}
	}
	
	/**
	 * 영단어 문자 배열을 받아 console에 출력해주는 메서드
	 * @param arr
	 */
	private void suffleWord(char[] arr) {
		// 출력
		int arrSize = arr.length;
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
}
