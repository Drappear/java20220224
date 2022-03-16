package chap07.lecture.p05promotion;

public class App01 {
	public static void main(String[] args) {
		SubClass1 sb1 = new SubClass1();
		SuperClass1 sp1 = sb1;	// 자동 타입변환
		
		System.out.println(sb1 == sp1);
		
		SuperClass1 sp2 = new SubClass1();
	}
}
