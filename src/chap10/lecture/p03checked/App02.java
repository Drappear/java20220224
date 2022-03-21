package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";
		
		int i = Integer.parseInt(s);	// NumberFormatException 발생가능
										// NumberFormatException은 RuntimeException(unchecked Exception)
										// 컴파일러가 검사하지 않음
				
		
		try {
			FileReader fr = new FileReader("");
			// FileNotFoundException 발생 가능
			// FileNotFoundException은 RuntimeException을 상속받지 않음(check exception)
			// 컴파일러가 검사			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
