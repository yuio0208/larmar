package variable;

public class V10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_i = 10;  // kopo05_i 10으로 설정 
		byte kopo05_b = (byte)kopo05_i; // kopo05_i를 byte형태로 byte 형식의 kopo05_b에 입력 
		System.out.printf("[int -> byte] kopo05_i=%d -> kopo05_b = %d%n", kopo05_i, kopo05_b); // kopo05_i와 kopo05_b 출력 
		
		kopo05_i = 300; // kopo05_i를 300 입력 
		kopo05_b = (byte)kopo05_i;  // kopo05_i를 byte 형식으로 kopo05_b에 입력 
		System.out.printf("[int -> byte] kopo05_i=%d -> kopo05_b = %d%n", kopo05_i, kopo05_b); // kopo05_i와 kopo05_b 출력 byte는 범위가 127까지
		
		kopo05_b = 10; // kopo05_b에 10입력 
		kopo05_i = (int)kopo05_b; //kopo05_b를 int형식으로 kopo05_i에 입력 
		System.out.printf("[byte -> int] kopo05_b = %d -> kopo05_i = %d%n", kopo05_b, kopo05_i);  // kopo05_b와 kopo05_i 출력 
		
		kopo05_b = -2; // kopo05_b에 -2 입력 
		kopo05_i = (int)kopo05_b; // kopo05_b를 int형식으로 kopo05_i에 입력 
		System.out.printf("[byte -> int] kopo05_b = %d -> kopo05_i =%d%n", kopo05_b, kopo05_i);  // kopo05_b와 kopo05_i출력 
		
		
		System.out.println("kopo05_i = " +Integer.toBinaryString(kopo05_i));  // kopo05_i를 2진법으로 출력 
		
	}

}
