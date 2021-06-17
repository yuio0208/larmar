package variable;

public class V7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String kopo05_url = "www.codechobo.com";
		
		float kopo05_f1 = .10f; // kopo05_f1에 0.10
		float kopo05_f2 = 1e1f;  // 10.0 , 1.0e1 , 1.0e+1 
		float kopo05_f3 = 3.14e3f;  // 3140.0 , 3.140
		double kopo05_d = 1.23456789; // 소수 1.23456789입력 
		
		System.out.printf("f1 = %f, %e, %g%n", kopo05_f1, kopo05_f1, kopo05_f1);  //kopo05_f1을 %f는 소수점 형식으로 출력, %e는 지수표현식 형식으로 출력, %g는 출력의 대상에 따라 %e 또는 %f 형태로 출력  
		System.out.printf("f2 = %f, %e, %g%n", kopo05_f2, kopo05_f2, kopo05_f2);  //kopo05_f2을 %f는 소수점 형식으로 출력, %e는 지수표현식 형식으로 출력, %g는 출력의 대상에 따라 %e 또는 %f 형태로 출력 
		System.out.printf("f3 = %f, %e, %g%n", kopo05_f3, kopo05_f3, kopo05_f3);  //kopo05_f3을 %f는 소수점 형식으로 출력, %e는 지수표현식 형식으로 출력, %g는 출력의 대상에 따라 %e 또는 %f 형태로 출력 

		System.out.printf("d=%f%n", kopo05_d);      // kopo05_d를 %f 소수점 형식으로 출력 
		System.out.printf("d=%14.10f%n", kopo05_d); // kopo05_d를 %f 소수점 형식으로 전체 14자리 중 소수점 10자리로 출력 
		
		System.out.printf("[12345678901234567890]%n");  // [12345678901234567890]출력 후 줄 띄어쓰기  
		System.out.printf("[%s]%n", kopo05_url);    // [] 안에 kopo05_url 출력  
		System.out.printf("[%20s]%n", kopo05_url);   // []안에 kopo05_url 왼쪽 정렬로 20번째 안에 출력 
		System.out.printf("[%-20s]%n", kopo05_url);  // []안에 kopo05_url 오른쪽 정렬로 20번째 안에 출력
		System.out.printf("[%.8s]%n", kopo05_url);   // []안에서 kopo05_url를 왼쪽 8글자만 출력 
		
		
	}

}
