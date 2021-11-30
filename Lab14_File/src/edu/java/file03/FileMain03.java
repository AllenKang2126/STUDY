package edu.java.file03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain03 {

	public static void main(String[] args) {
		// 크기(25MB)가 큰 파일 복사 시간 비교
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("data/ratings.dat");
			out = new FileOutputStream("data/ratings_copy2.data");
			
			long startTime = System.currentTimeMillis();  // 시스템의 현재 시간을 ms 단위로 리턴
			
			while (true) {
//				int result = in.read();  //(1) 파일에서 1바이트씩 읽기
				
				// (2) byte 배열을 사용한 읽기/쓰기
				byte[] buffer = new byte[4096];  // (2) 1,024 bytes = 1 Kb만큼씩 읽기 위한 배열
				int result = in.read(buffer);  // (2) 파일에서 (최대) 1Kb씩 읽기
				
				if(result == -1) {  // 파일 끝(EOF : End-of-File)
					break;
				}
//				out.write(result);  // (1) 1바이트 읽은 내용을 파일에 쓰기
				out.write(buffer, 0, result);  // (2)
			}
			
			long endTime = System.currentTimeMillis();
			
			long elapsedTime = endTime - startTime;  // 경과 시간(파일 복사하는 데 걸린 시간)
			System.out.println("경과 시간 : " + elapsedTime + "ms");
			// -> (1) 1 byte 읽기/쓰기 경과시간 : 약 300초
			// -> (2) 1024 byte 읽기/쓰기 경과시간 : 약 0.3초
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
