package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If {
	
	public static void main(String[] args) {
		
		//[if]
		
				
		/*
		 프로그래밍 > 자료구조 + 알고리즘 
			  
		제어문
		- 수많은 명령어들을 제어(통제) 역할하는 문장
		- 조건 제어, 반복 제어, 분기 제어
			
		1. 조건문
		- 개발자가 조건을 제시해서 프로그램의 흐름을 제어할 수 있다.
			a. if
			b. switch
				
		2. 반복문
		- 특정 코드를 개발자가 원하는 횟수만큼 반복 실행을 제어 할 수있다.
			a. for
			b. while
			c. do while
			d. for(향상된 for문, Enhanced For Statement) > foreach
				
		3. 분기문
		- 개발자가 코드의 흐름을 원하는 곳으로 순간 이동을 할 수 있다.
			a. break
			b. continue
			c. goto(JDK 1.5 폐기)
				
		*/

		
		//m1();
		//m2();
		m3();
				
		/*
				  
		일반적인 프로그래밍 언어
		
		조건문의 조건식
		- boolean 사용, boolean이 아니어도 사용이 가능하다.
		- 자바는 무조건 boolean을 사용한다.
		- C언어 boolean이 없다. > 정수 사용
		- 정수: 0(false), 1(true), 그 이외의 숫자(true)
		- 실수: 0.0(false), 그 이외의 숫자(true)
		- 문자: \0(null 문자, 문자코드값(0))(false), 그 이외의 문자(true)
		- 문자열: ""(빈문자열, Empty String)(false), "홍길동"(true)
				
				
		int n = 0;
				
		if (n) {
				//참
		} else {
				//거짓
		}
				
				
		*/
				
		}//main

		private static void m3() {

			// 중첩된 제어문

			// 중첩된 if문 > Nested if Statement
			/*
			  
			  if (조건식) {
			  
			  실행코드; if (조건식) {
			  
			  if (조건식) {
			  
			  }
			  
			  }
			  
			  } else {
			  
			  if (조건식) {
			  
			  }
			  
			  }
			  
			 */

			// 국어 점수 입력 > 합격 vs 불합격
			// -> 60점 이상 합격, 미만 불합격
			// -> 0~100을 벗어나는 점수를 거르는 작업을 해야한다. 
			//		---> 아래 두개의 차이를 알아야 하며 후자의 경우로 짜는 걸 연습!!

			int kor = 95;

			// 조건 3가지
			// 1. 합격 조건
			// 2. 불합격 조건
			// 3. 벗어난 점수 조건

			// 아래의 2개의 케이스는 반드시 생각!!!
			//Case 1.
			if (kor >= 60 && kor <= 100) {
				System.out.println("합격");
			} else if (kor >= 0 && kor < 60) {
				System.out.println("불합격");
			} else {
				System.out.println("올바르지 않은 점수입니다. 0~100점 사이를 입력하세요.");
			}

			
			//Case 2.
			if (kor >= 0 && kor <= 100) {

				if (kor >= 60) {
					System.out.println("합격");
				} else {
					System.out.println("불합격");
				}

			} else {
				System.out.println("올바르지 않은 점수입니다. 0~100점 사이를 입력하세요.");
			}
		}
			
		private static void m2() {

			// - if문
			// - 3항 연산자

			int n = 10;

			if (n > 0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}

			String result = (n > 0) ? "양수" : "음수";
			System.out.println(result);

		}

		private static void m1() throws NumberFormatException, IOException {
			
			/*
				 
			 if문
			 - 개발자 > 조건을 제시한 후 결과에 따라 실행할 코드를 선택할 수 있게하는 제어
			 - 조건 > 반드시 boolean 가지는 변수, 표현식
				 
			 	1.
			   	if (조건식) { 
				  	실행문; 
			  	} 
				  
				  
				  
				2.
			  	if (조건식) { 
					실행문; 
			  	} else {
					실행문;
			  	}
				  
				  
			 	3. 다중조건문, 다중 if문
				  
		  	  	if (조건식) { 
			 		실행문; 
			  	 } else if (조건식) {
					실행문;
				 } else {
				 	실행문;
				 }
				  
				  
				  
				 4.
				 []: 사용해도 되고 생략해도 된다.
				 if (조건식) { 
				  	실행문; 
				 } 
				  
				 [else if(조건식) {
				 		실행문;
				  }] X N 
				 [else {
				 		실행문;
				  }]
				  
				 */
				
				BufferedReader reader 
					= new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("숫자 입력: ");
				int num = Integer.parseInt(reader.readLine());
				
//				if(num > 0) {
//					System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
//				}

				if(num > 0) {
					System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
				} else { 
					System.out.printf("입력한 숫자 %d는 양수가 아닙니다.\n", num);
				}
				
				
				if (num > 0) {
					System.out.printf("입력한 숫자 %d는 양수입니다.\n", num);
				} else if (num < 0) {
					System.out.printf("입력한 숫자 %d는 음수입니다.\n", num);
				} else {
					System.out.println("0입니다.");
				}
				
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				
			
				
				System.out.println("아침에 눈을 떴다");
				
				System.out.println("지금 몇시지?");
				int hour = Integer.parseInt(reader.readLine());
				
//				if (hour < 8) {
//					System.out.println("아침밥을 먹는다.");
//				}
				
				
//				if(hour < 8) {
//					System.out.println("아침밥을 먹는다.");
//				} else {
//					System.out.println("빨리 옷을 입는다.");
//				}
//				
//				System.out.println();
				
				
				if (hour < 8) {
					System.out.println("아침밥을 먹는다.");
				} else if (hour <= 9) {
					System.out.println("편의점에 김밥을 산다.");
				} else {
					System.out.println("회사에 미리 전화를 한다.");
				}
				
				System.out.println("지하철을 타고 출근을 한다.");
				
			}//m1
			

		}

		/*

		K&R 스타일
		class {
			public static void m1() {	
				if (true) {		
				}	
			}
		}

		
		Allman 스타일
		class
		{
			public static void m1()
			{
				if (true)
				{
				}
			}
		}

		*/

		