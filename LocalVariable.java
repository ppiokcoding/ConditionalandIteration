package ConditionalandIteration;


public class LocalVariable {
	
	//변수 선언문이 어디에 위치하고 있는지?? > 클래스 안 > 멤버 변수
	int b = 20;
	
	public static void main(String[] args) {
		
		//[LocalVariable]
		
		//자바 변수의 종류
		//1. 멤버 변수
		//2. 지역 변수
		
		
		//변수 선언문이 어디에 위치하고 있는지?? > main 메소드 안 > 지역 변수
		int a = 10;
		
		
		//Local Variable, 지역 변수
		// - 메소드나 제어문안에서 선언한 변수
		// - 자신이 선언된 메소드나 제어문을 자신의 영역이라고 생각한다. > 영역(Scopr) > 해당 변수는 자신의 영역밖을 나가지 못한다. 
		//														> 외부 영역에서는 해당 변수의 접근이 불가능하다.
		
		//main 메소드안에서 선언된 지역 변수 > main 메소드 밖에서는 사용이 불가능하다.(c얘기!)
		int c = 100;
		
		System.out.println("c: " + c);
		
		m1();
		
		System.out.println("c: " + c);
		
		
		
		if (c > 0) {
			
			//if문을 자신의 영역으로 생각하는 지역 변수 > if문을 벗어나면 사용 불가
			int d = 1000; 
			System.out.println("d: " + d); //접근 가능
			
			//오류 메세지 : Duplicate local variable c = 지역변수 c가 중복됐다.
			//int c = 2000;
			//System.out.println(c);
		
		}
		//d can not be resolved to a variable
		//System.out.println("d: " + d); //접근 불가능 
		
		//모든 것들의 생명 주기
		// - 어떤 요소가 언제 태어나서(=메모리에 생성된다.) 언제 죽는지(=메모리에서 소멸된다.)?
		
		//지역 변수의 생명 주기(Life Cycle)
		// - 규칙
		// - 탄생: 선언문이 실행되는 순간
		// - 소멸: 선언문이 포함된 블럭('{}')에서 제어가 벗어나는 순간
		
		
		
		
		//10바퀴(i: 1~10), 타이핑 횟수 제일 많음 = 기피
		for (int i=1; i<=10; i++) {
			
		}
		
		//10바퀴(i: 1~10), 회전수 조오금 생각해야해서 가독성 떨어짐
		for (int i=1; i<11; i++) {
			
		}

		
		//10바퀴(i: 0~9), 이걸 선호 = 가독성 높아서 = 0부터 시작하면 회전수는 '10' 부분 수와 같기 때문
		for (int i=0; i<10; i++) {
			
		}
		
		//int i: for문의 지역변수 > for문 실행되는 동안 계속~
		//int n: for문의 지역변수 > for문 한바퀴 동안만 살아있음.
		for (int i=0; i<10; i++) {
			
			int n = 10; //한바퀴 돌때마다 사라지고 만들어지고... 굉장히 짧은 변수주기를 가짐
			System.out.println(n);
			n++; //int n은 한바퀴마다 사라지므로 누적이 되지않음
		}
		
		
		
	}//main

	private static void m1() {

		int c = 200;  //같은 이름의 변수는 안되지만 '영역'이 다르기때문에 이름은 같아도 충돌이 안나는 것임!
		
		//System.out.println("m1, c: " + c); // main 메소드 밖이라 c가 누군지 못알아봄 즉, 변수의 영역이 바뀌면 사용불가
		// 굳~~이 쓰려면 매개변수 (int c)를 쓰면 됨 그러나 지역변수 자체가 넘어간 것이 아니다.
		System.out.println("m1, c: ");
		
	}
	
	public static void m2(int m) { //매개변수? > m2 의 지역변수
		//int m; // 오류 메세지 : Duplicate local variable m
	}

}
