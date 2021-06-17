package Young;

public class Dal {

	public static void main23(String[] args) {
		// TODO Auto-generated method stub

		int kopo05_weekday = 5;  // 초기값 설정 
		int[] kopo05_end = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };   // 각각 달의 마지막 ㄴㄹ

		for (int kopo05_Mon = 0; kopo05_Mon < 12; kopo05_Mon++) {
			System.out.printf("\n\n                        %d월\n", kopo05_Mon + 1);
			System.out.printf("===================================================\n");
			System.out.printf(" 일\t 월\t 화\t 수\t 목\t 금\t 토 \n");
			for (int kopo05_i = 1; kopo05_i <= kopo05_end[kopo05_Mon] + kopo05_weekday; kopo05_i++) {
				if (kopo05_i <= kopo05_weekday) {
					System.out.printf(" \t");

				} else {
					System.out.printf("%3d\t", kopo05_i - kopo05_weekday);

					if (kopo05_i % 7 == 0) {
						System.out.println();
					}
				}

			}

			kopo05_weekday = (kopo05_weekday + (kopo05_end[kopo05_Mon] % 7)) % 7;

		}

	}

}
