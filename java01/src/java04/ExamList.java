package java04;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public ExamList() {
		this(3);
	}
	
	public ExamList(int size) {
		this(new Exam[size], 0);
	}
	
	public ExamList(Exam[] exams, int current) {
		this.exams = exams;
		this.current = current;
	}

	public void setCurrent(int current) {
		if (current > 3) {
			System.out.println("�迭�� ũ�⸦ Ȯ���ϼ���.");
		} else {
			this.current = current;
		}
	}
	
	public int getCurrent() {
		return current;
	}
	
	void displayScore() {
		//========== ���� ���
		displayScore(current);
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
			
			Exam exam = exams[i];
			
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
		
		Scanner in = new Scanner(System.in);

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
		
		Exam[] exams = this.exams;
		int size = current;
		
		if (exams.length == size) {
			Exam[] temp = new Exam[size+3];
			
			for (int i=0; i<size; i++) {
				temp[i] = exams[i];
			}
			
			this.exams = temp;
		}
		
		this.exams[current] = exam;
		current++;
		
		System.out.println("--------------------");
	}
}
