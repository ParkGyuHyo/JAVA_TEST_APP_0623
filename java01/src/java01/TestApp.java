package java01;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		int kor1;
		int kor2;
		int kor3;
		int total;
		int menu;
		double avg;
		boolean flag = true;
		
		Scanner in = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(flag) {
			//========== ���� �Է�
			System.out.println("����������������������������������������");
			System.out.println("��       �޴�              ��");
			System.out.println("����������������������������������������");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ����");
			
			System.out.print("���� : ");
			menu = in.nextInt();
			
			switch(menu) {
				case 1:
					//========== ���� �Է�
					System.out.println("����������������������������������������");
					System.out.println("��      �����Է�           ��");
					System.out.println("����������������������������������������");		
					
					do {
						
						System.out.print("����1 ������ �Է����ּ���: ");
						kor1 = in.nextInt();
						
						if (kor1 < 0 || 100 < kor1)
							System.out.println("���� ������(0 ~ 100) ������ϴ�.");
						
					}while (kor1 < 0 || 100 < kor1);
					
					do {
						
						System.out.print("����2 ������ �Է����ּ���: ");
						kor2 = in.nextInt();
						
						if (kor2 < 0 || 100 < kor2)
							System.out.println("���� ������(0 ~ 100) ������ϴ�.");
						
					}while (kor2 < 0 || 100 < kor2);
					
					do {
						
						System.out.print("����3 ������ �Է����ּ���: ");
						kor3 = in.nextInt();
						
						if (kor3 < 0 || 100 < kor3)
							System.out.println("���� ������(0 ~ 100) ������ϴ�.");
						
					}while (kor3 < 0 || 100 < kor3);
					
					System.out.println("--------------------");
					
					break;
				case 2:			
					//========== ���� ���
					total = kor1 + kor2 + kor3;
					avg = total/3;
					
					System.out.println("����������������������������������������");
					System.out.println("��      �������           ��");
					System.out.println("����������������������������������������");		
					
					for (int i = 1; i <= 3; i++) {
						System.out.printf(" ����%d : %d\n", i, kor1);
					}
					
					System.out.println("--------------------");
					System.out.printf(" ���� : %d\n",total);
					System.out.printf(" ��� : %6.2f\n",avg);
				
					break;
				case 3:
					flag = false;
					
					break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
