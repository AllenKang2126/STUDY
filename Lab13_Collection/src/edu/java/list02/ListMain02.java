package edu.java.list02;

import java.util.LinkedList;
import java.util.List;

public class ListMain02 {

	public static void main(String[] args) {
		// 정수(Integer)를 저장할 수 있는 LinkedList를 생성
		// 다형성, 생성자 호출에서는 원소 타입 생략
		List<Integer> list = new LinkedList<>();
		System.out.println("갯수 : " + list.size());
		// 리스트에 순서대로 100, 200, 300, 400, 500을 저장 - add
		for(int i =0; i < 5; i++) {
			list.add((i + 1) * 100);
		}
		
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		list.add(400);
//		list.add(500);
		System.out.println("갯수 : " + list.size());
		System.out.print(list.get(0));
		System.out.println();
		// 향상된 for 구문을 사용해서 리스트 내용 출력
		for(int i : list) {
			System.out.print(i + ", ");
		}
		System.out.println();
		// 인덱스 0 위치의 원소를 123으로 변경 후 리스트 출력. - set
		list.set(0, 123);
		System.out.println(list.get(0));
		System.out.println(list);
		// 인덱스 1 위치의 원소를 삭제하고 리스트를 출력 - remove
		list.remove(1);
		System.out.println(list.get(1));
		System.out.println(list);
		// 123을 찾아서 (값으로) 삭제하고 리스트를 출력 - remove, Integer 클래스 사용
//		Integer value = 123;
//		list.remove(value);  <- 다른 학생이 질문한 코드 
		
		list.remove(Integer.valueOf(123));  // Integer.valueOf(int) : int --> Integer 변환
		System.out.println(list.get(0));
		System.out.println(list);
	}

}
