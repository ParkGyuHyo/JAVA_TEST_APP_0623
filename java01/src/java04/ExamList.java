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
			System.out.println("배열의 크기를 확인하세요.");
		} else {
			this.current = current;
		}
	}
	
	public int getCurrent() {
		return current;
	}
	
	void displayScore() {
		//========== 성적 출력
		displayScore(current);
	}
	
	void displayScore(int size) {
		//========== 성적 출력
		int total = 0;
		double avg = 0.0;
		
		System.out.println("┌──────────────────┐");
		System.out.println("│      성적출력           │");
		System.out.println("└──────────────────┘");		
		
		for (int i=0; i<size; i++) {
			System.out.printf("%d번째 학생의 성적을 출력합니다.\n", i+1);
			System.out.println("--------------------");
			
			Exam exam = exams[i];
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			total = exam.total();
			
			avg = exam.avg();
			
			System.out.printf(" 국어 : %d\n", kor);
			System.out.printf(" 영어 : %d\n", eng);
			System.out.printf(" 수어 : %d\n", math);
			
			System.out.println("--------------------");
			System.out.printf(" 총점 : %d\n",total);
			System.out.printf(" 평균 : %.2f\n",avg);
			System.out.println("--------------------");
		}
		
	}
	
	void inputScore() {
		//========== 성적 입력
		
		Scanner in = new Scanner(System.in);

		System.out.println("┌──────────────────┐");
		System.out.println("│      성적입력           │");
		System.out.println("└──────────────────┘");
		
		int kor, eng, math;
		
		do {
			
			System.out.print("국어 점수를 입력해주세요: ");
			kor = in.nextInt();
			
			if (kor < 0 || 100 < kor)
				System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
			
		}while (kor < 0 || 100 < kor);	
		
		do {
					
			System.out.print("영어 점수를 입력해주세요: ");
			eng = in.nextInt();
			
			if (eng < 0 || 100 < eng)
				System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
			
		}while (eng < 0 || 100 < eng);
		
		do {
			
			System.out.print("수학 점수를 입력해주세요: ");
			math = in.nextInt();
			
			if (math < 0 || 100 < math)
				System.out.println("성적 범위를(0 ~ 100) 벗어났습니다.");
			
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
