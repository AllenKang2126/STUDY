package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account ac1 = new Account(433150, 1_000);
		ac1.info();
		System.out.println();
		
		Account ac2 = new Account(431500, 1_000);
		ac2.info();

		// ac1에 10,000원 입금
		ac1.Deposit(10_000);
		ac1.info();
		// ac1에 3,000원 출금
		ac1.Withdraw(3_000);
		ac1.info();
		
		System.out.println();
		// ac1 에서 ac2로 5,000원 이체
		ac1.Transfer(5_000, ac2);
		ac1.info();
		ac2.info();
		
	}  // end main()

}  // end class()
