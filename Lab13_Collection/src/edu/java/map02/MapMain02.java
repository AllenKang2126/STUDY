package edu.java.map02;

import java.util.Set;
import java.util.TreeMap;

public class MapMain02 {

	public static void main(String[] args) {
		// Key(String)-Value(Integer) 타입의 TreeMap을 생성
		TreeMap<String, Integer> menu = new TreeMap<>();
		
		// 데이터 추가 : put(key, value)
		menu.put("콩국수", 5000);
		menu.put("사골곰탕", 10000);
		menu.put("만두국", 7000);
		
		Set<String> kset1 = menu.keySet();  // (오름차순 정렬된) key들의 집합
		System.out.println(kset1);
		for(String k : kset1) {
			// 데이터 읽기 : get(key)
			System.out.println("메뉴 : " + k + ", 가격 : " + menu.get(k));
		}
		
		Set<String> kset2 = menu.descendingKeySet();
		System.out.println(kset2);
		for(String k : kset2) {
			System.out.println(k + " : " + menu.get(k));
		}
		
	}

}
