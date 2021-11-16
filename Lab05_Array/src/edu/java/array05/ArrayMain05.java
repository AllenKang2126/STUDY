package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		// 2차원 배열 연습
		String[][] groups = {
				{"RM", "진", "슈가", "제이홉", "지민", "뷔", "정국"},
				{"민영", "유정", "은지", "유나"}
		};
		
		System.out.println(groups);  // [[String: 문자열들의 2차원 배열
		System.out.println(groups[0]);  // [Stinrg: 문자열들의 1차원 배열
		System.out.println(groups.length);
		System.out.println(groups[0].length);  // BTS 멤버 수
		System.out.println(groups[1].length);  // bravegirls 멤버 수
		
		// for를 사용해서 groups의 내용 출력.
		for (int i = 0; i < groups.length; i++) {
			for (int j = 0; j < groups[i].length; j++) {
				System.out.print(groups[i][j] + " ");
			}
			System.out.println();
		}
		// 향상된 for를 사용해서 groups의 내용 출력.
		for (String[] numb: groups) {
			for (String x : numb) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
