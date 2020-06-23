package java02;

import java.util.Scanner;

public class TestApp {
	
//	static int kor1;
//	static int kor2;
//	static int kor3;
//	static int total;
//	static double avg;
	
	
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] kors = new int[3];
		boolean flag = true;

		while(flag) {
			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					inputScore(kors);
					break;
					
				case 2:
					outputScore(kors);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	private static void outputScore(int[] kors) {
		//========== ���� ���
		int total = 0;
		
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = (double)total / 3;
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������           ��");
		System.out.println("����������������������������������������");		
		
		for (int i = 0; i < 3; i++) {
			System.out.printf(" ����%d : %d\n", i+1, kors[i]);
		}
		
		System.out.println("--------------------");
		System.out.printf(" ���� : %d\n",total);
		System.out.printf(" ��� : %6.2f\n",avg);
		
	}

	private static void inputScore(int[] kors) {
		//========== ���� �Է�
		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�           ��");
		System.out.println("����������������������������������������");
		
		 for (int i=0; i<kors.length; i++) {
			do {
				
				System.out.printf("����%d ������ �Է����ּ���: ", i+1);
				kors[i] = in.nextInt();
				
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("���� ������(0 ~ 100) ������ϴ�.");
				
			}while (kors[i] < 0 || 100 < kors[i]);
		 }
		 
		System.out.println("--------------------");
	}

	private static int selectMenu() {
		//========== �޴� �Է�
		System.out.println("����������������������������������������");
		System.out.println("��      �޴��Է�           ��");
		System.out.println("����������������������������������������");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		
		System.out.print("���� : ");
		
		menu = in.nextInt();
		
		return menu;
	}
}
