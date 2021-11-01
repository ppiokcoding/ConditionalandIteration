package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {
	
public static void main(String[] args) throws Exception {
		
		//[switch]
		/*
		���ǹ�
		1. if
		2. switch
		 
		switch��, switch case��
		- ���ǹ�
		- �������� ��� ������ �ڷ��� > ����, ���ڿ�, ������(enum)
		- C��� switch -> ����(������)
		- if���� ���ؼ� Ȱ�뵵�� ����.
		- if���� ���ؼ� �������� ����.
		 
		 switch (����) {
		 	case ��:
		 		���๮;
		 		break;
		 	[case ��:
		 		���๮;
		 		break;] x n
		 	[default:
		 		���๮;
		 		break;]
		 		
		 }
		 
		 */
		
		//m1();
		//m2();
		//m3();
		
		
	}//main

	private static void m3() {

		
		//�䱸����] ����ڰ� ���� �Է��ϸ� �ش���� ������ ��?
		
		//1���� 3���� ���� ���������̴� ��, ������ ������ ���� ���̽��� §��.
		int month = 1; //�Է� ��
		int lastDay = 0; //������ ��
		
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
		
		System.out.printf("�Է��� %d���� ������ ��¥�� %d���Դϴ�.\n", month, lastDay);
	}

	private static void m2() throws Exception { //throws Exception : ����ָ� ȣ���ϴ� 'main' �޼��忡�� �ʿ�!
		
		//�䱸����] ���Ǳ�
		// - �޴� ��� > ���� ���� > ���� ���
		
		//��������] ���̴� ���� �λ�(700��). ������ ���̴��� ������ �׻� �ݶ�� �����Ұ� �λ��ϰڴ�.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("========================");
		System.out.println("         ���Ǳ�");
		System.out.println("========================");
		System.out.println("1. �ݶ�");
		System.out.println("2. ���̴�");
		System.out.println("3. ��ī��");
		System.out.println("========================");
		System.out.print("����(��ȣ�Է�): ");
		
		String sel = reader.readLine();
		
		//�����޼��� : Use the "equals" method

		
		//1.
//		if(sel.equals("1")) {
//			System.out.println("700�� �Դϴ�.");
//		} else if (sel.equals("2")) {
//			System.out.println("700�� �Դϴ�.");
//		} 
//		  else if (sel.equals("3")) {
//			System.out.println("1600�� �Դϴ�.");
//	    }// �ȵǴ� ������ ���ڿ��� �񱳴� == ���� �ȵ� 
		
		
		
		//2.
		if(sel.equals("1") || sel. equals("2")) {
			System.out.println("800�� �Դϴ�.");
		}  else if (sel.equals("3")) {
			System.out.println("1600�� �Դϴ�.");
	    }// �Ȱ��� ���� �ڵ尡 �α��� �̻� ���� ��ȿ�����̹Ƿ� �̷��� �����!
		
		
		System.out.println();
		
		
		
		//3.
		
		//case 2���� �ϳ��� ������ �����ϴ� ����
		switch (sel) {
			case "1":
			case "2":
				System.out.println("700�� �Դϴ�.");
				break;
				//break;  : ������ ��� case1+3 �̷��� �� ��, 2���� ���� ����
			case "3":
				System.out.println("1600�� �Դϴ�.");
				break;
		}
		System.out.println();
		System.out.println("���Ǳ� ����");
		
		
		
	}

	private static void m1() {
		
		//�䱸����] ���ڸ� 1�� �Է¹޾� �ѱ۷� ����Ͻÿ�.
		int num = 2;
		
		
		//if������ ���
		if (num == 1) {
			System.out.println("�ϳ�");
		} else if(num == 2) {
			System.out.println("��");
		} else if (num == 3) {
			System.out.println("��");
		} else {
			System.out.println("������ ����");
		}
		

		
		//switch�� ���� �Ȱ��� ���� �����
		switch (num) {
			case 1: // '1:' = Label, ��ġ�� ǥ���ϴ� ����(ǥ���� ����)
				System.out.println("�ϳ�");
				break; //����� Ż���ض�!!
			case 2:
				System.out.println("��");
				break;
			case 3:
				System.out.println("��");
				break;
			default:
				System.out.println("������ ����");
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
