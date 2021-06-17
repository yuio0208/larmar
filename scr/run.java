package scr;

import java.io.IOException;
import java.util.Scanner;

public class run {

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int moneyKOR = 0;
		int inputChangeType = 0;
		inputclass inputClass = new inputclass(); // inputclass에서 객체를 가져오겠다

		do {

			moneyKOR = inputClass.inputFromConsoleWon(); // inputclass에서 입력했던 돈 moneyKOR
			inputChangeType = inputClass.inputFromConsoleType(); // 어떤 돈 환전할건지 inputclass에서 입력했던 type을 inputChangeType
			outfile runClass2 = new outfile();

			RunExchangeClass runClass = new RunExchangeClass(); // RunExchangeClass 클래스로 출력하겠다
			output runClass1 = new output();

			switch (inputChangeType) { // 입력했던 type을 case문으로 출력
			case 1:
				runClass.changeToUSD(moneyKOR); // 1을 입력했다면 두번째로 입력했던 돈을 output에서 만들어 뒀던 changeToUSD 함수에 넣어줌

				break;
			case 2:
				runClass.changeToEUR(moneyKOR); // 2를 입력했다면 유로로

				break;
			case 3:
				runClass.changeToJPY(moneyKOR); // 3을 입력했다면 엔화로

				break;

			}
			System.out.println("\nNext or please press 4 if you want to exit"); // 다 출력했다면 나갈건지 묻는 출력문 설정
		} while (inputChangeType != 4); // 4를 누르면 종료

	}
}
