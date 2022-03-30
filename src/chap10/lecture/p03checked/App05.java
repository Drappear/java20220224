package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {
		// 하나의 try block 사용
		// 여러 catch block 사용
		// 컴파일 오류 해결
		
		try {
			FileReader fr = new FileReader("");
			fr.read();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
