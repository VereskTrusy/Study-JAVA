package study04.Homework4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework4 obj = new Homework4();
		obj.process(); // 숫자 맞추기 게임 완성하기
		obj.getLottoNumber(); // 로또 번호 뽑기
	}

	/**
	 * 로또 번호 획득하기
	 */
	private void getLottoNumber() {
		int num1 = 0; // 로또 1번째 숫자
		int num2 = 0; // 로또 2번째 숫자
		int num3 = 0; // 로또 3번째 숫자
		int num4 = 0; // 로또 4번째 숫자
		int num5 = 0; // 로또 5번째 숫자
		int num6 = 0; // 로또 6번째 숫자
		int lotFlag = 1; // 플래그 변수

		exit: while (true) {
			int randomNum = new Random().nextInt(44) + 1;

			if (lotFlag == 1) { // 로또 1번째 숫자는 그냥 집어넣기
				lotFlag++;
				num1 = randomNum;
				continue;
			}

			if (lotFlag == 2) { // 로또 2번째 숫자 세팅
				lotFlag++;

				num2 = randomNum; // 랜덤숫자 대입

				if (num2 == num1) { // 중복 검사
					lotFlag--;
					continue;
				} else { // 중복 없으면 대입
					num2 = randomNum;
					continue; // 다음 플래그로 이동
				}
			}

			if (lotFlag == 3) { // 로또 3번째 숫자 세팅
				lotFlag++;

				num3 = randomNum; // 랜덤숫자 대입

				if (num3 == num1 || num3 == num2) { // 중복 검사
					lotFlag--;
					continue;
				} else { // 중복 없으면 대입
					num3 = randomNum;
					continue; // 다음 플래그로 이동
				}
			}

			if (lotFlag == 4) { // 로또 4번째 숫자 세팅
				lotFlag++;

				num4 = randomNum; // 랜덤숫자 대입

				if (num4 == num1 || num4 == num2 || num4 == num3) { // 중복 검사
					lotFlag--;
					continue;
				} else { // 중복 없으면 대입
					num4 = randomNum;
					continue; // 다음 플래그로 이동
				}
			}

			if (lotFlag == 5) { // 로또 5번째 숫자 세팅
				lotFlag++;

				num5 = randomNum; // 랜덤숫자 대입

				if (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4) { // 중복 검사
					lotFlag--;
					continue;
				} else { // 중복 없으면 대입
					num5 = randomNum;
					continue; // 다음 플래그로 이동
				}
			}

			if (lotFlag == 6) { // 로또 6번째 숫자 세팅
				lotFlag++;

				num6 = randomNum; // 랜덤숫자 대입

				if (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5) { // 중복 검사
					lotFlag--;
					continue;
				} else { // 없으면 대입
					num6 = randomNum;
					break exit; // 6자리 숫자 모두 다 구하면 반복문 종료
				}
			}
		}

		int temp = 0;
		while (true) {

			if (num1 > num2) {
				temp = num1;
				num1 = num2;
				num2 = temp;
			}

			if (num2 > num3) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}

			if (num3 > num4) {
				temp = num3;
				num3 = num4;
				num4 = temp;
			}

			if (num4 > num5) {
				temp = num4;
				num4 = num5;
				num5 = temp;
			}

			if (num5 > num6) {
				temp = num5;
				num5 = num6;
				num6 = temp;
			}

			if (num1 < num2 && num2 < num3 && num3 < num4 && num4 < num5 && num5 < num6) {
				break;
			}
		}
		System.out.println("행운의 로또 번호 : " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);
	}

	/**
	 * 숫자 맞추기 게임 완성하기 0 ~ 99 입력받고 랜덤 설정된 숫자보다 크면 다운 , 작으면 업 몇번 실행만에 맞췄는지 하여 숫자를 맞추는
	 * 게임
	 */
	private void process() {
		int randomNum = new Random().nextInt(100);
		boolean endFlag = true; // 종료 플래그
		int inputNum = 0; // 입력받은 숫자
		int count = 0; // 입력한 횟수

		System.out.println("0 ~ 99까지의 숫자 중 한가지를 입력 하세요 :  "); // 안내문

		while (endFlag) { // 게임시작
			inputNum = sc.nextInt();

			if (inputNum > randomNum) {
				System.out.println("입력한 수보다 작습니다");
				count++;
			} else if (inputNum < randomNum) {
				System.out.println("입력한 수보다 큽니다");
				count++;
			} else {
				System.out.println("정답입니다!");
				count++;
				endFlag = false;
			}
		}
		System.out.println("총 입력한 횟수는 : " + count + " 입니다.");
	}
}
