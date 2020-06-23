package java04;

import java.util.Scanner;

public class TestApp {
	
	static int menu;
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		ExamList list = new ExamList();
		
		boolean flag = true;

		while(flag) {			
			menu = selectMenu();
	
			switch(menu) {
				case 1:				
					list.inputScore();
					break;
					
				case 2:
					list.displayScore();
//					displayScore(list, 2);
					break;
					
				case 3:
					flag = false;
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private static int selectMenu() {
		//========== 메뉴 입력
		System.out.println("┌──────────────────┐");
		System.out.println("│      메뉴입력           │");
		System.out.println("└──────────────────┘");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		
		System.out.print("선택 : ");
		
		menu = in.nextInt();
		
		return menu;
	}
}
