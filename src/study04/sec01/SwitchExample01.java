package study04.sec01;

import java.util.Scanner;

public class SwitchExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample01 obj = new SwitchExample01();
		obj.method1();
	}

	private void method1() {
		System.out.println("--- menu ---");
		System.out.println(" 1. 입력");
		System.out.println(" 2. 검색");
		System.out.println(" 3. 수정");
		System.out.println(" 4. 삭제");
		
		String sql = "";
		
		int select = sc.nextInt();
		switch (select) {
			case 1 : 
				sql += "INSERT INTO MEMBER(MEM_ID, MEM_PASS) "
				    +  "VALUES('a001', '1234')";
				break;
			case 2 : 
				sql += "SELECT * FROM MEMBER";
				break;
			case 3 : 
				sql += "UPDATE MEMBER " 
			        +  "SET MEM_ID = 'a002'";
				break;
			case 4 : 
				sql += "DELETE FROM MEMBER"
				    + "WHERE MEM_ID = 'a001'";
				break;
			default :
				System.out.println("잘못 입력 되었습니다.");
				break;
		}
		System.out.println(sql);
	}
}
