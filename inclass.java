package parti;

import java.util.ArrayList;
import java.util.Scanner;

public class inclass {

	private static String String;

	public static int inputType() { // inputType 함수에 아무것도 안넣어도 return값을 int로 받음
		System.out.printf("권종을 선택하세요.\n1. 주간권 \n2. 야간권\n");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		while (true) {
			if (a != 1 && a != 2) {
				System.out.printf("다시\n");
				a = sc.nextInt();
			} else {
				break;
			}

		}
		return a; // return a는 inputType이랑 같음 , void가 있으면 return값 없어도 됨
	}

	public static String inputJuMin() {
		System.out.printf("주민번호 앞자리를 입력하세요. \n");
		Scanner sc1 = new Scanner(System.in);
		String a1 = sc1.next();

		while (true) {
			if (a1.length() != 6) {
				System.out.printf("앞자리만이라고\n");
				a1 = sc1.next();
			} else {
				break;
			}
		}
		return a1;

	}

	public static int inputJangSu() {

		System.out.printf("몇개를 주문하시겠습니까? (최대 10개) \n");
		Scanner sc2 = new Scanner(System.in);
		int a2 = sc2.nextInt();

		while (true) {
			if (a2 > 10) {
				System.out.printf("최대 10개라고\n");
				a2 = sc2.nextInt();
			} else if (a2 <= 10) {
				break;
			}
		}
		return a2;
	}

	public static int inputWuDae() {
		System.out.printf(
				"우대사항을 선택하세요.\n" + "1. 없음 (나이 우대는 자동처리)\n" + "2. 장애인\n" + "3. 국가유공자\n" + "4. 다자녀\n" + "5. 임산부\n");
		Scanner sc3 = new Scanner(System.in);
		int a3 = sc3.nextInt();

		while (true) {
			if (a3 == 1) {
				System.out.println("삐빅 자동처리");
				break;
			} else if (a3 == 2 || a3 == 3 || a3 == 4 || a3 == 5) {
				break;
			} else {
				System.out.println("뭐냐\n");
				a3 = sc3.nextInt(); // 왜 여기서 break를 안걸어 줬지?

			}
		}

		return a3;
	}

	public static int inputFin(int NightDay, int JangSu, int NaI, int GaGyeok, int WDNumber) {

		Scanner sc = new Scanner(System.in);
		int kanwye = sc.nextInt();

		String ND = "";

		if (kanwye == 2) {

			ND = NightDayPrint(NightDay);

			if (NaI > 19) {
				System.out.printf("어른 X  ");
				System.out.print(JangSu + "\t");
				System.out.print(GaGyeok + "원  ");
				WuDae(JangSu);

			} else if (NaI > 10) {
				System.out.printf("청소년 X  ");
				System.out.print(JangSu + "\t");
				System.out.print(GaGyeok + "원  ");
				WuDae(JangSu);

			} else {
				System.out.printf("잼민이 X  ");
				System.out.print(JangSu + "\t");
				System.out.print(GaGyeok + "원  ");
				WuDae(JangSu);

			}
		}

		// System.out.printf("=========================================\n");
		return kanwye;

	}

	Ru inclass = new Ru();

	public static String NightDayPrint(int NightDay) {

		System.out.println("티켓 발권을 종료합니다. 잘가");
		System.out.printf("\n");
		System.out.printf("===============Juice WRLD================\n");
		String aaa = null;
		switch (NightDay) {
		case 1:
			aaa = "주간권";
			System.out.printf("주간권  ");
			break;
		case 2:
			aaa = "야간권";
			System.out.printf("야간권  ");
			break;
		default:
			break;

		}
		return aaa;

	}

	Ru aka = new Ru();

	public static int WuDae(int a) {

		if (a == 1) {
			System.out.printf("*우대적용없음\n");
		} else if (a == 2) {
			System.out.printf("*장애인 우대적용\n");
		} else if (a == 3) {
			System.out.printf("*국가유공자 우대적용\n");
		} else if (a == 4) {
			System.out.printf("*다자녀 우대적용\n");
		} else if (a == 5) {
			System.out.printf("*임산부 우대적용\n");
		}
		return a;

	}

}
