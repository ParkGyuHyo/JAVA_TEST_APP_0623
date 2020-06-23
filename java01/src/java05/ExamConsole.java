package java05;

import java.util.Scanner;

public class ExamConsole {
	
	static Scanner in = new Scanner(System.in);
	
	ExamList list = new ExamList();
	
	public int selectMenu() {
		//========== �޴� �Է�
		System.out.println("����������������������������������������");
		System.out.println("��      �޴��Է�           ��");
		System.out.println("����������������������������������������");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		
		System.out.print("���� : ");
		
		int menu = in.nextInt();
		
		return menu;
	}
	
	void displayScore() {
		//========== ���� ���
		displayScore(list.current);
	}
	
	void displayScore(int size) {
		//========== ���� ���
		int total = 0;
		double avg = 0.0;
		
		System.out.println("����������������������������������������");
		System.out.println("��      �������           ��");
		System.out.println("����������������������������������������");		
		
		for (int i=0; i<size; i++) {
			System.out.printf("%d��° �л��� ������ ����մϴ�.\n", i+1);
			System.out.println("--------------------");
			
			Exam exam = list.get(i); //exams[i];
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			total = exam.total();
			
			avg = exam.avg();
			
			System.out.printf(" ���� : %d\n", kor);
			System.out.printf(" ���� : %d\n", eng);
			System.out.printf(" ���� : %d\n", math);
			
			System.out.println("--------------------");
			System.out.printf(" ���� : %d\n",total);
			System.out.printf(" ��� : %.2f\n",avg);
			System.out.println("--------------------");
		}
		
	}
	
	void inputScore() {
		//========== ���� �Է�

		System.out.println("����������������������������������������");
		System.out.println("��      �����Է�           ��");
		System.out.println("����������������������������������������");
		
		int kor, eng, math;
		
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
		
		/*
		Exam exam = new Exam();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		*/
		
		Exam exam = new Exam(kor, eng, math);
		
		list.add(exam);
	}
}