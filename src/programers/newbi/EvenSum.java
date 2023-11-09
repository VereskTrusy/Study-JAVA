package programers.newbi;

import java.util.Scanner;

public class EvenSum {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EvenSum obj = new EvenSum();
		obj.method1();
	}

	private void method1() {
		int answer = 0;
		int n = 10;
        
        boolean constraint = 0 < n && n <= 1000;
        
        if(constraint){
            for(int i = 0; i <= n; i += 2){
                if(i % 2 == 0){ // 짝수일때
                    answer = answer + i;
                }
            }
        }
        
        System.out.println(answer);
	}
}
