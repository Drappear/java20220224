package chap10.lecture.p02try;

public class App08 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		
		try {
			int r = arr1[0] / arr1[1];
			
			System.out.println(r);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Arithmetic or NullPointer Exception");
			System.out.println(e.getMessage());
			System.out.println(e instanceof ArithmeticException);
			System.out.println(e instanceof NullPointerException);
			e.printStackTrace();	// Exception 객체의 타입, 메세지, 발생된 코드 
									// catch 블럭에 꼭 작성
		}
		
		
		System.out.println("프로그램 실행");
	}
}
