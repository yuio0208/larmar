package scr;

import java.io.IOException;
import java.util.Scanner;

public class output {

	public void changeToUSD(int b) throws IOException { // changeToUSD��� �Լ� ���� - ȯ���� USD ��
		outfile outfile = new outfile();
		String str = "";
		double USD = 1134.4; // USD ȯ�� ����
		double num = b / USD; // �μ��� ������ USD�� ������ ȯ�� ���

		int outputUSD = (int) (num * 100) / 100; // �� ȯ���Ǵ� �� �׼�
		int outputUSD100 = (int) ((num * 100) / 100) / 100; // 100�޷� ������ �������� 100���� ���� �� ����
		int outputUSD50 = (int) (((num * 100) / 100) % 100) / 50; // 50�޷� ������ �������� 100���� ������ �������� 50���� ���� �� ����
		int outputUSD10 = (int) ((((num * 100) / 100) % 100) % 50) / 10; // �׿� 10�޷�
		int outputUSD5 = (int) (((((num * 100) / 100) % 100) % 50) % 10) / 5; // 5�޷�
		int outputUSD1 = (int) ((((((num * 100) / 100) % 100) % 50) % 10) % 5) / 1; // 1�޷����� ����

		System.out.println("��ȭ �Է� : " + b); // �� ȯ���Ұ��� ���
		System.out.println("1: USD");
		System.out.println("ȯ����� : " + outputUSD + "�޷�"); // outputUSD�� ����� ȯ���Ǵ� �� �׼� ���
		System.out.println("100�޷� : " + outputUSD100 + "��"); // ȯ���� �� �� 100�޷� ������ �������� ���
		System.out.println("50�޷� : " + outputUSD50 + "��"); // 100�޷��� ������ ȯ���� ���� 50�޷� ������ �������� ���
		System.out.println("10�޷� : " + outputUSD10 + "��"); // ���� ���� 10�޷�
		System.out.println("5�޷� : " + outputUSD5 + "��"); // 5�޷�
		System.out.println("1�޷� : " + outputUSD1 + "��\n"); // 1�޷� �� �������� ���

		str += "  " + b + "\t\t" + "  1\t   " + (int) (b - (outputUSD * USD)) + "\t\t  " + convert.BALANCE_USD + "\n";
		outfile.outfile1(str);

	}

	public void change_USD(int b) { // change_USD �Լ� ���� - USD�� �ܵ�

		double USD = 1134.4; // USD ȯ�� ����
		double num = b / USD; // �μ��� ������ USD�� ������ ȯ�� ���
		int outputUSD = (int) (num * 100) / 100; // �� ȯ���Ǵ� �� �׼�

		int changeUSD = (int) (b - (outputUSD * USD)); // changeUSD�� USD�ܵ��ε� �� ȯ���� �� b���� (�Ѵ޷� * ȯ��) ���ָ� �ܵ�(��ȭ)�̵�
		int changeUSD500 = (int) ((b - (outputUSD * USD))) / 500; // �װ� 500���� �����ָ� 500���� � �ܵ����� �������� ������
		int changeUSD100 = (int) ((b - ((outputUSD * USD))) % 500) / 100; // 500���� �����ְ� ���� ���� 100���� �����ָ� 100�� �ܵ��� ���������
																			// ������
		int changeUSD50 = (int) ((b - (((outputUSD * USD))) % 500) % 100) / 50; // 50��
		int changeUSD10 = (int) ((b - ((((outputUSD * USD))) % 500) % 100) % 50) / 10; // 10��
		int changeUSD5 = (int) ((b - (((((outputUSD * USD))) % 500) % 100) % 50) % 10) / 5; // 5��
		int changeUSD1 = (int) ((b - ((((((outputUSD * USD))) % 500) % 100) % 50) % 10) % 5) / 1; // 1������ �ܵ� ����

		System.out.println("�Ž����� : " + changeUSD + "��"); // �� �ܵ� ���
		System.out.println("500�� : " + changeUSD500 + "��"); // 500���� �ܵ��߿� � �������� ���
		System.out.println("100�� : " + changeUSD100 + "��"); // 500������ �����ְ� ���� �ܵ��߿� 100���� � �������� ���
		System.out.println("50�� : " + changeUSD50 + "��"); // �׷��� 50��
		System.out.println("10�� : " + changeUSD10 + "��"); // 10��
		System.out.println("5�� : " + changeUSD5 + "��"); // 5��
		System.out.println("1�� : " + changeUSD1 + "��"); // 1���� ��� �������� �� ���
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
		System.out.println("1���� : " + outputEUR1 + "��\n");

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

		System.out.println("�Ž����� : " + changeEUR + "��");
		System.out.println("500�� : " + changeEUR500 + "��");
		System.out.println("100�� : " + changeEUR100 + "��");
		System.out.println("50�� : " + changeEUR50 + "��");
		System.out.println("10�� : " + changeEUR10 + "��");
		System.out.println("5�� : " + changeEUR5 + "��");
		System.out.println("1�� : " + changeEUR1 + "��");
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
		System.out.println("1�� : " + outputJPY1 + "��\n");

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

		System.out.println("�Ž����� : " + changeJPY + "��");
		System.out.println("500�� : " + changeJPY500 + "��");
		System.out.println("100�� : " + changeJPY100 + "��");
		System.out.println("50�� : " + changeJPY50 + "��");
		System.out.println("10�� : " + changeJPY10 + "��");
		System.out.println("5�� : " + changeJPY5 + "��");
		System.out.println("1�� : " + changeJPY1 + "��");

	}

	public void printErrorMessage(int errorCode) { // printErrorMessage�� �Լ� ����
		switch (errorCode) {
		case convert.ERR_BALANCE_USD:
			System.out.print("�޷� "); //
			break;
		case convert.ERR_BALANCE_EUR:
			System.out.print("���� ");
			break;
		case convert.ERR_BALANCE_JPY:
			System.out.print("��ȭ ");
			break;
		}
		System.out.println("���� �ܾ��� �����մϴ�."); // ��¹� ����

	}

	public void printBalanceUSD(int moneyKOR) {
		convert.BALANCE_USD = convert.BALANCE_USD - moneyKOR; // USD �����ڻ� �����ؼ� ������ ����

	}

	public void printBalanceEUR(int moneyKOR) {
		convert.BALANCE_EUR = convert.BALANCE_EUR - moneyKOR; // EUR �����ڻ� �����ؼ� ������ ����
	}

	public void printBalanceJPY(int moneyKOR) {
		convert.BALANCE_JPY = convert.BALANCE_JPY - moneyKOR; // JPY �����ڻ� �����ؼ� ������ ����
	}

}
