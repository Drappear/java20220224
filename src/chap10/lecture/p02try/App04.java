package chap10.lecture.p02try;

public class App04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		
		try {
			int r = arr1[0] / arr1[1];
			
			System.out.println(r);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("프로그램 실행");
	}
}
