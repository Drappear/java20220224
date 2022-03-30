package chap10.lecture.p04throw;

public class App05 {
	public static void main(String[] args) throws Exception {
		method1();
		
		System.out.println("main");
	}

	private static void method1() throws Exception {
		method2();
		
		System.out.println("method1");
	}

	private static void method2() throws Exception {
		method3();
		
		System.out.println("method2");
	}

	private static void method3() throws Exception {
		throw new Exception();
	}
}
