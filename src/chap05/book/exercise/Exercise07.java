package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		
		int[] array = {-1, -5, -3, -8, -2};
//		int max = Integer.MIN_VALUE;
		int max = array[0];
		
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > max) {
//				max = array[i];
//			}
//		}
		
		for (int item : array) {
			if (item > max) {
				max = item;
			}
		}
		
		System.out.println("max: " + max);
	}
}
