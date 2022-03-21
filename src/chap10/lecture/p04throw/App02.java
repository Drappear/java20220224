package chap10.lecture.p04throw;

public class App02 {
	public static void main(String[] args) {
		method1();	// NullPointerException 발생가능 코드
		
		System.out.println("실행흐름 main");
	}
	
	private static void method1() {
		method2();	// NullPointerException 발생가능 코드
		System.out.println("method1");
	}

	private static void method2() {
		method3();	// NullPointerException 발생가능 코드
		System.out.println("method2");
	}

	private static void method3() {
		throw new NullPointerException();		
	}
}
