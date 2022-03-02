package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = {3, 1, 9, 0, 7};
		// arr1에 있는 모든 값을 더해서 출력
		int sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
		
		// arr1의 값 중 가장 큰 값을 출력
		int bigNum = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > bigNum) {
				bigNum = arr1[i];
			}
		}
		System.out.println("최대값 : " + bigNum);
		
		// arr1의 값 중 가장 작은 값을 출력
		int sNum = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < sNum) {
				sNum = arr1[i];
			}
		}
		System.out.println("최소값 : " + sNum);
	}
}
