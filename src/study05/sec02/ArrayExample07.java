package study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample07 obj = new ArrayExample07();
		// obj.shallow(); // shallow copy - 얕은 복사
		
		// deep copy : 깊은복사
		// 배열 공간이 별도로 확보(메모리 신규 할당)되고 내용이 복사되는 방식
		// clone, System.arraycopy(), for문 이용
		// obj.deepCopy01(); // deep copy for문 이용
		// obj.deepCopy02(); // deep clone 이용
		obj.deepCopy03(); // deep copy System.arraycopy()
	}

	private void deepCopy03() {
		// deep Copy - 깊은복사

		String[] source1 = { "a1", "a2", "a3" };
		String[] source2 = { "b1", "b2", "b3" };
		String[] target = new String[6];
		System.arraycopy(source1, 0, target, 0, 3);
		System.arraycopy(source2, 0, target, 3, 3);
		// 원본배열명, 복사해줄 위치, 복사배열명, 복사받을위치, 갯수
		
		System.out.println("source : " + Arrays.toString(source1));
		System.out.println("source : " + Arrays.toString(source2));
		System.out.println("target : " + Arrays.toString(target));
	}

	private void deepCopy02() {
		// deep Copy - 깊은복사
		String[] source = { "a1", "a2", "a3" };
		String[] target = source.clone(); // 최상위클래스에 clone() 메소드 사용

		// Object class의 clone 사용
		target[0] = "b1";
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));
	}

	private void deepCopy01() {
		// deep Copy - 깊은복사
		String[] source = { "a1", "a2", "a3" };
		String[] target = new String[source.length];

		// for 문을 이용한 방법
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		System.out.println("source : " + Arrays.toString(source));
		System.out.println("target : " + Arrays.toString(target));

		System.out.println(source);
		System.out.println(target);
	}

	private void shallow() {
		// shallow copy - 얕은 복사
		// 배열명이 가지고 있는 배열의 주소 값만 복사
		// 부작용 발생 메서드의 매계변수 전달 방식이 이 복사 방법임

		String[] source = { "a1", "a2", "a3" };
		String[] target = source;

		System.out.println(source);
		System.out.println(target);

		target[0] = "b1";
		System.out.println(source[0]);
		System.out.println(target[0]);
	}
}
