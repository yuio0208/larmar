package parti;

import java.util.Scanner;

public class Ru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cal inputclass = new cal();

		int a = 0;
		String a1 = "";
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		do {

			inclass runclass = new inclass();

			a = runclass.inputType();
			a1 = runclass.inputNum();
			a2 = runclass.inputTh();
			a3 = runclass.inputWu();

			int cb = (int) inputclass.age(Integer.parseInt(a1));
			int price = inputclass.agePay(cb, a2, a);
			double cut = cal.cutpay(a3 - 1);
			int sum = (int) (price * (1 - cut));

			System.out.println("가격은 " + (int) (price * (1 - cut)) + "원 입니다");
			System.out.println("감사합니다\n");

			a4 = runclass.inputFin(a, a2, cb, sum);

			if (a4 == 2) {

				System.out.println("계속 진행 (1: 새로운 주문, 2: 프로그램 종료)");
				Scanner re = new Scanner(System.in);
				a5 = re.nextInt();
				if (a5 == 1) {

				} else if (a5 == 2) {
					break;
				}

			} else if (a4 >= 3) {
				System.out.println("다시해");

			}

		} while (true);

	}
}