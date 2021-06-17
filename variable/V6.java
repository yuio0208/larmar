package variable;

public class V6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		byte kopo05_b = 1;  // kopo05_b 변수에 1 입력  
		short kopo05_s = 2; // kopo05_s 변수에 2 입력
		char kopo05_c = 'A'; // kopo05_c 변수에 A 입력
		
		int kopo05_finger = 10;   // kopo05_finger 변수에 10 입력
		long kopo05_big = 1000000000000000L;  // kopo05_big 변수에 10000000000000000L 입력
		long kopo05_hex = 0xFFFFFFFFFFFFFFL;  // kopo05_hex 변수에 0xFFFFFFFFFFFFFFFL입력
		
		int kopo05_octNum = 010;    // kopo05_octNum에 010 입력  
		int kopo05_hexNum = 0x10;   // kopo05_hexNum에 0x10 입력
		int kopo05_binNum = 0b10;   // kopo05_binNum에 0b10 입력 
		
		System.out.printf("b=%d%n", kopo05_b);  // kopo05_b 출력 %d로 정수 출력하고 %n으로 줄띄우기 
		System.out.printf("s=%d%n", kopo05_s);  // kopo05_s 출력 %d로 정수 출력하고 %n으로 줄띄우기
		System.out.printf("c=%c, %d %n", kopo05_c, (int)kopo05_c);  // kopo05_c 출력 %d로 정수 출력하고 %n으로 줄띄우기
		System.out.printf("finger = [%5d]%n", kopo05_finger);  // kopo05_finger 출력 %5d로 5번째 안에 출력하고 %n으로 줄띄우기
		System.out.printf("finger = [%-5d]%n", kopo05_finger); // kopo05_finger 출력 %-5d로 출력후 공백을 5번째까지 출력하고 %n으로 줄띄우기
		System.out.printf("finger = [%05d]%n", kopo05_finger); // %05d로 5번째까지 kopo05_finger 출력하고 그전엔 0으로 채움 %n으로 줄띄우기
		System.out.printf("big=%d%n", kopo05_big);  // kopo05_big 정수로 출력 
		System.out.printf("hex=%#x%n", kopo05_hex);  // kopo05_hex를 %x로 16진수 정수로 출력 
		System.out.printf("octNum=%o, %d%n", kopo05_octNum, kopo05_octNum);  // %o로 8진수 정수형식으로 출력 
		System.out.printf("hexNum=%x, %d%n", kopo05_hexNum, kopo05_hexNum);  // %x로 16진수 정수로 출력 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(kopo05_binNum),kopo05_binNum);  // kopo05_binNum를 toBinaryString으로 이진수로 출력  
		
	}

}
