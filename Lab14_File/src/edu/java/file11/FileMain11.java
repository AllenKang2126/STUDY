package edu.java.file11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileMain11 {

	public static void main(String[] args) {
		// Writer 객체들을 사용한 파일 쓰기
		// OutputStreamWriter ==> FileOutputStream ==> File
		try (FileOutputStream out = new FileOutputStream("data/writer_test.txt");
				OutputStreamWriter writer = new OutputStreamWriter(out, "UTF-8");
				BufferedWriter bw = new BufferedWriter(writer);) {
			bw.write("hello, Java!");
			bw.newLine(); // 줄 바꿈
			bw.write("안녕, 자바...");
			bw.newLine(); // 줄 바꿈
			bw.write("123 456 789 0");
			bw.newLine();

			System.out.println("파일 작성 쇙공");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 위에서 작성된 파일을 읽기
		// BufferedReader <== InputStreamReader <== FileInputStream <== File
		// BufferedReader 클래스의 ReadLine() 메서드를 사용해서 한줄씩 읽어보세요...
		try (FileInputStream in = new FileInputStream("data/writer_test.txt");
				InputStreamReader reader = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(reader);) {
			while(true)	{
				String r = br.readLine();
				if (r == null) {
					break;
				}
				System.out.println(r);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end main

} // end class
