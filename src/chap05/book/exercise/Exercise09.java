package chap05.book.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				if (studentNum == 0) {
					System.out.print("학생 수를 입력해주세요 > ");
					studentNum = scanner.nextInt();
				}
				System.out.println("학생수 > " + studentNum);
				
			} else if(selectNo == 2) {
				scores = new int[studentNum];
				boolean inputGrade = true;
				while (inputGrade) {
					if(studentNum == 0) {
						System.out.println("학생 수가 0 입니다.");
						System.out.println("학생 수를 입력해주세요.");
						break;
					}
					
					for(int i = 0; i < studentNum; i++) {
						System.out.print((i+1) + "번 학생의 점수를 입력해주세요 > ");
						scores[i] = scanner.nextInt();
					}
					System.out.println("점수 입력완료");
					inputGrade = false;
				}
				
			} else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i+1) + "번 : " + scores[i]);
				}
			} else if(selectNo == 4) {
				int sum = scores[0];
				int max = scores[0];
				for (int i = 1; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)sum/studentNum);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
