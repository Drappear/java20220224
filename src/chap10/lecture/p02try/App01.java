package chap10.lecture.p02try;

public class App01 {
	public static void main(String[] args) {
		String s = "java";
		String t = null;
		
		System.out.println(s.length());
		
		try {
			// Exception이 발생할 수 있는 코드 블럭
			System.out.println(t.length());		
			
			System.out.println("try 블럭 실행"); 
		} catch (NullPointerException e) {
			// Exception이 발생했을 때 실행하는 코드 블럭
			System.out.println("NullPointerException");
		}
		
		System.out.println("프로그램 실행");
	}
}
