package scr;

import java.io.IOException;
import java.util.Scanner;

public class output {

	public void changeToUSD(int b) throws IOException { // changeToUSD라는 함수 설정 - 환전할 USD 돈
		outfile outfile = new outfile();
		String str = "";
		double USD = 1134.4; // USD 환율 설정
		double num = b / USD; // 인수를 넣으면 USD로 나눠서 환율 계산

		int outputUSD = (int) (num * 100) / 100; // 총 환전되는 총 액수
		int outputUSD100 = (int) ((num * 100) / 100) / 100; // 100달러 몇장이 나오는지 100으로 나눈 몫 구함
		int outputUSD50 = (int) (((num * 100) / 100) % 100) / 50; // 50달러 몇장이 나오는지 100으로 나눴던 나머지를 50으로 나눈 몫 구함
		int outputUSD10 = (int) ((((num * 100) / 100) % 100) % 50) / 10; // 그외 10달러
		int outputUSD5 = (int) (((((num * 100) / 100) % 100) % 50) % 10) / 5; // 5달러
		int outputUSD1 = (int) ((((((num * 100) / 100) % 100) % 50) % 10) % 5) / 1; // 1달러까지 구함

		System.out.println("원화 입력 : " + b); // 얼마 환전할건지 출력
		System.out.println("1: USD");
		System.out.println("환전결과 : " + outputUSD + "달러"); // outputUSD에 저장된 환전되는 총 액수 출력
		System.out.println("100달러 : " + outputUSD100 + "장"); // 환전한 돈 중 100달러 몇장이 나오는지 출력
		System.out.println("50달러 : " + outputUSD50 + "장"); // 100달러를 제외한 환전한 돈중 50달러 몇장이 나오는지 출력
		System.out.println("10달러 : " + outputUSD10 + "장"); // 남은 돈중 10달러
		System.out.println("5달러 : " + outputUSD5 + "장"); // 5달러
		System.out.println("1달러 : " + outputUSD1 + "장\n"); // 1달러 얼마 나오는지 출력

		str += "  " + b + "\t\t" + "  1\t   " + (int) (b - (outputUSD * USD)) + "\t\t  " + convert.BALANCE_USD + "\n";
		outfile.outfile1(str);

	}

	public void change_USD(int b) { // change_USD 함수 설정 - USD의 잔돈

		double USD = 1134.4; // USD 환율 설정
		double num = b / USD; // 인수를 넣으면 USD로 나눠서 환율 계산
		int outputUSD = (int) (num * 100) / 100; // 총 환전되는 총 액수

		int changeUSD = (int) (b - (outputUSD * USD)); // changeUSD가 USD잔돈인데 총 환전할 돈 b에서 (총달러 * 환율) 빼주면 잔돈(한화)이됨
		int changeUSD500 = (int) ((b - (outputUSD * USD))) / 500; // 그걸 500으로 나눠주면 500원이 몇개 잔돈으로 나오는지 설정됨
		int changeUSD100 = (int) ((b - ((outputUSD * USD))) % 500) / 100; // 500으로 나눠주고 남은 돈을 100으로 나눠주면 100원 잔돈이 몇개나오는지
																			// 설정됨
		int changeUSD50 = (int) ((b - (((outputUSD * USD))) % 500) % 100) / 50; // 50원
		int changeUSD10 = (int) ((b - ((((outputUSD * USD))) % 500) % 100) % 50) / 10; // 10원
		int changeUSD5 = (int) ((b - (((((outputUSD * USD))) % 500) % 100) % 50) % 10) / 5; // 5원
		int changeUSD1 = (int) ((b - ((((((outputUSD * USD))) % 500) % 100) % 50) % 10) % 5) / 1; // 1원까지 잔돈 설정

		System.out.println("거스름돈 : " + changeUSD + "원"); // 총 잔돈 출력
		System.out.println("500원 : " + changeUSD500 + "개"); // 500원이 잔돈중에 몇개 나오는지 출력
		System.out.println("100원 : " + changeUSD100 + "개"); // 500원으로 나눠주고 남은 잔돈중에 100원이 몇개 나오는지 출력
		System.out.println("50원 : " + changeUSD50 + "개"); // 그렇게 50원
		System.out.println("10원 : " + changeUSD10 + "개"); // 10원
		System.out.println("5원 : " + changeUSD5 + "개"); // 5원
		System.out.println("1원 : " + changeUSD1 + "개"); // 1원이 몇개씩 나오는지 다 출력
	}

	public void changeToEUR(int b) throws IOException {
		outfile outfile = new outfile();
		String str = "";
		double EUR = 1333.13;
		double num1 = b / EUR;

		int outputEUR = (int) (num1 * 100) / 100;
		int outputEUR500 = (int) ((num1 * 100) / 100) / 500;
		int outputEUR200 = (int) (((num1 * 100) / 100) % 500) / 200;
		int outputEUR100 = (int) ((((num1 * 100) / 100) % 500) % 200) / 100;
		int outputEUR50 = (int) (((((num1 * 100) / 100) % 500) % 200) % 100) / 50;
		int outputEUR20 = (int) ((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) / 20;
		int outputEUR10 = (int) (((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) % 20) / 10;
		int outputEUR5 = (int) ((((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) % 20) % 10) / 5;
		int outputEUR2 = (int) (((((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) % 20) % 10) % 5) / 2;
		int outputEUR1 = (int) ((((((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) % 20) % 10) % 5) % 2) / 1;

		System.out.println("원화 입력 : " + b);
		System.out.println("2: EUR");
		System.out.println("환전결과 : " + outputEUR + "유로");

		System.out.println("500유로 : " + outputEUR500 + "장");
		System.out.println("200유로 : " + outputEUR200 + "장");
		System.out.println("100유로 : " + outputEUR100 + "장");
		System.out.println("50유로 : " + outputEUR50 + "장");
		System.out.println("20유로 : " + outputEUR20 + "장");
		System.out.println("10유로 : " + outputEUR10 + "장");
		System.out.println("5유로 : " + outputEUR5 + "장");
		System.out.println("2유로 : " + outputEUR2 + "개");
		System.out.println("1유로 : " + outputEUR1 + "개\n");

		str += "  " + b + "\t\t" + "  2\t   " + (int) (b - (outputEUR * EUR)) + "\t\t  " + convert.BALANCE_EUR + "\n";
		outfile.outfile1(str);

	}

	public void change_EUR(int b) {
		double EUR = 1333.13;
		double num1 = b / EUR;
		int outputEUR = (int) (num1 * 100) / 100;

		int changeEUR = (int) (b - outputEUR * EUR);
		int changeEUR500 = (int) (b - (outputEUR * EUR)) / 500;
		int changeEUR100 = (int) ((b - (outputEUR * EUR)) % 500) / 100;
		int changeEUR50 = (int) (((b - (outputEUR * EUR)) % 500) % 100) / 50;
		int changeEUR10 = (int) ((((b - (outputEUR * EUR)) % 500) % 100) % 50) / 10;
		int changeEUR5 = (int) (((((b - (outputEUR * EUR)) % 500) % 100) % 50) % 10) / 5;
		int changeEUR1 = (int) ((((((b - (outputEUR * EUR)) % 500) % 100) % 50) % 10) % 5) / 1;

		System.out.println("거스름돈 : " + changeEUR + "원");
		System.out.println("500원 : " + changeEUR500 + "개");
		System.out.println("100원 : " + changeEUR100 + "개");
		System.out.println("50원 : " + changeEUR50 + "개");
		System.out.println("10원 : " + changeEUR10 + "개");
		System.out.println("5원 : " + changeEUR5 + "개");
		System.out.println("1원 : " + changeEUR1 + "개");
	}

	public void changeToJPY(int b) throws IOException {
		outfile outfile = new outfile();
		String str = "";
		double JPY = 10.30;
		double num2 = b / JPY;

		int outputJPY = (int) (num2 * 100) / 100;
		int outputJPY10000 = (int) ((num2 * 100) / 100) / 10000;
		int outputJPY5000 = (int) (((num2 * 100) / 100) % 10000) / 5000;
		int outputJPY2000 = (int) ((((num2 * 100) / 100) % 10000) % 5000) / 2000;
		int outputJPY1000 = (int) (((((num2 * 100) / 100) % 10000) % 5000) % 2000) / 1000;
		int outputJPY500 = (int) ((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) / 500;
		int outputJPY100 = (int) (((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) / 100;
		int outputJPY50 = (int) ((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) / 50;
		int outputJPY10 = (int) (((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) % 50) / 10;
		int outputJPY5 = (int) ((((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) % 50) % 10)
				/ 5;
		int outputJPY1 = (int) (((((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) % 50) % 10)
				% 5) / 1;

		System.out.println("원화 입력 : " + b);
		System.out.println("3: JPY");
		System.out.println("환전결과 : " + outputJPY + "엔");

		System.out.println("10000엔: " + outputJPY10000 + "장");
		System.out.println("5000엔: " + outputJPY5000 + "장");
		System.out.println("2000엔 : " + outputJPY2000 + "장");
		System.out.println("1000엔 : " + outputJPY1000 + "장");

		System.out.println("500엔 : " + outputJPY500 + "개");
		System.out.println("100엔 : " + outputJPY100 + "개");
		System.out.println("50엔 : " + outputJPY50 + "개");
		System.out.println("10엔 : " + outputJPY10 + "개");
		System.out.println("5엔 : " + outputJPY5 + "개");
		System.out.println("1엔 : " + outputJPY1 + "개\n");

		str += "  " + b + "\t\t" + "  3\t   " + (int) (b - (outputJPY * JPY)) + "\t\t  " + convert.BALANCE_JPY + "\n";
		outfile.outfile1(str);

	}

	public void change_JPY(int b) {
		double JPY = 10.30;
		double num2 = b / JPY;
		int outputJPY = (int) (num2 * 100) / 100;

		int changeJPY = (int) (b - (outputJPY * JPY));
		int changeJPY500 = (int) ((b - (outputJPY * JPY))) / 500;
		int changeJPY100 = (int) ((b - ((outputJPY * JPY))) % 500) / 100;
		int changeJPY50 = (int) ((b - (((outputJPY * JPY))) % 500) % 100) / 50;
		int changeJPY10 = (int) ((b - ((((outputJPY * JPY))) % 500) % 100) % 50) / 10;
		int changeJPY5 = (int) ((b - (((((outputJPY * JPY))) % 500) % 100) % 50) % 10) / 5;
		int changeJPY1 = (int) ((b - ((((((outputJPY * JPY))) % 500) % 100) % 50) % 10) % 5) / 1;

		System.out.println("거스름돈 : " + changeJPY + "원");
		System.out.println("500원 : " + changeJPY500 + "개");
		System.out.println("100원 : " + changeJPY100 + "개");
		System.out.println("50원 : " + changeJPY50 + "개");
		System.out.println("10원 : " + changeJPY10 + "개");
		System.out.println("5원 : " + changeJPY5 + "개");
		System.out.println("1원 : " + changeJPY1 + "개");

	}

	public void printErrorMessage(int errorCode) { // printErrorMessage로 함수 설정
		switch (errorCode) {
		case convert.ERR_BALANCE_USD:
			System.out.print("달러 "); //
			break;
		case convert.ERR_BALANCE_EUR:
			System.out.print("유로 ");
			break;
		case convert.ERR_BALANCE_JPY:
			System.out.print("엔화 ");
			break;
		}
		System.out.println("보유 잔액이 부족합니다."); // 출력문 설정

	}

	public void printBalanceUSD(int moneyKOR) {
		convert.BALANCE_USD = convert.BALANCE_USD - moneyKOR; // USD 보유자산 누적해서 빼지게 설정

	}

	public void printBalanceEUR(int moneyKOR) {
		convert.BALANCE_EUR = convert.BALANCE_EUR - moneyKOR; // EUR 보유자산 누적해서 빼지게 설정
	}

	public void printBalanceJPY(int moneyKOR) {
		convert.BALANCE_JPY = convert.BALANCE_JPY - moneyKOR; // JPY 보유자산 누적해서 빼지게 설정
	}

}
