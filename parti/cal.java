package parti;

public class cal {

	public static long age(int NaI) {

		int Str = 1000000;
		int GaZZa = NaI + Str;
		int calIdf = GaZZa / 10000;
		int cal = 0;

		if (calIdf > 120) {
			cal = (2021 - (1800 + calIdf));

		} else if (calIdf <= 120) {
			cal = (2021 - (1900 + calIdf));

		}
		return cal;
	}

	inclass nomistake = new inclass();

	public static int agePay(int NaI, int Jansucount, int NightDay) {
		int result = 0;

		if (NightDay == 1) {

			if (NaI <= 64 && NaI >= 19) {
				result = Jansucount * ConstValueClass.morningprice[0];
			} else if (NaI <= 18 && NaI >= 13) {
				result = Jansucount * ConstValueClass.morningprice[1];
			} else if (NaI <= 12 && NaI >= 3) {
				result = Jansucount * ConstValueClass.morningprice[2];
			} else if (NaI >= 65) {
				result = Jansucount * ConstValueClass.morningprice[3];
			} else {
			}

		} else if (NightDay == 2) {
			if (NaI <= 64 && NaI >= 19) {
				result = Jansucount * ConstValueClass.nightprice[0];
			} else if (NaI <= 18 && NaI >= 13) {
				result = Jansucount * ConstValueClass.nightprice[1];
			} else if (NaI <= 12 && NaI >= 3) {
				result = Jansucount * ConstValueClass.nightprice[2];
			} else if (NaI >= 65) {
				result = Jansucount * ConstValueClass.nightprice[3];
			} else {
			}
		}
		return result;

	}

	public static double CutPrice(int Discount) {
		double result = 0;
		if (Discount == 1) {
			result = ConstValueClass.cutprice[0];
		} else if (Discount == 2) {
			result = ConstValueClass.cutprice[1];
		} else if (Discount == 3) {
			result = ConstValueClass.cutprice[2];
		} else if (Discount == 4) {
			result = ConstValueClass.cutprice[3];
		} else {

		}
		return result;

	}

}