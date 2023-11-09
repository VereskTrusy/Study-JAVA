package study04.Homework3;

import java.util.Scanner;

public class Homework3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework3 obj = new Homework3();
		
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		obj.method6();
		
		obj.method7(); // 6번
		obj.method8(); // 5번
		obj.method9(); // 4번
		obj.method3(); // 3번
		obj.method2(); // 2번
		obj.method1(); // 1번 
	}
	/*  
	 * 	1)		2)		3)		4)		5)			6)
	 * 	*****	*		*****	*****	    *	     *
	 * 	*****	**		****	 ****	   **	    ***
	 * 	*****	***		***		  ***	  ***	   *****
	 * 	*****	****	**		   **	 ****	  *******
	 *  ***** 	*****	*		    *	*****	 *********
	 */

	private void method7() { 
		System.out.println("6) 번");
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		
		System.out.println("6) 실행");
		for ( int h = 0; h < 10; h += 2) {
			
			for(int s = 10; s > h; s -= 2) {
				System.out.print(" ");
			}
			
			for(int w = 0; w < h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		
		System.out.println("6) 선생님이하신거");
		for(int h=0; h<5; h++) {
			for(int w=0; w<4-h; w++) {
				System.out.print(" ");
			}
			for(int w=0;w<2*h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	


	private void method8() {
		System.out.println("5) 번");
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		
		System.out.println("5) 실행");
		for(int h = 0; h < 5; h++) {
			for(int s = 5; s > h+1; s--) {
				System.out.print(" ");
			}
			
			for(int w = 0; w < h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("6) 선생님이하신거");
		for(int h=0; h<5; h++) {
			for(int w=0; w<4-h; w++) {
				System.out.print(" ");
			}
			for(int w=0;w<h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	

	private void method9() {
		System.out.println("4) 번");
		System.out.println("*****");
		System.out.println(" ****");
		System.out.println("  ***");
		System.out.println("   **");
		System.out.println("    *");
		
		System.out.println("4) 실행");
		for(int h = 0; h < 5; h++) {
			for(int s = 0; s < h ; s++) {
				System.out.print(" ");	
			}
			for(int w = 5; w > h; w--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	
	private void method6() {
		System.out.println("6) 번");
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		
		System.out.println("6) 실행");
		for(int h = 1; h < 10; h = (h + 2)) {
			switch ( h ) {
			case 1 : 
				System.out.print("    ");
				break;
			case 3 : 
				System.out.print("   ");
				break;
			case 5 : 
				System.out.print("  ");
				break;
			case 7 :
				System.out.print(" ");
				break;
			case 9 : 
				System.out.print("");
				break;
			default :
				break;
			}
			for(int w = 0; w < h; w++) {
				System.out.print("*");
				}
			System.out.println("");
		}
		System.out.println("");
	}

	
	
	private void method5() {
		System.out.println("5) 번");
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
		
		System.out.println("5) 실행");
		for(int h = 1; h < 6; h++) {
			switch ( h ) {
			case 1 : 
				System.out.print("    ");
				break;
			case 2 : 
				System.out.print("   ");
				break;
			case 3 : 
				System.out.print("  ");
				break;
			case 4 :
				System.out.print(" ");
				break;
			case 5 : 
				System.out.print("");
				break;
			default :
				break;
			}
			for(int w = 0; w < h; w++) {
				System.out.print("*");
				}
			System.out.println("");
		}
		System.out.println("");
	}

	
	
	private void method4() {
		System.out.println("4) 번");
		System.out.println("*****");
		System.out.println(" ****");
		System.out.println("  ***");
		System.out.println("   **");
		System.out.println("    *");
		
		System.out.println("4) 실행");
		for(int h = 5; h > 0; h--) {
			for(int w = 0; w < h; w++) {
				System.out.print("*");
				}
			System.out.println("");
			switch ( h ) {
			case 1 : 
				break;
			case 2 : 
				System.out.print("    ");
				break;
			case 3 : 
				System.out.print("   ");
				break;
			case 4 : 
				System.out.print("  ");
				break;
			case 5 : default :
				System.out.print(" ");
				break;
			}
		}
		System.out.println("");
	}

	
	
	private void method3() {
		System.out.println("3) 번");
		System.out.println("*****");
		System.out.println("**** ");
		System.out.println("***  ");
		System.out.println("**   ");
		System.out.println("*    ");
		
		System.out.println("3) 실행");
		for(int h = 5; h > 0; h--) {
			for(int w = 0; w < h; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	
	
	private void method2() {
		System.out.println("2) 번");
		System.out.println("*    ");
		System.out.println("**   ");
		System.out.println("***  ");
		System.out.println("**** ");
		System.out.println("*****");
		
		System.out.println("2) 실행");
		for(int h = 0; h < 5; h++) {
			for(int w = 0; w < h+1; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	
	

	private void method1() {
		
		System.out.println("1) 번");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		System.out.println("1) 실행");
		for(int h = 0; h < 5; h++) {
			for(int w = 0; w < 5; w++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
