package ConditionalandIteration;

public class For_3 {
	
	
	public static void main(String[] args) {
		
		//[For_3]
		
		//제어문 중첩
		// - 모든 제어문은 종류에 상관없이 서로 중첩 할 수 있다.
		
		//for문 끼리 중첩
		//- N중 for문, 다중 for문
		
		
		//m1();		//2중 for문
		//m2();		//구구단(여러단 출력)
		//m3();
		m4();		//별찍기
		
		
	}//main
	
	
	private static void m4() {

		//문제]별찍기(5x5)
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	
		for (int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======");
		
	
		for (int i=0; i<5; i++) {
			
			for(int j=0; j<(4-i); j++) { //i(0) -> j x 4바퀴
			System.out.print(" ");		 //i(4) -> j x 10바퀴
			}

			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
		
		
		
		
	}//m4

	
	
	private static void m3() {

		for (int i=0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				if(i == 5 || j==5) { //이거저거 넣어 보면서 익숙해 지는 수밖에 없음
					break; //분기문은 직접 자신이 포함된 제어문을 탈출한다. => j for문 탈출
				} 
				
				System.out.printf("i: %d. j: %d\n", i, j); 
			
				
			}
		}//i == 5 이면 90번 찍힘(0~9 10번씩 10번찍히는데 그중 i = 5값이 안찍힌다. 
		 //j == 5 이면 50번 찍힘(break;가 j의 for문을 아예 탈출해버리므로 50번이 찍힌다.)
		 // 둘이 합쳐서 계산하면 총 45번 찍힘 => 모르겠으면 런시켜봐라
		
	}//m3
	
	

	private static void m2() {

		
		//요구사항] 구구단 전부 만들기
		// 	- 2단 ~ 9단
		
		//2단 생성 -> 전체 묶는 for문 생성 -> 2숫자를 j로 바꿈 === 즉 패턴 발견 후 단위화!
	
		for (int j=2; j<=9; j++) {

		System.out.println("========================");
		System.out.printf("%d단\n", j);
		System.out.println("========================");
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", j, i, j*i);
		}//for2
	
		System.out.println();
		
		}//for1
	
	}//m2

	
//=============================================================================
	
	private static void m1() {

		
		//1. 2중 for문
		
		for (int i=0; i<10; i++) { //대회전
			
			for(int j=0; j<10; j++) { //소회전
				
				//System.out.println("안녕하세요."); //몇번 찍혔을까? 100번 10 x 10 =100
				System.out.printf("i: %d, j: %d\n", i, j);
			}//for_2 10번
			
		}//for_1 10번
	
	
//----------------------------------------------------------------------------
		
		//2. 3중 for문
		
		for (int i=0; i<10; i++) { //대회전
			
			for (int j=0; j<10; j++) {//중회전
				
				for (int k=0; k<10; k++) {//소회전 ----> 출력값 회전하는거 보면 알 수 있음
					
					//10x10x10 = 1,000
					System.out.printf("i: %d, j: %d, k: %d\n", i,j,k);
				}//for3
			}//for2
		}//for1
	

		
		//3중 for문 예시-시계]
	
		for (int i=0; i<24; i++) { //시침
			
			for (int j=0; j<60; j++) {//분침
				
				for (int k=0; k<60; k++) {//초침
					
					//10x10x10 = 1,000
					System.out.printf("i: %d, j: %d, k: %d\n", i,j,k);
				}//for3
			}//for2
		}//for1
		
//---------------------------------------------------------------------------
	
		//N중 for문 -> 2~3중 for문
		
//		for() {
//			for() {
//				for() {
//					for() {
//						for() {
//							
//						}
//					}
//				}
//			}
//		}// 너~~~~~~~~무 복잡함
		
	}//m1

}//class
