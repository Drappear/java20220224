package chap03.book.example;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		long n1 = 1000000;
		long n2 = 1000000;
		long n3 = n1 * n2;
		System.out.println(n3);
		
	}
}
