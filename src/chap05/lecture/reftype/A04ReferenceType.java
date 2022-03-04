package chap05.lecture.reftype;

public class A04ReferenceType {
	public static void main(String[] args) {
		int[] arr1; 
		arr1 = new int[] {9, 5, 1, 2, 0};
		
		int[] arr2;
		arr2 = arr1;
		
		System.out.println(arr1 == arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		arr1[0] = 7;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr2[i]);
		}
		
		arr2[0] = 99;
		
		System.out.println(arr1[0]);
	}
}