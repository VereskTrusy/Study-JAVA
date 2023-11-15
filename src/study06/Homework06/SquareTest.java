package study06.Homework06;

public class SquareTest {

	public static void main(String[] args) {
		
		// 사각형 3개 만들거임
		int sqCount = 3;
		Square[] sq = new Square[sqCount];

		// 인스턴스 생성
		for(int i = 0; i < sq.length; i++) {
			sq[i] = new Square();
		}
		
		// 첫번째 사각 좌표 입력하기
		for (int i = 0; i < sq.length; i++) {
			sq[i].setSq();
		}

		// 사각형 만들기
		for (int i = 0; i < sq.length; i++) {
			sq[i].makeSq();
		}

		// 사각형 출력하기
		for (int i = 0; i < sq.length; i++) {
			System.out.println("Square [" + (i+1) + "] 번째 사각형");
			sq[i].printSq();
		}

		// 사각형 검사하기
		checkSq(sq);

	}
	
	public static void checkSq(Square[] sq) {
		for (int i = 0; i < sq.length-1; i++) {
			System.out.println("Square 체크 [" + (i+1) + "] 번째와 [" + (i+2) + "] 번째 사각형");
			if (sq[i].point1.x < sq[i + 1].point1.x && sq[i].point1.y > sq[i + 1].point1.y) {
				System.out.println("point 1 ok");
			} else {
				System.out.println("point 1 fail");
			}
			if (sq[i].point2.x > sq[i + 1].point2.x && sq[i].point2.y > sq[i + 1].point2.y) {
				System.out.println("point 2 ok");
			} else {
				System.out.println("point 2 fail");
			}
			if (sq[i].point3.x < sq[i + 1].point3.x && sq[i].point3.y < sq[i + 1].point3.y) {
				System.out.println("point 3 ok");
			} else {
				System.out.println("point 3 fail");
			}
			if (sq[i].point4.x > sq[i + 1].point4.x && sq[i].point4.y < sq[i + 1].point4.y) {
				System.out.println("point 4 ok");
			} else {
				System.out.println("point 4 fail");
			}
		}
	}
}
