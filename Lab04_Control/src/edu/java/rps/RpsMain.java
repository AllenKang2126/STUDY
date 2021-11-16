package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

	public static void main(String[] args) {
		// 가위/바위/보 게임(Rock Paper Scissors)
		
		// 가위 = 1, 바위 = 2, 보 = 3으로 정의

		// 사용자가 가위/바위/보 중에 하나를 선택:
		// 	Scanner 사용해서 1, 2, 3 중에 하나를 입력 받고 저장함.
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 = 1, 바위 = 2, 보 = 3 중 하나를 입력하세요.");
		
		int user = sc.nextInt();
		sc.close();
		
		switch (user) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		default:
			System.out.println("보");
		}
				
		// 컴퓨터가 가위/바위/보 중에 하나를 선택:
		// 	Random 사용해서 1, 2, 3 중에 하나를 난수로 만들고 저장함.
		Random rand = new Random();
		int computer = rand.nextInt(3) + 1;
		
		switch (computer) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		default:
			System.out.println("보");
		}
		
		if ((user - computer == 1) || (user - computer == -2)) {
			System.out.println("이겼다!");
		} else if (user - computer == 0) {
			System.out.println("비겼다...");
		} else {
			System.out.println("졌다ㅠㅠ");
		}
		
		// 사용자와 컴퓨터 중 누가 이겼는 지 를 판단하고 그 결과를 출력.
		
		// 쌤 코드
		String userChoice = "";
		switch (user) {
		case 1:
			userChoice = "가위";
			break;
		case 2:
			userChoice = "바위";
			break;
		case 3:
			userChoice = "보";
			break;
		default:
			userChoice = "";
		}
		
		String comChoice;
		switch (computer ) {
		case 1:
			comChoice = "가위";
			break;
		case 2:
			comChoice = "바위";
			break;
		case 3:
			comChoice = "보";
			break;
		default:
			comChoice = "";
		}
		
		System.out.println("user:computer = " + userChoice + ":" + comChoice);
		
		
		/*if (user == 1 && computer ==1 ) {
			// TODO
		} else if (user == 1 && computer == 2) {
			System.out.println("비겼음");
		} else if (user == 1 && computer == 3) {
			System.out.println("컴 승");
		} else if (user == 2 && computer == 1) {
			System.out.println("유저 승");
		} else if (user == 2 && computer == 2) {
			
		} else if (user == 2 && computer == 3) {
			
		}  등등 9가지 경우의 수를 모두 표현 */
		
		/*
		 * if (user == 1) {  // user : 가위
			if (computer == 1) {  // computer : 가위
				System.out.println("Tie");
			} else if (computer == 2) {  // computer : 바위
				System.out.println("You lose");
			} else {  // computer : 보
				System.out.println("You win");
			}
		} else if (user == 2) {  // user : 바위
			if (computer == 1) {  // computer : 가위
				System.out.println("You win");
			} else if (computer == 2) {  // computer : 바위
				System.out.println("Tie");
			} else {  // computer : 보
				System.out.println("You lose");
			}
		} else if (user == 3) {  // user : 보
			if (computer == 1) {  // computer : 가위
				System.out.println("You lose");
			} else if (computer == 2) {  // computer : 바위
				System.out.println("You win");
			} else {  // computer : 보
				System.out.println("Tie");
			}
		}
		*/ 
		
		/*if (user == computer) {  // 비기는 경우 3가지
			System.out.println("Tie");
		} else if (user == 1) {  // user : 가위
			if (computer == 2) {  // computer : 바위
				System.out.println("You lose");
			} else {  // computer : 보
				System.out.println("You win");
			}
		} else if (user == 2) {  // user : 바위
			if (computer == 1) {  // computer : 가위
				System.out.println("You win");
			} else {  // computer : 보
				System.out.println("You lose");
			}
		} else if (user == 3) {  // user : 보
			if (computer == 1) {  // computer : 가위
				System.out.println("You lose");
			} else (computer == 2) {  // computer : 바위
				System.out.println("You win");
			}
		}*/
		
		int diff = user - computer;
		if (diff == 0) {  // 비기는 경우
			System.out.println("Tie");
		} else if (diff == 1 || diff == -2) {  // user 승리
			System.out.println("You win!!");
		} else {  // diff == 2 || diff == -1 : computer 승리
			System.out.println("You lose");
		}  // 주석을 통해서 생각을 전달하는 것도 중요!
			
		
	}  // end main

}
