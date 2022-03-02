package chap04.book.example;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
		
		System.out.println("-------------reverse-------------");
		
		for (int i = 9; i > 1; i--) {
			System.out.println("*** " + i + "단 ***");
			for (int j = 9; j > 1; j--) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
	}
}
