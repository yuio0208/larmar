package Gaek;

public class G4_1 {

	private static int kopo05_inVal;  // 전역변수 kopo05_inVal설정  

	public static void kopo05_up() {  // 메소드 생성 
		kopo05_inVal++;   // 전역변수 kopo05_inVal를 1씩 증가 
		System.out.printf("메소드[%d]\n", kopo05_inVal); // kopo05_inVal값 출력 
	}

	public static void main45(String[] args) {
		// TODO Auto-generated method stub

		kopo05_inVal = 0;   // kopo05_inVal의 값이 0 설정 
		G4 kopo05_elev;    // kopo05_elev 객체 선언 

		kopo05_elev = new G4();  // kopo05_elev 객체 생성 

		kopo05_up(); // 같은 클래스내에 메소드 호출 초기값을 0으로 했고 ++를 해줘서 1로 값이 들어감 
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) { // 10번 반복 
			kopo05_elev.kopo05_up();   // G4 클래스의 메소드 
			// 0부터 9까지 10번 반복하는데 kopo05_up가 초기값이 1에 ++라 2부터 시작해서 10을 지나 마지막층입니다 출력까지 총 10번 반복  
			// 최상층이 아닐 때 한 층씩 올라감 
			System.out.printf("MSG[%s}\n", kopo05_elev.kopo05_help); // G4 클래스의 변수 출력

		}
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {   // 10번 반복 
			kopo05_elev.kopo05_down();     // G4 클래스의 메소드 
			// kopo05_down 메소드를 가지고 오는데 최하층 출력하기전까지 --로 1씩 줄어들며 출력 
			// 최하층이 아닐 때 한층 씩 올라감 
			System.out.printf("MSG[%s]\n", kopo05_elev.kopo05_help); // G4 클래스의 변수 출력

		}

	}

}
