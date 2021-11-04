package ConditionalandIteration;

public class While {
	
	public static void main(String[] args) {
		
		//[while]
		
		//조건문
		//1. if
		//2. switch
		
		//반복문
		//3. for
		//4. while
		//5. do while
		//6. for
		
		//분기문
		//7. break
		//8. continue
		
		
		//m1();		//while 개념, for문과의 비교
		//m2();		//구구단
		//m3();		//누적값
		m4();
		
		
	}//main

	private static void m4() {
		
		//do while문
		
		/*
		 
		 while		: 선조건 후실행
		 do while	: 선실행 후조건
		 
		 while (조건식) 
		 {
		 	실행문;
		 }
		 
		 
		 
		 do
		 {
		 	실행문;
		 }
		 while (조건식); 
		 
		 
		 */

		int n = 20;
		
		do {
			System.out.println(n);
			n++;
		} while (n <=10);
		
	}

	private static void m3() {
		
		//요구사항] 누적값 > 1000을 넘길때까지
		
		
		//1. for문으로 풀 경우
		int sum = 0;
		//int i = 0;
		
		
		for (int i=1; ; i++) {
			
			sum += i;
			
			if (sum >= 1000) {
				System.out.println(i);
				break;
			}
		}//for --> 얘가 끝나면 데이터 i도 사라지므로 while의 i가 에러가 안나는 것임
	
		System.out.println(sum);
		
		
		
		//2. while문 으로 풀 경우
		//int i = 1; 	//루프변수 -> 이런 변수명은 절대 사용 금지!!! 
		//						 -> 중요 한개의 메소드내에서는 모든 지역 변수의 이름은 유일해야한다.(************)

		sum = 0; 	//누적변수
		int n = 1; // 루프변수

		while (true) {// while문의 무한루프

			sum += n;

			if (sum >= 1000) {
				System.out.println(n);
				break;
			}
			n++;
		}
			 System.out.println(sum);
			
			 
				// whil문 2번째

				sum = 0; // 누적변수
				n = 1;	 //루프변수

				while (sum < 1000) {

					sum += n;
					n++;
				}
				System.out.println(sum);
				 
				 
				//for 간단하게 쓰는 법
				sum = 0;
				
				for (int i=1; sum<1000 ; i++) {
					
					sum += i;
					
				}
				System.out.println(sum);		
				
	}//m3
	

	private static void m2() {

		
		//구구단 출력
		int dan = 5;
		int i = 1; //1 ~ 9
		
		while (i<=9) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			i++;
			
		}
	}

	private static void m1() {
		
		// while

		// - for문 유사
		// - 조건에 따라 반복 제어를 하는 제어문

		// if: 조건에 따라 1회 실행
		// while: 조건에 따라 N회 실행

		// while문 생김새
		// while (조건식){
		// 실행문;
		// }

		
		// ============================================================
		// 요구사항1] 숫자 1~10까지 출력하시오.

		
		// 1.
		for (int i = 1; i <= 10; i++) { // 초기식, 조건식, 증감식
			System.out.printf("%3d", i);
		}
		System.out.println();

		
		// 2.*********************************
		// 찍을 숫자가 필요
		int n = 1; // 루프변수이자 초기식임
		while (n <= 10) { // 조건식
			System.out.printf("%3d", n);
			n++; // 증감식
		}
		System.out.println();
		// =========================================================둘다 같은 일을 한 것임

	}

}//class
