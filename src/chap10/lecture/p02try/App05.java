package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		
		try {
			int r = arr1[0] / arr1[1];
			
			System.out.println(r);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}
		// 여러개의 catch 블럭 작성시 하위타입보다 상위타입을 아래에 작성
		
		System.out.println("프로그램 실행");
	}
}
