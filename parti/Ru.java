package parti;

import java.util.Scanner;

public class Ru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cal inputclass = new cal();

		int NDPrint = 0;
		String Jumin = "";
		int JangSuPrint = 0;
		int WDPrint = 0;
		int FinPrint = 0;
		int ZZinMack = 0;
		int i = 0;
		do {
			write wr = new write();
			inclass runclass = new inclass();

			NDPrint = runclass.inputType();
			Jumin = runclass.inputJuMin();
			JangSuPrint = runclass.inputJangSu();
			WDPrint = runclass.inputWuDae();

			int ManNaI = (int) inputclass.age(Integer.parseInt(Jumin));
			int price = inputclass.agePay(ManNaI, JangSuPrint, NDPrint);
			double Discout = cal.CutPrice(WDPrint - 1);
			int SumPrice = (int) (price * (1 - Discout));

			System.out.println("가격은 " + SumPrice + "원 입니다");
			System.out.println("감사합니다\n");
			System.out.printf("계속 발권 하시겠습니까?\n" + "1. 티켓 발권\n" + "2. 종료\n");

			FinPrint = runclass.inputFin(NDPrint, WDPrint, ManNaI, SumPrice, WDPrint);
			// FinPrint = Integer.parseInt(wr.addList(price, JangSuPrint, ManNaI,
			

			Scanner re = new Scanner(System.in);
			if (FinPrint == 2) {

				System.out.println("계속 진행 (1: 새로운 주문, 2: 프로그램 종료)");

				ZZinMack = re.nextInt();
				if (ZZinMack == 1) {

				} else if (ZZinMack == 2) {
					break;

				} else {
					System.out.println("다시해");
					ZZinMack = re.nextInt();
				}
			}

		} while (true);

	}
}