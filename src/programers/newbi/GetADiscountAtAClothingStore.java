package programers.newbi;

public class GetADiscountAtAClothingStore {

	public static void main(String[] args) {
		// 문제 설명
		// 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
		// 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
		int price = 480000;
		int answer = price;
        
        if(price > 500000){
            answer *= (1 - 0.2);
        } else if(price > 300000){
            answer *= (1 - 0.1);
        } else if(price > 100000){
            answer *= (1 - 0.05);
        } else {
            //
        }
        
        if(answer % 10 != 0){
            answer = answer - (answer % 10);
        }
        
        System.out.println(answer);
	}

}
