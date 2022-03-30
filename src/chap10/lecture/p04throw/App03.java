package chap10.lecture.p04throw;

public class App03 {
	public static void main(String[] args) {
		method1();
		
		System.out.println("main");
	}

	private static void method1() {
		method2();
		
		System.out.println("method1");
	}

	private static void method2() {
		try {
			method3();	// Exception 발생 가능 코드
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("method2");
	}

	private static void method3() throws Exception {
		throw new Exception();		
	}
}
