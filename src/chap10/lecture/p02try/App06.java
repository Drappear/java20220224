package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		
		try {
			int r = arr1[0] / arr1[1];
			
			System.out.println(r);
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}
		
		
		System.out.println("프로그램 실행");
	}
}
