package scr;

import java.io.IOException;
import java.util.Scanner;

public class run {

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int moneyKOR = 0;
		int inputChangeType = 0;
		inputclass inputClass = new inputclass(); // inputclass���� ��ü�� �������ڴ�

		do {

			moneyKOR = inputClass.inputFromConsoleWon(); // inputclass���� �Է��ߴ� �� moneyKOR
			inputChangeType = inputClass.inputFromConsoleType(); // � �� ȯ���Ұ��� inputclass���� �Է��ߴ� type�� inputChangeType
			outfile runClass2 = new outfile();

			RunExchangeClass runClass = new RunExchangeClass(); // RunExchangeClass Ŭ������ ����ϰڴ�
			output runClass1 = new output();

			switch (inputChangeType) { // �Է��ߴ� type�� case������ ���
			case 1:
				runClass.changeToUSD(moneyKOR); // 1�� �Է��ߴٸ� �ι�°�� �Է��ߴ� ���� output���� ����� �״� changeToUSD �Լ��� �־���

				break;
			case 2:
				runClass.changeToEUR(moneyKOR); // 2�� �Է��ߴٸ� ���η�

				break;
			case 3:
				runClass.changeToJPY(moneyKOR); // 3�� �Է��ߴٸ� ��ȭ��

				break;

			}
			System.out.println("\nNext or please press 4 if you want to exit"); // �� ����ߴٸ� �������� ���� ��¹� ����
		} while (inputChangeType != 4); // 4�� ������ ����

	}
}
