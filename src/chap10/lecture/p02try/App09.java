package chap10.lecture.p02try;

public class App09 {
	// finally : 예외 발생여부 관계없이 항상 실해외는 코드 블럭
	public static void main(String[] args) {
		String s = null;
		
		try {
			System.out.println(s.length());
			
			System.out.println("try 블럭 실행");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} finally {
			// 마지막에 작성
			System.out.println("항상 실행되는 finally block");
		}
		
		System.out.println("프로그램 실행");
	}
}
