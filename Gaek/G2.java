package Gaek;

public class G2 {

	static int kopo05_static;  // class내에 전역 변수 kopo05_static 선언 

	public static void main5(String[] args) {
		// TODO Auto-generated method stub

		int kopo05_main = 1; // kopo05_main를 1로 설정  지역변수 선언, 생성
		kopo05_static = 1; // kopo05_static를 1로 설정  전역변수 생성   

		System.out.printf("***********************************************\n");  // 구분 설정 
		System.out.printf("메소드호출전 메인에서 -> kopo05_static=[%d]\n", kopo05_static); // 앞서 설정해둔 1이 [] 안에 나오게 됨 전역변수 출력 
		System.out.printf("메소드호출전 메인에서 -> kopo05_main=[%d]\n", kopo05_main); // 설정해둔 1이[]안에 나오게 됨  지역변수 출력
		System.out.printf("***********************************************\n"); // 구분설정 

		add(kopo05_main); // add 메소드에 kopo05_main 값을 넣어서 호출
		// add 메소드에서 ++로 1을 더한값 출력
		
		
		System.out.printf("***********************************************\n");  // 구분설정
		System.out.printf("메소드호출후 메인에서 -> kopo05_static=[%d]\n", kopo05_static);   // 전역변수는 클래스내에서 사용가능한 변수라 2
		System.out.printf("메소드호출후 메인에서 -> kopo05_main=[%d]\n", kopo05_main); // 지역변수는 함수속에서만 사용가능한 변수라 1
		System.out.printf("***********************************************\n");  // 구분설정
		
		
		

		kopo05_main = add2(kopo05_main);  // add2 메소드에 지역변수 kopo05_main 값을 넣은 값 입력 
		// add2 메소드에서 ++로 1을 더해 kopo05_main에 1을 더해 2 출력 kopo05_static에 1 더해 3 출력 

		System.out.printf("***********************************************\n");  // 구분설정
		System.out.printf("메소드 add2호출후 메인에서 -> kopo05_static=[%d]\n", kopo05_static); // add2 메소드로 return으로 출력받은 값을 출력해서 3
		System.out.printf("메소드 add2호출후 메인에서 -> kopo05_main=[%d]\n", kopo05_main);  // add2 메소드로 return으로 출력받은 값을 출력해서 2
		System.out.printf("***********************************************\n");  // 구분설정

	}

	public static void add(int kopo05_i) {  // 더하기 메소드 
		kopo05_static++;  //  전역변수 + 1
		kopo05_i++;  // 메소드가 받아온 인자 +1 
		System.out.printf("add메소드에서 -> kopo05_static=[%d]\n", kopo05_static); // 변수값 출력 
		System.out.printf("add메소드에서 -> kopo05_i=[%d]\n", kopo05_i);  // 변수값 출력 

	}

	public static int add2(int kopo05_i) {  // 더하기 메소드 2
		kopo05_static++; //  전역변수 + 1
		kopo05_i++;  // 메소드가 받아온 인자 +1
		System.out.printf("add2메소드에서 -> kopo05_static=[%d]\n", kopo05_static);  // 변수값 출력 
		System.out.printf("add2메소드에서 -> kopo05_i=[%d]\n", kopo05_i);  // 변수값 출력 
		return kopo05_i;  // 인자값 반환 
	}
}
