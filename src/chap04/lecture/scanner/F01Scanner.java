package chap04.lecture.scanner;

import java.util.Scanner;

public class F01Scanner {
	public static void main(String[] args) {
		// 키보드 입력 준비
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		// 키보드로 입력한 값을 enter입력 이전까지의 문자열로 리턴
		scanner.nextLine();
		
		// 스캐너 닫기
		scanner.close();
	}
}
