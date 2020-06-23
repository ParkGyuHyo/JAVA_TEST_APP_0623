package java05;

import java.util.Scanner;

public class TestApp {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
		
		boolean flag = true;
		int menu = 0;

		while(flag) {			
			menu = console.selectMenu();
	
			switch(menu) {
				case 1:				
					console.inputScore();
					break;
					
				case 2:
					console.displayScore();
//					displayScore(list, 2);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
