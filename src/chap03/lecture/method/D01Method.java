package chap03.lecture.method;

public class D01Method {
	public static void main(String[] args) {
		System.out.println("명령문 1");
		System.out.println("명령문 2");
		mymethod1(); // 메소드 호출
		
		System.out.println("명령문 3");
	}
	public static void mymethod1() {
		System.out.println("마이 메소드1");
		System.out.println("마이 메소드2");
	}
}
