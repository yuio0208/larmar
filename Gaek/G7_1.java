package Gaek;

public class G7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		G7 kopo05_cal = new G7(); // G7 클래스를 객체로 가져옴
		
		System.out.printf("3월 성적표\n");  // 헤드 설정 
		System.out.printf("=====================================================\n");  // 구분 설정 
		System.out.println("이름   국어   영어   수학   총점   평균");		// 항목 설정 
		System.out.printf("=====================================================\n");
		System.out.printf("폴리융  %3d    %3d   %3d    %3d    %3d\n\n", 100, 100, 100, kopo05_cal.koppo05_sum1(100, 100, 100), kopo05_cal.koppo05_avg1(100, 100, 100) );  // 3개의 인수를 가지는 메소드 가져옴 
		
		
		System.out.printf("4월 성적표\n");
		System.out.printf("=====================================================\n");
		System.out.println("이름   국어   영어   수학   과학   총점   평균");		
		System.out.printf("=====================================================\n");
		System.out.printf("폴리융  %3d    %3d   %3d    %3d    %3d    %3d\n\n", 100, 100, 100, 100,  kopo05_cal.koppo05_sum2(100, 100, 100, 100), kopo05_cal.koppo05_avg2(100, 100, 100, 100));
		 // 4개의 인수를 가지는 메소드 가져옴 
		
		System.out.printf("5월 성적표\n");
		System.out.printf("=====================================================\n");
		System.out.println("이름   국어   영어   수학   과학   사회   총점   평균");		
		System.out.printf("=====================================================\n");
		System.out.printf("폴리융  %3d    %3d   %3d    %3d     %3d    %3d    %3d\n", 100, 100, 100, 100, 100, kopo05_cal.koppo05_sum3(100, 100, 100, 100, 100), kopo05_cal.koppo05_avg3(100, 100, 100, 100, 100) );
		 // 5개의 인수를 가지는 메소드 가져옴 
		
		
	}

}
