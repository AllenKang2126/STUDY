package edu.java.file08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class FileMain08 {
	private static final String FILE_NAME = "data/students.dat";

	public static void main(String[] args) {
		try (FileOutputStream out = new FileOutputStream(FILE_NAME);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oos = new ObjectOutputStream(bout);) {

			// TODO 1: ArrayList<Student>를 생성
			ArrayList<Student> students = new ArrayList<>();
			Random rand = new Random();
			// ArrayList에 Student 객체 5개를 추가
			for (int i = 0; i < 5; i++) {
				int x = rand.nextInt(100);
				int y = rand.nextInt(100);
				int z = rand.nextInt(100);
				Score sc = new Score(x + 1, y + 1, z + 1);
				Student s = new Student(i + 1, "Student_" + (i + 1), sc);
				students.add(s);
			}
			// ArrayList를 파일에 write (Serialize)
			long start = System.currentTimeMillis();
			oos.writeObject(students);
			long end = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (end - start) + "ms");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// TODO 2 : 1번에서 저장된 파일에서 객체를 read
		try (FileInputStream in = new FileInputStream("data/students.dat");
				BufferedInputStream bin = new BufferedInputStream(in);
				ObjectInputStream ois = new ObjectInputStream(bin);) {
			
			long start = System.currentTimeMillis();
			Object obj = ois.readObject();
			long end = System.currentTimeMillis();
			System.out.println("경과 시간 : " + (end - start) + "ms");

			// 객체를 ArrayList로 타입 변환
			if(obj instanceof ArrayList<?>) {
				ArrayList<Student> students = (ArrayList<Student>)obj;
				// ArrayList에 저장된 원소들을 모두 출력.
				for(int i = 0; i < students.size(); i++) {
					System.out.println(students.get(i));
				}

			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}  // end main

}  // end class
