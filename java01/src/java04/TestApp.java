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
		System.out.println("���α׷��� �����մϴ�.");
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
