package study06.sec04.test04;

public class MethodReturnExample {

	public static void main(String[] args) {
		MethodReturnExample test = new MethodReturnExample();
		
		System.out.println(test.addNum(20)); // 1 ~ n 까지 더하기
	}
	
	public int addNum(int n) {
		// 100
		// 1~n 값으 더하다가 
		// 결과 값이 100 보다 커지면 현재까지 더해진 값 리턴 하기
		// 만약, 100 보다 커지지 않으면 n까지 전체 합 리턴
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			sum += i;

			if(sum > 100) {
				break;
			}
		}	
		return sum;
	}
}
