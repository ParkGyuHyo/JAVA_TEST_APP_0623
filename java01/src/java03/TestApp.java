package java03;

import java.util.Scanner;

public class TestApp {
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Exam[] exams = new Exam[3];
		
		boolean flag = true;

		while(flag) {
			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					inputScore(exams);
					break;
					
				case 2:
					outputScore(exams);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	private static void outputScore(Exam[] exams) {
		//========== ���� ���
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������           ��");
		System.out.println("����������������������������������������");		
		
		for (int i=0; i<exams.length; i++) {
			System.out.printf("%d��° �л��� ������ ����մϴ�.\n", i+1);
			System.out.println("--------------------");
			
			Exam exam = exams[i];
			
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = kor + eng + math;
			
			double avg = (double)total / 3;
			
			System.out.printf(" ���� : %d\n", kor);
			System.out.printf(" ���� : %d\n", eng);
			System.out.printf(" ���� : %d\n", math);
			
			System.out.println("--------------------");
			System.out.printf(" ���� : %d\n",total);
			System.out.printf(" ��� : %.2f\n",avg);
			System.out.println("--------------------");
		}
		
	}

	private static void inputScore(Exam[] exams) {
		//========== ���� �Է�

		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�           ��");
		System.out.println("����������������������������������������");

		for (int i=0; i<3; i++) {
			int kor, eng, math;
			
			System.out.printf("%d��° �л��� ������ �Է��մϴ�.\n", i+1);
			System.out.println("--------------------");
			
			do {
				
				System.out.print("���� ������ �Է����ּ���: ");
				kor = in.nextInt();
				
				if (kor < 0 || 100 < kor)
					System.out.println("���� ������(0 ~ 100) ������ϴ�.");
				
			}while (kor < 0 || 100 < kor);	
			
			do {
						
				System.out.print("���� ������ �Է����ּ���: ");
				eng = in.nextInt();
				
				if (eng < 0 || 100 < eng)
					System.out.println("���� ������(0 ~ 100) ������ϴ�.");
				
			}while (eng < 0 || 100 < eng);
			
			do {
				
				System.out.print("���� ������ �Է����ּ���: ");
				math = in.nextInt();
				
				if (math < 0 || 100 < math)
					System.out.println("���� ������(0 ~ 100) ������ϴ�.");
				
			}while (math < 0 || 100 < math);
			
			Exam exam = new Exam();
			
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;
			
			exams[i] = exam;
			
			System.out.println("--------------------");
		}
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
