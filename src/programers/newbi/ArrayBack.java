package programers.newbi;

public class ArrayBack {

	public static void main(String[] args) {
		// 문제 설명
		// 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
		// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		
		int[] num_list = {1, 2, 3, 4, 5};
		
		int step = 0;
        int nlistSz = num_list.length;
        int[] answer = new int[nlistSz];
        
        for(int i = nlistSz-1; i >= 0; i--){
            answer[step] = num_list[i];
            step++;
        }
        
        for(int i = 0; i < nlistSz; i++) {
			System.out.print(" " + answer[i]);
		}
	}

}
