package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class For {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex25_for.java 
		// = 반복문
		// = 단일 for 문 
		
		/*
		 반복문
		 - 조건을 만족하면 실행 블럭의 코드를 실행하는 제어문 x 반복
		 
		 
		 for문
		 
		 for (초기식; 조건식; 증감식) { 
		 	실행문;
		 }
		 
		 
		 */

		//m1();			//개념	
		//m2();			//숫자 출력, 루프변수 역할, 짝수 출력
		//m3();			//홀수 출력
		//m4();			//구구단 출력
		//m5();			//숫자의 합, 문자열 누적
		//m6();			//숫자 입력 후 그 수의 합(누적 + 합)
		//m7();			//난수, 랜덤 숫자 뽑아내기, 난수 공식
		//m8();		 	//분기문(break, continue)
		//m9(); 		//무한루프
		
		
	}//main

	private static void m9() throws NumberFormatException, IOException {

		//무한 루프 > 반복 횟수가 무한대
		
		
		//21억 회전
		//for (int i=0; i<10; i--) {
		//	System.out.println(i);
		//}
		
		
//		for (int i=Integer.MIN_VALUE + 10; i<10; i--) {
//			System.out.println(i);
//		}
		

		
		//의도적으로 무한 루프 만들기
		// -> 언제 쓰임? 
		// 	- 반복 횟수를 알 수 없는 경우
		//	- 반복 횟수를 미리 정할 수 없는 경우
		
		//탈출 유무 판단?
		// -> 탈출 필요시 -> if + break 사용 
		// -> 탈출 필요시 -> if //+ return 사용 
		
		
		
//		for (반복 x n ?) {
//		게임한판();
//		}
	
		
		
		//루프변수 사용 방법(1=2=3번 방법)
		
		//1번 방법
//		for (;;) {
//		System.out.println("무한루프");
//		}
		
		//2번 방법
//		for(; true;) {
//			System.out.println("무한 루프");
			
			
		//3번 방법
//		for (int i=0; ; i++) {
//			System.out.println(i);
//		}		
		
		
		
		//무한 루프 사례
		//요구사항] 사용자로부터 숫자를 입력받아 합을 구하시오. x 몇개의 숫자를 입력받는지 미정이다 = 사용자 마음대로!
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum =0; // 누적 변수만듦
		
		//for(몇바퀴?) {
		
		for (;;) {
			System.out.println("숫자(종료 0입력): ");
			int num = Integer.parseInt(reader.readLine());
		
			if (num == 0) {
				break;
				//return; //= 빈 리턴문, Empty Return Statement
			}
			
			sum += num;
		
		
			
		}//for
		
		System.out.println(sum);

	
		
	}//m9 , return: 메소드 자체를 탈출함. break보다 더 강력함

	private static void m8() {

		//분기문
		// - break, continue
		// - 분기문은 단독으로 사용하지 않는다. > 조건문이나 반복문과 함께 사용한다.
		// - if문을 자신의 영역이라고 인식하지 않는다.
		
		//1. break
		//- 자신이 속한 제어문을 탈출한다.
		//- 완전 탈출
		
		
		//2. continue
		// - 현재 제어를 멈추고 제어의 헤더로 이동한다.
		// - 1회 스킵
		
		
		//redaer > 사용자 입력이 정확히 뭔지 모르는 경우
		int num = 10;
		
		
		for(int i=1; i<=10; i++) {
			
			//break; //1.얘를 만나자마자 첫번째 바퀴에서 걍 바로 빠져나감
			
			//if ( i == num) {
			//	break; // if문 탈출 -> 그럼 있으나 마나 아닌가? -> 실제 결과 다름 => **break는 if문이 아닌 for문을 탈출했다.** 
			// 즉, 이 break는 if문이 아닌 for문을 탈출하는 break이다.
			//}
			
			if (i == 5) {  // 컨티뉴는 이번만 실행 안하고 다시 위로 올라간다는 의미 그래서 5가 안나옴
				continue; //1234678910
			}
			
			//1-1.오류메세지 : Unreachable code
			System.out.println(i);
		}
		
		// 2.여기로 빠져나가버림 그러다보니 syso(i)를 미처실행못해서 도달할 수 없는 코드라는 에러메세지가 뜸
		
		
		//초등 선생님 + 학생 상담(30명)
		for (int i=1; i<=30; i++) {
			
			
		//	if(i == 15) {
		//		break; // 14번 학생까지 상담 그이후는 통째로 스탑
		//	}
			
			
			if(i == 10 || i == 12 || i == 25) {
				continue; // 10번, 12번, 25번 학생은 결석! 얘 빼고 다 상담 즉, 몇몇개를 스킵하고 넘어감
			}
			
			
			
			System.out.printf("선생님이 %d번 학생을 상담합니다.\n", i);
		}
		
		
		
	}

	private static void m7() {

		//난수
		// - 임의의 수
		// - 난수 생성기
		
		
		//1. Math.random() 메소드
		//2. Random 클래스 > 1번의 Wrapper Class
		
		//Math 클래스
		// - 수학과 관련 기능 제공 클래스
		//System.out.println(Math.PI);
		
		
		//랜덤한 숫자
		// 0이상(inclusive) ~ 1미만(exclusive)의 수
		//0.0 ~ 0.99999
		//random : Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution from that range. 
		System.out.println(Math.random()); 
		
		
		//요구사항1] 1 ~ 10 사이의 난수 구하기
		//- 0.0 ~ 0.1 ~ .. ~ 0.9999
		//- 0.0 ~ 1.0 ~ .. ~ 9.9999
		//- 0 ~ 1 ~ .. ~ 9
		
		for(int i=0; i<10; i++) {
		int num = (int)(Math.random()*10) + 1;  // double -> int 바뀔때 소수이하는 버려지기 때문 9.9999 = 9 가 됨 
		System.out.println(num);
		}
		
		//요구사항2] 1 ~ 7 사이의 난수
		
		//난수 공식 : (int)(Math.random() * 최댓값) + 최솟값
		
		//0 ~ 6 + 1 > 1~7
		for(int i=0; i<10; i++) {
			//int num = (int)(Math.random()*10) + 1;  
			
			
			//System.out.println(Math.random()* 7);
			int num = (int)(Math.random()*7) + 1;
			System.out.println(num);
				
			}
		
		
	}

	private static void m6() throws NumberFormatException, IOException {

		//요구사항] 사용자에게 10개의 숫자를 입력받아 그 수의 합을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m5() {

		int sum = 0; // 누적 변수 선언
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum += 4;
		sum++;
		
		System.out.println(sum);
		
		//루프 + 누적 업무
		//요구사항] 1 ~ 10까지의 합을 구하시오.
		//1 + 2 + 3 + 4 + 5 + ...+ 9 + 10 = 55
		
		//무언가의 누적값을 구해라!(************************)
		//1. 누적 변수를 선언한다. 초기화(누적에 영향을 미치지 않는다.) 
		sum = 0;
		
		//2. 누적될 데이터 > 얻기 위한 루프를 생성한다.(수열) > for문
		//for (int i=1; i<=10; i++) {
		//for (int i=1; i<=100; i++) {
		//for (int i=1; i<=10; i+=2) {
		//for (int i=2; i<=10; i+=2) {
			for (int i=7; i<=100; i+=7) {
			
			//3. 누적한다.
			sum = sum + i;
		
			//sum = sum + 1;
			//sum = sum + 2;
			//sum = sum + 3;
			//..
			//sum = sum + 10;
		
		}
		
		System.out.println(sum);
		
		//누적 작업 > 숫자, 문자열
		
		//문자열 누적
		
		String str = ""; // 누적 변수 > 빈문자열
		
		for (int i=0; i<10; i++) {
			//str = str + "홍길동";
			str += i;
		}
		System.out.println(str);
	}

	private static void m4() throws NumberFormatException, IOException {

		
		//구구단 출력(좋은 예제)
		// - 5단
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단 입력: ");
		int gugudan = Integer.parseInt(reader.readLine());
		
		
		//int gugudan = 5;
		
		// 5 x 1 = 5
		// 5 x 2 = 10
		//..
		// 5 x 9 = 45
		
		for(int i=1; i<=9; i++) { //9회전
			System.out.printf("%d x %d = %2d\n", gugudan, i, gugudan*i);
		}// 2= 5를 오를쪽 정렬하려고 2를 씀! 정렬 파트 찾아보기
		
	}

	private static void m3() {

		//요구사항] 1 ~ 10 사이의 홀수만 출력하시오.
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//요구사항] 10 ~ 1 까지 출력하시오.
		
		for(int i=1; i<=10; i++) {
			System.out.println(11-i);
		}
		System.out.println();
		
		
		//무한 루프 ( 이거 실행 시키지 말기, 노트북 맛갔음 아까)
		//for(int i=10; i<=10; i--) { // 대략 21억 바퀴
		//	System.out.println(i);
		//}
		
			for(int i=10; i>0; i--) {
				System.out.println(i);
			}
		
		System.out.println();
		
		
	}

	private static void m2() {
		
		//for문 목적 > 기본
		//1. 반복 횟수 제어
		//2. 루프 변수 제어 
		
		
		//요구사항] 숫자 1~10까지 출력하시오. > 수정사항] 20까지 늘리시오 or 숫자뒤에 . 찍으세요.
		
		//첫번째 방법
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println();
		
		
		//두번째 방법
		int num = 1;
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println();
		
		//세번째 방법
		//for문 사용 -> 무난
		
		num = 5; //seed
		
		for (int i=0; i<10; i++) {
			
			System.out.println(num + ".");
			
			num = num + 1; 
			// num += 1;
			// num++
		}
		System.out.println();
		
		
		//루프변수의 역할(***********************)
		//1. 회전수
		//2. 루프변수 값 > 어떤 용도 사용?
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.println(i + 1);
		}
		System.out.println();
		
		
		//통상적인 for문의 루프변수 형태
		//TODO - 이어지는 작업을 하는데 가장 편한 형태의 for문이다. > 배열때 확인!!!!
		//1. 루프변수를 0으로 시작한다.
		//2. 조건을 부등호만 사용한다.
		for(int i=0; i<10; i++) {
		}
		System.out.println();
		//1~10사이의 짝수를 출력하시오.
		
		for(int i=1; i<=10; i++) {//10바퀴 실행
			if(i % 2 ==0)//(너(i) 짝수냐)
			System.out.println(i);
		}
		System.out.println();
		
		
		for(int i=2; i<=10; i+=2) { //5바퀴 실행 = 프로그램 실행속도가 반이상 줄어들음(if문이 빠졌기 때문)
			System.out.println(i);
		}
		System.out.println();
		
		
	}

	private static void m1() {
		
		//요구사항] "안녕하세요" x5번 출력
		
		//int a = 10; int b = 20; int c = 30;
		
		//int i=0; 	//초기식 = 처음 진입할 때 단 1회만 실행한다.
		//i < 5; 	//조건식 = 반복 유무를 결정한다.
		//i++;		//증감식 = 조건의 변화를 유발한다.
		

		//int i -> 반복의 횟수를 제어하는 역할 -> 루프 변수(역할) -> i
		
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요.");
		}
	
		//System.out.println(i); i는 지역변수
		
		System.out.println("종료");
	
		
		int j = 0;
		
		//루프 변수는 반드시 for의 지역변수일 필요는 없다.
		for (j=0; j<5; j++) {
			System.out.println("반갑습니다.");
			
		}
		System.out.println(j);
	}

		
		
}


//setxxx() : 쓰기
//getxxx() : 읽기
//isxxx()  : 확인 
	


