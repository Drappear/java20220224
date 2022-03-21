package chap10.lecture.p02try;

public class App10 {
	public static void main(String[] args) {
		// return 명령문 실행되어도 finally block 실행
		
		 String s = "java";
		 
		 try {
			System.out.println(s.length());
			
			System.out.println("try block 실행");
			
			return;
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} finally {
			System.out.println("return 실행 되어도 무조건 실행");
		}
		 
		 System.out.println("프로그램 실행");
	}
}
