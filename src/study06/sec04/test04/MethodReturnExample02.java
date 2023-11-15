package study06.sec04.test04;

public class MethodReturnExample02 {

	public static void main(String[] args) {
		MethodReturnExample02 mre = new MethodReturnExample02();
		int[] score = { 70, 65, 47 };

		double[] arr = mre.test01(score);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

	public double[] test01(int[] score) {
		// 총점, 평균 구하고 리턴
		int sum = 0;
		double avg = 0;
		
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = (double)sum / score.length;
		
		double[] arr = {sum, avg};
		return arr;
	}

}
