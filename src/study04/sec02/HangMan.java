package study04.sec02;

import java.util.Scanner;

public class HangMan {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HangMan obj = new HangMan();
		obj.method1();
	}

	private void method1() {
		// 문자열 맞추는 게임
		// ㅁㅁㅁㅁㅁ
		// ex)정답 : apple
		// aㅁㅁㅁㅁ 입력 시
		// 완료될 때까지 실행
		
		String str = "apple";
		int strSz = str.length();
		char[] ans = new char[strSz];
		int ansSz = ans.length;
		int num = 0;
		
		// 네모칸 채우기
		for(int i = 0; i < ansSz; i++) {
			ans[i] = '□';
		}
				
		while(true) {
			System.out.println("단어를 맞춰보세요(입력문자하나)"); // 문제 출력
			for(int i = 0; i < ansSz; i++) {
				System.out.print(ans[i]);
			}
			System.out.print("\n");
			
			char input = sc.nextLine().toCharArray()[0]; // 한글자만 입력 받기
			
			if(str.charAt(num) == input) { // 입력한 문자가 문제와 같은지 비교 
				ans[num] = input;
				num++;
				System.out.println(input + " 이(가) 문제와 일치합니다.!");
				
				if(num == strSz) { // 마지막 까지 입력했다면 = 정답임
					System.out.println("문제를 모두 맞추셨습니다! : " + str);
					break;
				}
			}
			else {
				System.out.println(input + " 은(는) 아닌가보네요?");
			}
			
			
		}
	}
}
