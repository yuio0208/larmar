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

				temp += "��ȭ �Է�" + b;
				System.out.println("��ȭ �Է� : " + b);
				temp += "1: USD";
				System.out.println("1: USD");
				System.out.println("ȯ����� : " + outputUSD + "�޷�");
				System.out.println("100�޷� : " + outputUSD100 + "��");
				System.out.println("50�޷� : " + outputUSD50 + "��");
				System.out.println("10�޷� : " + outputUSD10 + "��");
				System.out.println("5�޷� : " + outputUSD5 + "��");
				System.out.println("1�޷� : " + outputUSD1 + "��");

				System.out.println("�Ž����� : " + changeUSD + "��");
				System.out.println("500�� : " + changeUSD500 + "��");
				System.out.println("100�� : " + changeUSD100 + "��");
				System.out.println("50�� : " + changeUSD50 + "��");
				System.out.println("10�� : " + changeUSD10 + "��");
				System.out.println("5�� : " + changeUSD5 + "��");
				System.out.println("1�� : " + changeUSD1 + "��");
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

				System.out.println("��ȭ �Է� : " + b);
				System.out.println("2: EUR");
				System.out.println("ȯ����� : " + outputEUR + "����");

				System.out.println("500���� : " + outputEUR500 + "��");
				System.out.println("200���� : " + outputEUR200 + "��");
				System.out.println("100���� : " + outputEUR100 + "��");
				System.out.println("50���� : " + outputEUR50 + "��");
				System.out.println("20���� : " + outputEUR20 + "��");
				System.out.println("10���� : " + outputEUR10 + "��");
				System.out.println("5���� : " + outputEUR5 + "��");
				System.out.println("2���� : " + outputEUR2 + "��");
				System.out.println("1���� : " + outputEUR1 + "��");

				System.out.println("�Ž����� : " + changeEUR + "��");
				System.out.println("500�� : " + changeEUR500 + "��");
				System.out.println("100�� : " + changeEUR100 + "��");
				System.out.println("50�� : " + changeEUR50 + "��");
				System.out.println("10�� : " + changeEUR10 + "��");
				System.out.println("5�� : " + changeEUR5 + "��");
				System.out.println("1�� : " + changeEUR1 + "��");
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

				System.out.println("��ȭ �Է� : " + b);
				System.out.println("3: JPY");
				System.out.println("ȯ����� : " + outputJPY + "��");

				System.out.println("10000��: " + outputJPY10000 + "��");
				System.out.println("5000��: " + outputJPY5000 + "��");
				System.out.println("2000�� : " + outputJPY2000 + "��");
				System.out.println("1000�� : " + outputJPY1000 + "��");
				System.out.println("500�� : " + outputJPY500 + "��");
				System.out.println("100�� : " + outputJPY100 + "��");
				System.out.println("50�� : " + outputJPY50 + "��");
				System.out.println("10�� : " + outputJPY10 + "��");
				System.out.println("5�� : " + outputJPY5 + "��");
				System.out.println("1�� : " + outputJPY1 + "��");

				System.out.println("�Ž����� : " + changeJPY + "��");
				System.out.println("500�� : " + changeJPY500 + "��");
				System.out.println("100�� : " + changeJPY100 + "��");
				System.out.println("50�� : " + changeJPY50 + "��");
				System.out.println("10�� : " + changeJPY10 + "��");
				System.out.println("5�� : " + changeJPY5 + "��");
				System.out.println("1�� : " + changeJPY1 + "��");

				break;

			case 4:
				break;
			}

		}
	}

}
