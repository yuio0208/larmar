package Gaek;

public class G8 {

	
	private int kopo05_limit_up_floor;  // 최고층 
	private int kopo05_limit_down_floor;   // 최하층 
	private int kopo05_floor;   // 현재층 
	private String kopo05_help;  // 안내문구 
	
	
	G8() {   // 생성자로 변수 초기화, 클래스가 호출되어서 생성자 실행되고 메소드 실행 
		kopo05_limit_up_floor = 10; // 최고층 설정 
		kopo05_limit_down_floor = 1;  // 최하층 설정 
		kopo05_floor = 1;    // 현재층 설정 
		kopo05_help = "엘레베이터 기본 준공완료"; // 안내문구 설정 
		
	}
	
	G8(int up_floor, int d_floor, int in_floor) { // 입력한 인자값으로 초기화하는 생성자 
		kopo05_limit_up_floor = up_floor;   // 첫 입력값을 최고층으로 설정 
		kopo05_limit_down_floor = d_floor;   // 두번째 입력값을 최하층으로 설정
		kopo05_floor = in_floor; // 세번째 입력값을 현재층으로 설정
		kopo05_help = "엘레베이터 맞춤 준공완료";  // 안내문구 설정 
	}
	
	void kopo05_up() {   // 엘레베이터 올리기 메소드 
		if(kopo05_floor == kopo05_limit_up_floor) {  // 현재층이 최고층일 경우 
			kopo05_help = "마지막 층입니다";   // 안내문구 
		}else {     // 최고층이 미만일 경우 
			kopo05_floor++;  // 층수에 +1씩 
			kopo05_help = String.format("[%d] 층입니다", kopo05_floor); // 안내문구와 현재층 출력 
			
		}
	}
	void kopo05_down() {  // 엘레베이터 내리기 메소드 
		if(kopo05_floor == kopo05_limit_down_floor) {  // 현재층이 최하층일 경우 
			kopo05_help = "처음 층입니다";   // 안내문구 
		}else {  // 최하층 초과일 경우 
			kopo05_floor--;   // 층수 -1씩
			kopo05_help = String.format("[%d] 층입니다", kopo05_floor);  // 안내문구와 현재층 출력
			
		}
	}
	
	void kopo05_up(int kopo05_u) {  // 엘레베이터 n층 올리기 메소드 
		for(int kopo05_i = 0; kopo05_i < kopo05_u; kopo05_i++) // n번 
			this.kopo05_up();  // 이 클래스의 인자 없는 엘레베이터 올리기 메소드 반복 실행 
		
	}
	
	void kopo05_down(int kopo05_u) {  // 엘레베이터 n층 내리기 메소드
		for(int kopo05_i = 0; kopo05_i < kopo05_u; kopo05_i++) // n번
			this.kopo05_down();  // 이 클래스의 인자 없는 엘레베이터 내리기 메소드 반복 실행 
	

	}
	
	void kopo05_msg(String kopo05_id) {   //  메세지 출력 메소드 
		System.out.printf("%s =>[%s]  최대층[%d] 최소층[%d]  현재층[%d]\n", kopo05_id, kopo05_help, 
				kopo05_limit_up_floor, kopo05_limit_down_floor, kopo05_floor);
		// 인자로 받은 문자열, 안내문구, 최대층, 최소층, 현재층 출력 
		
	}
	
	void Repair() {
		kopo05_help = String.format("수리중입니다");
		
	}
	
	
	
	
	
	
	
}
