package chap15.book.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");	// "Java"는 한번만 저장됨
		set.add("iBATIS");
		
		// 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> iterator = set.iterator();	// 반복자 얻기
		while(iterator.hasNext()) {					// 객체 수 만큼 루핑
			String element = iterator.next();		// 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		// 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		
		iterator = set.iterator();					// 반복자 얻기
		while(iterator.hasNext()) {					// 객체 수 만큼 루핑
			String element = iterator.next();		// 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
