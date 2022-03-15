package chap07.book.exercise.p6;

public class Child {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
