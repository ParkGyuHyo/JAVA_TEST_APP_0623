package java05;

public class ExamList {
	Exam[] exams;
	int current;
	
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
	
	public Exam get(int i) {
		
		return this.exams[i];
	}


	public void add(Exam exam) {
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
