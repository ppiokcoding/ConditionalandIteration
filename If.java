package ConditionalandIteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class If {
	
	public static void main(String[] args) {
		
		//[if]
		
				
		/*
		 ���α׷��� > �ڷᱸ�� + �˰��� 
			  
		���
		- ������ ��ɾ���� ����(����) �����ϴ� ����
		- ���� ����, �ݺ� ����, �б� ����
			
		1. ���ǹ�
		- �����ڰ� ������ �����ؼ� ���α׷��� �帧�� ������ �� �ִ�.
			a. if
			b. switch
				
		2. �ݺ���
		- Ư�� �ڵ带 �����ڰ� ���ϴ� Ƚ����ŭ �ݺ� ������ ���� �� ���ִ�.
			a. for
			b. while
			c. do while
			d. for(���� for��, Enhanced For Statement) > foreach
				
		3. �б⹮
		- �����ڰ� �ڵ��� �帧�� ���ϴ� ������ ���� �̵��� �� �� �ִ�.
			a. break
			b. continue
			c. goto(JDK 1.5 ���)
				
		*/

		
		//m1();
		//m2();
		m3();
				
		/*
				  
		�Ϲ����� ���α׷��� ���
		
		���ǹ��� ���ǽ�
		- boolean ���, boolean�� �ƴϾ ����� �����ϴ�.
		- �ڹٴ� ������ boolean�� ����Ѵ�.
		- C��� boolean�� ����. > ���� ���
		- ����: 0(false), 1(true), �� �̿��� ����(true)
		- �Ǽ�: 0.0(false), �� �̿��� ����(true)
		- ����: \0(null ����, �����ڵ尪(0))(false), �� �̿��� ����(true)
		- ���ڿ�: ""(���ڿ�, Empty String)(false), "ȫ�浿"(true)
				
				
		int n = 0;
				
		if (n) {
				//��
		} else {
				//����
		}
				
				
		*/
				
		}//main

		private static void m3() {

			// ��ø�� ���

			// ��ø�� if�� > Nested if Statement
			/*
			  
			  if (���ǽ�) {
			  
			  �����ڵ�; if (���ǽ�) {
			  
			  if (���ǽ�) {
			  
			  }
			  
			  }
			  
			  } else {
			  
			  if (���ǽ�) {
			  
			  }
			  
			  }
			  
			 */

			// ���� ���� �Է� > �հ� vs ���հ�
			// -> 60�� �̻� �հ�, �̸� ���հ�
			// -> 0~100�� ����� ������ �Ÿ��� �۾��� �ؾ��Ѵ�. 
			//		---> �Ʒ� �ΰ��� ���̸� �˾ƾ� �ϸ� ������ ���� ¥�� �� ����!!

			int kor = 95;

			// ���� 3����
			// 1. �հ� ����
			// 2. ���հ� ����
			// 3. ��� ���� ����

			// �Ʒ��� 2���� ���̽��� �ݵ�� ����!!!
			//Case 1.
			if (kor >= 60 && kor <= 100) {
				System.out.println("�հ�");
			} else if (kor >= 0 && kor < 60) {
				System.out.println("���հ�");
			} else {
				System.out.println("�ùٸ��� ���� �����Դϴ�. 0~100�� ���̸� �Է��ϼ���.");
			}

			
			//Case 2.
			if (kor >= 0 && kor <= 100) {

				if (kor >= 60) {
					System.out.println("�հ�");
				} else {
					System.out.println("���հ�");
				}

			} else {
				System.out.println("�ùٸ��� ���� �����Դϴ�. 0~100�� ���̸� �Է��ϼ���.");
			}
		}
			
		private static void m2() {

			// - if��
			// - 3�� ������

			int n = 10;

			if (n > 0) {
				System.out.println("���");
			} else {
				System.out.println("����");
			}

			String result = (n > 0) ? "���" : "����";
			System.out.println(result);

		}

		private static void m1() throws NumberFormatException, IOException {
			
			/*
				 
			 if��
			 - ������ > ������ ������ �� ����� ���� ������ �ڵ带 ������ �� �ְ��ϴ� ����
			 - ���� > �ݵ�� boolean ������ ����, ǥ����
				 
			 	1.
			   	if (���ǽ�) { 
				  	���๮; 
			  	} 
				  
				  
				  
				2.
			  	if (���ǽ�) { 
					���๮; 
			  	} else {
					���๮;
			  	}
				  
				  
			 	3. �������ǹ�, ���� if��
				  
		  	  	if (���ǽ�) { 
			 		���๮; 
			  	 } else if (���ǽ�) {
					���๮;
				 } else {
				 	���๮;
				 }
				  
				  
				  
				 4.
				 []: ����ص� �ǰ� �����ص� �ȴ�.
				 if (���ǽ�) { 
				  	���๮; 
				 } 
				  
				 [else if(���ǽ�) {
				 		���๮;
				  }] X N 
				 [else {
				 		���๮;
				  }]
				  
				 */
				
				BufferedReader reader 
					= new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("���� �Է�: ");
				int num = Integer.parseInt(reader.readLine());
				
//				if(num > 0) {
//					System.out.printf("�Է��� ���� %d�� ����Դϴ�.\n", num);
//				}

				if(num > 0) {
					System.out.printf("�Է��� ���� %d�� ����Դϴ�.\n", num);
				} else { 
					System.out.printf("�Է��� ���� %d�� ����� �ƴմϴ�.\n", num);
				}
				
				
				if (num > 0) {
					System.out.printf("�Է��� ���� %d�� ����Դϴ�.\n", num);
				} else if (num < 0) {
					System.out.printf("�Է��� ���� %d�� �����Դϴ�.\n", num);
				} else {
					System.out.println("0�Դϴ�.");
				}
				
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				
			
				
				System.out.println("��ħ�� ���� ����");
				
				System.out.println("���� �����?");
				int hour = Integer.parseInt(reader.readLine());
				
//				if (hour < 8) {
//					System.out.println("��ħ���� �Դ´�.");
//				}
				
				
//				if(hour < 8) {
//					System.out.println("��ħ���� �Դ´�.");
//				} else {
//					System.out.println("���� ���� �Դ´�.");
//				}
//				
//				System.out.println();
				
				
				if (hour < 8) {
					System.out.println("��ħ���� �Դ´�.");
				} else if (hour <= 9) {
					System.out.println("�������� ����� ���.");
				} else {
					System.out.println("ȸ�翡 �̸� ��ȭ�� �Ѵ�.");
				}
				
				System.out.println("����ö�� Ÿ�� ����� �Ѵ�.");
				
			}//m1
			

		}

		/*

		K&R ��Ÿ��
		class {
			public static void m1() {	
				if (true) {		
				}	
			}
		}

		
		Allman ��Ÿ��
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

		