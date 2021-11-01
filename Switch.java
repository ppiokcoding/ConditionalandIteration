package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {
	
public static void main(String[] args) throws Exception {
		
		//[switch]
		/*
		조건문
		1. if
		2. switch
		 
		switch문, switch case문
		- 조건문
		- 조건으로 사용 가능한 자료형 > 정수, 문자열, 열거형(enum)
		- C언어 switch -> 조건(정수형)
		- if문에 비해서 활용도가 낮다.
		- if문에 비해서 가독성이 높다.
		 
		 switch (조건) {
		 	case 값:
		 		실행문;
		 		break;
		 	[case 값:
		 		실행문;
		 		break;] x n
		 	[default:
		 		실행문;
		 		break;]
		 		
		 }
		 
		 */
		
		//m1();
		//m2();
		//m3();
		
		
	}//main

	private static void m3() {

		
		//요구사항] 사용자가 월을 입력하면 해당월의 마지막 일?
		
		//1월과 3월은 같은 마지막일이다 즉, 같은달 끼리는 같은 케이스로 짠다.
		int month = 1; //입력 월
		int lastDay = 0; //마지막 일
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDay = 31;
				break;
			case 2:
				lastDay = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				lastDay = 30;
				break;
				
		}//switch
		
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일입니다.\n", month, lastDay);
	}

	private static void m2() throws Exception { //throws Exception : 생긴애를 호출하는 'main' 메서드에도 필요!
		
		//요구사항] 자판기
		// - 메뉴 출력 > 음료 선택 > 가격 출력
		
		//수정사항] 사이다 가격 인상(700원). 앞으로 사이다의 가격은 항상 콜라와 동일할게 인상하겠다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("========================");
		System.out.println("         자판기");
		System.out.println("========================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("========================");
		System.out.print("선택(번호입력): ");
		
		String sel = reader.readLine();
		
		//에러메세지 : Use the "equals" method

		
		//1.
//		if(sel.equals("1")) {
//			System.out.println("700원 입니다.");
//		} else if (sel.equals("2")) {
//			System.out.println("700원 입니다.");
//		} 
//		  else if (sel.equals("3")) {
//			System.out.println("1600원 입니다.");
//	    }// 안되는 이유는 문자열의 비교는 == 쓰면 안됨 
		
		
		
		//2.
		if(sel.equals("1") || sel. equals("2")) {
			System.out.println("800원 입니다.");
		}  else if (sel.equals("3")) {
			System.out.println("1600원 입니다.");
	    }// 똑같이 생긴 코드가 두군데 이상 들어가면 비효율적이므로 이렇게 만들기!
		
		
		System.out.println();
		
		
		
		//3.
		
		//case 2개가 하나의 몽통을 공유하는 형태
		switch (sel) {
			case "1":
			case "2":
				System.out.println("700원 입니다.");
				break;
				//break;  : 없앴을 경우 case1+3 이렇게 됨 즉, 2개의 값이 나옴
			case "3":
				System.out.println("1600원 입니다.");
				break;
		}
		System.out.println();
		System.out.println("자판기 종료");
		
		
		
	}

	private static void m1() {
		
		//요구사항] 숫자를 1개 입력받아 한글로 출력하시오.
		int num = 2;
		
		
		//if문으로 출력
		if (num == 1) {
			System.out.println("하나");
		} else if(num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		

		
		//switch로 위와 똑같은 문장 만들기
		switch (num) {
			case 1: // '1:' = Label, 위치를 표시하는 역할(표지판 역할)
				System.out.println("하나");
				break; //제어문을 탈출해라!!
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
		}
		
//		double m = 3.14;
//		
//		switch (m) {
//			case 3.14:
//				System.out.println("PI");
//				break;
//		}
		
	}//m1
	
	
}
