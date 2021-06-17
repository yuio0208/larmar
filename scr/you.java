package scr;

import java.util.Scanner;

public class you {

	public static void main6548(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Which money do you want? " + "\n1:USD" + "\n2:EUR" + "\n3:JPY" + "\n4:EXIT\n ");
			int a = sc.nextInt();

			switch (a) {
			case 1:
				int b = sc.nextInt();
				double USD = 1134.4;
				double num = b / USD;
				String temp = "";

				int outputUSD = (int) (num * 100) / 100;
				int outputUSD100 = (int) ((num * 100) / 100) / 100;
				int outputUSD50 = (int) (((num * 100) / 100) % 100) / 50;
				int outputUSD10 = (int) ((((num * 100) / 100) % 100) % 50) / 10;
				int outputUSD5 = (int) (((((num * 100) / 100) % 100) % 50) % 10) / 5;
				int outputUSD1 = (int) ((((((num * 100) / 100) % 100) % 50) % 10) % 5) / 1;

				int changeUSD = (int) (b - (outputUSD * USD));
				int changeUSD500 = (int) ((b - (outputUSD * USD))) / 500;
				int changeUSD100 = (int) ((b - ((outputUSD * USD))) % 500) / 100;
				int changeUSD50 = (int) ((b - (((outputUSD * USD))) % 500) % 100) / 50;
				int changeUSD10 = (int) ((b - ((((outputUSD * USD))) % 500) % 100) % 50) / 10;
				int changeUSD5 = (int) ((b - (((((outputUSD * USD))) % 500) % 100) % 50) % 10) / 5;
				int changeUSD1 = (int) ((b - ((((((outputUSD * USD))) % 500) % 100) % 50) % 10) % 5) / 1;

				temp += "원화 입력" + b;
				System.out.println("원화 입력 : " + b);
				temp += "1: USD";
				System.out.println("1: USD");
				System.out.println("환전결과 : " + outputUSD + "달러");
				System.out.println("100달러 : " + outputUSD100 + "장");
				System.out.println("50달러 : " + outputUSD50 + "장");
				System.out.println("10달러 : " + outputUSD10 + "장");
				System.out.println("5달러 : " + outputUSD5 + "장");
				System.out.println("1달러 : " + outputUSD1 + "장");

				System.out.println("거스름돈 : " + changeUSD + "원");
				System.out.println("500원 : " + changeUSD500 + "개");
				System.out.println("100원 : " + changeUSD100 + "개");
				System.out.println("50원 : " + changeUSD50 + "개");
				System.out.println("10원 : " + changeUSD10 + "개");
				System.out.println("5원 : " + changeUSD5 + "개");
				System.out.println("1원 : " + changeUSD1 + "개");
				break;

			case 2:
				b = sc.nextInt();
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
				int outputEUR1 = (int) ((((((((((num1 * 100) / 100) % 500) % 200) % 100) % 50) % 20) % 10) % 5) % 2)
						/ 1;

				int changeEUR = (int) (b - outputEUR * EUR);
				int changeEUR500 = (int) (b - (outputEUR * EUR)) / 500;
				int changeEUR100 = (int) ((b - (outputEUR * EUR)) % 500) / 100;
				int changeEUR50 = (int) (((b - (outputEUR * EUR)) % 500) % 100) / 50;
				int changeEUR10 = (int) ((((b - (outputEUR * EUR)) % 500) % 100) % 50) / 10;
				int changeEUR5 = (int) (((((b - (outputEUR * EUR)) % 500) % 100) % 50) % 10) / 5;
				int changeEUR1 = (int) ((((((b - (outputEUR * EUR)) % 500) % 100) % 50) % 10) % 5) / 1;

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
				System.out.println("1유로 : " + outputEUR1 + "개");

				System.out.println("거스름돈 : " + changeEUR + "원");
				System.out.println("500원 : " + changeEUR500 + "개");
				System.out.println("100원 : " + changeEUR100 + "개");
				System.out.println("50원 : " + changeEUR50 + "개");
				System.out.println("10원 : " + changeEUR10 + "개");
				System.out.println("5원 : " + changeEUR5 + "개");
				System.out.println("1원 : " + changeEUR1 + "개");
				break;

			case 3:
				b = sc.nextInt();
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
				int outputJPY10 = (int) (((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) % 50)
						/ 10;
				int outputJPY5 = (int) ((((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100) % 50)
						% 10) / 5;
				int outputJPY1 = (int) (((((((((((num2 * 100) / 100) % 10000) % 5000) % 2000) % 1000) % 500) % 100)
						% 50) % 10) % 5) / 1;

				int changeJPY = (int) (b - (outputJPY * JPY));
				int changeJPY500 = (int) ((b - (outputJPY * JPY))) / 500;
				int changeJPY100 = (int) ((b - ((outputJPY * JPY))) % 500) / 100;
				int changeJPY50 = (int) ((b - (((outputJPY * JPY))) % 500) % 100) / 50;
				int changeJPY10 = (int) ((b - ((((outputJPY * JPY))) % 500) % 100) % 50) / 10;
				int changeJPY5 = (int) ((b - (((((outputJPY * JPY))) % 500) % 100) % 50) % 10) / 5;
				int changeJPY1 = (int) ((b - ((((((outputJPY * JPY))) % 500) % 100) % 50) % 10) % 5) / 1;

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
				System.out.println("1엔 : " + outputJPY1 + "개");

				System.out.println("거스름돈 : " + changeJPY + "원");
				System.out.println("500원 : " + changeJPY500 + "개");
				System.out.println("100원 : " + changeJPY100 + "개");
				System.out.println("50원 : " + changeJPY50 + "개");
				System.out.println("10원 : " + changeJPY10 + "개");
				System.out.println("5원 : " + changeJPY5 + "개");
				System.out.println("1원 : " + changeJPY1 + "개");

				break;

			case 4:
				break;
			}

		}
	}

}
