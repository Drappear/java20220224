package chap07.lecture.p01inheritance;

public class App02 {
	public static void main(String[] args) {
		SuperClass1 sp1 = new SuperClass1();
		sp1.setField("필드 값");
		System.out.println(sp1.getField());
		sp1.someMethod();
		
		SubClass1 sb1 = new SubClass1();
		sb1.setField("서브 클래스 인스턴스 필드 값");
		System.out.println(sb1.getField());
		sb1.someMethod();
	}
}
