package edu.java.file10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileMain10 {
	private static final String ANSI_FILE = "data/ansi.txt";
	private static final String UTF8_FILE = "data/UTF-8.txt";

	public static void main(String[] args) {
		// FileReader와 FileWriter의 단점은 인코딩 타입을 지정할 수 없기 때문에 실행 환경에 따라서 다른 결과를 줌.
		// InputStreamReader, OutputStreamReader를 사용하면 인코딩 타입을 지정할 수 있음.

		try (FileInputStream in = new FileInputStream(ANSI_FILE);
				InputStreamReader reader = new InputStreamReader(in, "EUC-KR")) {
			while (true) {
				int r = reader.read();
				if (r == -1) {
					break;
				}
				System.out.println(r + " : " + (char) r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-------");

		try (FileInputStream in = new FileInputStream(UTF8_FILE);
				InputStreamReader reader = new InputStreamReader(in, "UTF-8");
				BufferedReader br = new BufferedReader(reader);) {
			while (true) {
				int r = br.read(); // reader.read();
				if (r == -1) {
					break;
				}
				System.out.println(r + " : " + (char) r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
