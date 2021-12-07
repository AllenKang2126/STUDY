package edu.java.thread02;

/*
 * 쓰레드 생성 방법 2 :
 * 1) Runnable 인터페이스를 구현하는 클래스를 정의
 * 2) Runnable 구현 클래스에서 run()메서드를 override -> 쓰레드가 할 일을 정의
 * 3) Runnable 구현 클래스의 객체 생성
 * 4) 3)에서 생성된 Runnable 객체를 파라미터에 전달해서 Thread 클래스의 인스턴스를 생성
 * 5) 4)에서 정의된 Thread 상속 클래스의 starts() 메서드를 호출 -> 쓰레드 시작
 * 
 */
public class ThreadMain02 {

	public static void main(String[] args) {
		// 1)Runnable 구현 클래스 정의 - local inner class
		class MyRunnable implements Runnable {
			private String name;

			public MyRunnable(String name) {
				this.name = name;
			}

			// 2) run() 메서드 override
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					System.out.println(i + "안녕하세요, " + name);
					try {
						// MyRunnable 클래스는 Thread를 상속받는 클래스가 아니기 때문에 Thread의 메서드들을 상속받지 못함.
						// 대신에, 클래스 이름으로 접근해서, Thread 클래스에서 static으로 선언된 sleep 메서드 호출
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			} // end run()
		} // end class MyRuunable
		
		// 3) Runnable 객체 생성
		Runnable process1 = new MyRunnable("Java!");
		Runnable process2 = new MyRunnable("Swing...");
		
		// 4) Thread 객체 생성 : new Thread(Runnable r) 생성자 사용
		Thread th1 = new Thread(process1);
		Thread th2 = new Thread(process2);
		
		// 5) Thread 시작
		th1.start();
		th2.start();
		
		// th1, th2이 끝날 때까지 main 메서드 대기
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n========== main thread 종료 ==========");
		
	} // end main()

} // end class ThreadMain02
