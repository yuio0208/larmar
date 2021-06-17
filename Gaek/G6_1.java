package Gaek;

public class G6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		G6 koppo05_cal = new G6();   // 메소드를 모아논 클래스를 koppo05_cal 객체로 가져옴 
		
		System.out.printf("2개 덧셈이 호출됨 [%d]\n", koppo05_cal.koppo05_sum1(1, 2));  // koppo05_sum1 메소드에 1 과 2 대입해서 계산 
		System.out.printf("3개 덧셈이 호출됨 [%d]\n", koppo05_cal.koppo05_sum2(1, 2, 3));   // koppo05_sum2 메소드에 1 과 2와 3을 대입해서 계산
		System.out.printf("4개 덧셈이 호출됨 [%d]\n", koppo05_cal.koppo05_sum3(1, 2, 3, 4));  // koppo05_sum3 메소드에 1 과 2와 3과 4을 대입해서 계산
		System.out.printf("실수형 덧셈이 호출됨 [%f]\n", koppo05_cal.koppo05_sum4(1.7, 2.8));   // koppo05_sum4 메소드에 1.7과 2.8을 대입해서 계산 
		
		
		
		
	}

}
