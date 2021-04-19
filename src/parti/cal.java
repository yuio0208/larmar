package parti;

public class cal {

	public static long age(int choi) {

		int tr = 1000000;
		int c1 = choi + tr;
		int calcIdf = c1 / 10000;
		int calcIdb = c1 % 10000;
		int calc = 0;

		if (calcIdf > 100) {
			calc = (2021 - (1800 + calcIdf));

		} else {
			calc = (2021 - (1900 + calcIdf));

		}
		return calc;
	}

	
	inclass nomistake = new inclass();

	public static int agePay(int calc, int ticketcount, int a) {
		int result = 0;
		
		if (a == 1) {

			if (calc <= 64 && calc >= 19) {
				result = ticketcount * ConstValueClass.morningprice[0];
			} else if (calc <= 18 && calc >= 13) {
				result = ticketcount * ConstValueClass.morningprice[1];
			} else if (calc <= 12 && calc >= 3) {
				result = ticketcount * ConstValueClass.morningprice[2];
			} else if (calc >= 65) {
				result = ticketcount * ConstValueClass.morningprice[3];
			} else {
			}
			
		} else if (a == 2) {
			if (calc <= 64 && calc >= 19) {
				result = ticketcount * ConstValueClass.nightprice[0];
			} else if (calc <= 18 && calc >= 13) {
				result = ticketcount * ConstValueClass.nightprice[1];
			} else if (calc <= 12 && calc >= 3) {
				result = ticketcount * ConstValueClass.nightprice[2];
			} else if (calc >= 65) {
				result = ticketcount * ConstValueClass.nightprice[3];
			} else {
			}
		}
		return result;

	}

	

	
	
}