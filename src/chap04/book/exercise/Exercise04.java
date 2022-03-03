package chap04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		boolean dice = true;
		
		while (dice) {			
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			
			if ((num1 + num2) == 5) {
				dice = false;
			}
		}
		
//		while (true) {			
//			int num1 = (int)(Math.random()*6)+1;
//			int num2 = (int)(Math.random()*6)+1;
//			System.out.println("(" + num1 + ", " + num2 + ")");
//			
//			if ((num1 + num2) == 5) {
//				return;
//			}
//		}
	}
}
