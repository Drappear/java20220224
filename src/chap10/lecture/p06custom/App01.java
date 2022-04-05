package chap10.lecture.p06custom;

public class App01 {
	public static void main(String[] args) {
		try {
			method1(200);
		} catch (ValueOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void method1(int value) throws ValueOutOfBoundsException{
		if (value > 100) {
			throw new ValueOutOfBoundsException("value : " + value);
		}
		
		System.out.println("실행");
	}
	
}