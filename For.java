package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class For {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex25_for.java 
		// = �ݺ���
		// = ���� for �� 
		
		/*
		 �ݺ���
		 - ������ �����ϸ� ���� ���� �ڵ带 �����ϴ� ��� x �ݺ�
		 
		 
		 for��
		 
		 for (�ʱ��; ���ǽ�; ������) { 
		 	���๮;
		 }
		 
		 
		 */

		//m1();			//����	
		//m2();			//���� ���, �������� ����, ¦�� ���
		//m3();			//Ȧ�� ���
		//m4();			//������ ���
		//m5();			//������ ��, ���ڿ� ����
		//m6();			//���� �Է� �� �� ���� ��(���� + ��)
		//m7();			//����, ���� ���� �̾Ƴ���, ���� ����
		//m8();		 	//�б⹮(break, continue)
		//m9(); 		//���ѷ���
		
		
	}//main

	private static void m9() throws NumberFormatException, IOException {

		//���� ���� > �ݺ� Ƚ���� ���Ѵ�
		
		
		//21�� ȸ��
		//for (int i=0; i<10; i--) {
		//	System.out.println(i);
		//}
		
		
//		for (int i=Integer.MIN_VALUE + 10; i<10; i--) {
//			System.out.println(i);
//		}
		

		
		//�ǵ������� ���� ���� �����
		// -> ���� ����? 
		// 	- �ݺ� Ƚ���� �� �� ���� ���
		//	- �ݺ� Ƚ���� �̸� ���� �� ���� ���
		
		//Ż�� ���� �Ǵ�?
		// -> Ż�� �ʿ�� -> if + break ��� 
		// -> Ż�� �ʿ�� -> if //+ return ��� 
		
		
		
//		for (�ݺ� x n ?) {
//		��������();
//		}
	
		
		
		//�������� ��� ���(1=2=3�� ���)
		
		//1�� ���
//		for (;;) {
//		System.out.println("���ѷ���");
//		}
		
		//2�� ���
//		for(; true;) {
//			System.out.println("���� ����");
			
			
		//3�� ���
//		for (int i=0; ; i++) {
//			System.out.println(i);
//		}		
		
		
		
		//���� ���� ���
		//�䱸����] ����ڷκ��� ���ڸ� �Է¹޾� ���� ���Ͻÿ�. x ��� ���ڸ� �Է¹޴��� �����̴� = ����� �������!
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum =0; // ���� ��������
		
		//for(�����?) {
		
		for (;;) {
			System.out.println("����(���� 0�Է�): ");
			int num = Integer.parseInt(reader.readLine());
		
			if (num == 0) {
				break;
				//return; //= �� ���Ϲ�, Empty Return Statement
			}
			
			sum += num;
		
		
			
		}//for
		
		System.out.println(sum);

	
		
	}//m9 , return: �޼ҵ� ��ü�� Ż����. break���� �� ������

	private static void m8() {

		//�б⹮
		// - break, continue
		// - �б⹮�� �ܵ����� ������� �ʴ´�. > ���ǹ��̳� �ݺ����� �Բ� ����Ѵ�.
		// - if���� �ڽ��� �����̶�� �ν����� �ʴ´�.
		
		//1. break
		//- �ڽ��� ���� ����� Ż���Ѵ�.
		//- ���� Ż��
		
		
		//2. continue
		// - ���� ��� ���߰� ������ ����� �̵��Ѵ�.
		// - 1ȸ ��ŵ
		
		
		//redaer > ����� �Է��� ��Ȯ�� ���� �𸣴� ���
		int num = 10;
		
		
		for(int i=1; i<=10; i++) {
			
			//break; //1.�긦 �����ڸ��� ù��° �������� �� �ٷ� ��������
			
			//if ( i == num) {
			//	break; // if�� Ż�� -> �׷� ������ ���� �ƴѰ�? -> ���� ��� �ٸ� => **break�� if���� �ƴ� for���� Ż���ߴ�.** 
			// ��, �� break�� if���� �ƴ� for���� Ż���ϴ� break�̴�.
			//}
			
			if (i == 5) {  // ��Ƽ���� �̹��� ���� ���ϰ� �ٽ� ���� �ö󰣴ٴ� �ǹ� �׷��� 5�� �ȳ���
				continue; //1234678910
			}
			
			//1-1.�����޼��� : Unreachable code
			System.out.println(i);
		}
		
		// 2.����� ������������ �׷��ٺ��� syso(i)�� ��ó������ؼ� ������ �� ���� �ڵ��� �����޼����� ��
		
		
		//�ʵ� ������ + �л� ���(30��)
		for (int i=1; i<=30; i++) {
			
			
		//	if(i == 15) {
		//		break; // 14�� �л����� ��� �����Ĵ� ��°�� ��ž
		//	}
			
			
			if(i == 10 || i == 12 || i == 25) {
				continue; // 10��, 12��, 25�� �л��� �Ἦ! �� ���� �� ��� ��, ���� ��ŵ�ϰ� �Ѿ
			}
			
			
			
			System.out.printf("�������� %d�� �л��� ����մϴ�.\n", i);
		}
		
		
		
	}

	private static void m7() {

		//����
		// - ������ ��
		// - ���� ������
		
		
		//1. Math.random() �޼ҵ�
		//2. Random Ŭ���� > 1���� Wrapper Class
		
		//Math Ŭ����
		// - ���а� ���� ��� ���� Ŭ����
		//System.out.println(Math.PI);
		
		
		//������ ����
		// 0�̻�(inclusive) ~ 1�̸�(exclusive)�� ��
		//0.0 ~ 0.99999
		//random : Returns a double value with a positive sign, greaterthan or equal to 0.0 and less than 1.0.Returned values are chosen pseudorandomly with (approximately)uniform distribution from that range. 
		System.out.println(Math.random()); 
		
		
		//�䱸����1] 1 ~ 10 ������ ���� ���ϱ�
		//- 0.0 ~ 0.1 ~ .. ~ 0.9999
		//- 0.0 ~ 1.0 ~ .. ~ 9.9999
		//- 0 ~ 1 ~ .. ~ 9
		
		for(int i=0; i<10; i++) {
		int num = (int)(Math.random()*10) + 1;  // double -> int �ٲ� �Ҽ����ϴ� �������� ���� 9.9999 = 9 �� �� 
		System.out.println(num);
		}
		
		//�䱸����2] 1 ~ 7 ������ ����
		
		//���� ���� : (int)(Math.random() * �ִ�) + �ּڰ�
		
		//0 ~ 6 + 1 > 1~7
		for(int i=0; i<10; i++) {
			//int num = (int)(Math.random()*10) + 1;  
			
			
			//System.out.println(Math.random()* 7);
			int num = (int)(Math.random()*7) + 1;
			System.out.println(num);
				
			}
		
		
	}

	private static void m6() throws NumberFormatException, IOException {

		//�䱸����] ����ڿ��� 10���� ���ڸ� �Է¹޾� �� ���� ���� ���Ͻÿ�.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			
			System.out.print("����: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		
		System.out.println(sum);
		
	}

	private static void m5() {

		int sum = 0; // ���� ���� ����
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum += 4;
		sum++;
		
		System.out.println(sum);
		
		//���� + ���� ����
		//�䱸����] 1 ~ 10������ ���� ���Ͻÿ�.
		//1 + 2 + 3 + 4 + 5 + ...+ 9 + 10 = 55
		
		//������ �������� ���ض�!(************************)
		//1. ���� ������ �����Ѵ�. �ʱ�ȭ(������ ������ ��ġ�� �ʴ´�.) 
		sum = 0;
		
		//2. ������ ������ > ��� ���� ������ �����Ѵ�.(����) > for��
		//for (int i=1; i<=10; i++) {
		//for (int i=1; i<=100; i++) {
		//for (int i=1; i<=10; i+=2) {
		//for (int i=2; i<=10; i+=2) {
			for (int i=7; i<=100; i+=7) {
			
			//3. �����Ѵ�.
			sum = sum + i;
		
			//sum = sum + 1;
			//sum = sum + 2;
			//sum = sum + 3;
			//..
			//sum = sum + 10;
		
		}
		
		System.out.println(sum);
		
		//���� �۾� > ����, ���ڿ�
		
		//���ڿ� ����
		
		String str = ""; // ���� ���� > ���ڿ�
		
		for (int i=0; i<10; i++) {
			//str = str + "ȫ�浿";
			str += i;
		}
		System.out.println(str);
	}

	private static void m4() throws NumberFormatException, IOException {

		
		//������ ���(���� ����)
		// - 5��
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�� �Է�: ");
		int gugudan = Integer.parseInt(reader.readLine());
		
		
		//int gugudan = 5;
		
		// 5 x 1 = 5
		// 5 x 2 = 10
		//..
		// 5 x 9 = 45
		
		for(int i=1; i<=9; i++) { //9ȸ��
			System.out.printf("%d x %d = %2d\n", gugudan, i, gugudan*i);
		}// 2= 5�� ������ �����Ϸ��� 2�� ��! ���� ��Ʈ ã�ƺ���
		
	}

	private static void m3() {

		//�䱸����] 1 ~ 10 ������ Ȧ���� ����Ͻÿ�.
		
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//�䱸����] 10 ~ 1 ���� ����Ͻÿ�.
		
		for(int i=1; i<=10; i++) {
			System.out.println(11-i);
		}
		System.out.println();
		
		
		//���� ���� ( �̰� ���� ��Ű�� ����, ��Ʈ�� ������ �Ʊ�)
		//for(int i=10; i<=10; i--) { // �뷫 21�� ����
		//	System.out.println(i);
		//}
		
			for(int i=10; i>0; i--) {
				System.out.println(i);
			}
		
		System.out.println();
		
		
	}

	private static void m2() {
		
		//for�� ���� > �⺻
		//1. �ݺ� Ƚ�� ����
		//2. ���� ���� ���� 
		
		
		//�䱸����] ���� 1~10���� ����Ͻÿ�. > ��������] 20���� �ø��ÿ� or ���ڵڿ� . ��������.
		
		//ù��° ���
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
		
		
		//�ι�° ���
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
		
		//����° ���
		//for�� ��� -> ����
		
		num = 5; //seed
		
		for (int i=0; i<10; i++) {
			
			System.out.println(num + ".");
			
			num = num + 1; 
			// num += 1;
			// num++
		}
		System.out.println();
		
		
		//���������� ����(***********************)
		//1. ȸ����
		//2. �������� �� > � �뵵 ���?
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.println(i + 1);
		}
		System.out.println();
		
		
		//������� for���� �������� ����
		//TODO - �̾����� �۾��� �ϴµ� ���� ���� ������ for���̴�. > �迭�� Ȯ��!!!!
		//1. ���������� 0���� �����Ѵ�.
		//2. ������ �ε�ȣ�� ����Ѵ�.
		for(int i=0; i<10; i++) {
		}
		System.out.println();
		//1~10������ ¦���� ����Ͻÿ�.
		
		for(int i=1; i<=10; i++) {//10���� ����
			if(i % 2 ==0)//(��(i) ¦����)
			System.out.println(i);
		}
		System.out.println();
		
		
		for(int i=2; i<=10; i+=2) { //5���� ���� = ���α׷� ����ӵ��� ���̻� �پ����(if���� ������ ����)
			System.out.println(i);
		}
		System.out.println();
		
		
	}

	private static void m1() {
		
		//�䱸����] "�ȳ��ϼ���" x5�� ���
		
		//int a = 10; int b = 20; int c = 30;
		
		//int i=0; 	//�ʱ�� = ó�� ������ �� �� 1ȸ�� �����Ѵ�.
		//i < 5; 	//���ǽ� = �ݺ� ������ �����Ѵ�.
		//i++;		//������ = ������ ��ȭ�� �����Ѵ�.
		

		//int i -> �ݺ��� Ƚ���� �����ϴ� ���� -> ���� ����(����) -> i
		
		for(int i=0; i<5; i++) {
			System.out.println("�ȳ��ϼ���.");
		}
	
		//System.out.println(i); i�� ��������
		
		System.out.println("����");
	
		
		int j = 0;
		
		//���� ������ �ݵ�� for�� ���������� �ʿ�� ����.
		for (j=0; j<5; j++) {
			System.out.println("�ݰ����ϴ�.");
			
		}
		System.out.println(j);
	}

		
		
}


//setxxx() : ����
//getxxx() : �б�
//isxxx()  : Ȯ�� 
	


