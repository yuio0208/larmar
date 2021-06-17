package Gaek;

public class G4 {

	int kopo05_limit_up = 10;  // 최대 층 10층으로 설정 
	int kopo05_limit_down = 1;  // 최소 층 1층으로 설정 
	int kopo05_floor = 1;  	// 현재 층 
	String kopo05_help;    // 안내문구 

	void kopo05_up() {  // 올라가는 엘레베이터 메소드 생성  
		if (kopo05_floor == kopo05_limit_up) {  // 현재층이 최대 층이라면 
			kopo05_help = "마지막층입니다";    // 마지막 층 출력 

		} else {   // 그외에는 
			kopo05_floor++;  // 현재층이 1층씩 올라갈때 마다 
			kopo05_help = String.format("%d층입니다", kopo05_floor);  // 현재 몇층인지 출력 

		}
	}

	void kopo05_down() { // 내려가는 엘레베이터 메소드 생성 
		if (kopo05_floor <= kopo05_limit_down) { // 현재 최하층일 경우  
			kopo05_help = "최하층입니다";   // 최하층 출력 
		} else {  // 최하층 이상일 경우 
			kopo05_floor--;  // 한층씩 내려갈때마다 
			kopo05_help = String.format("%d층입니다", kopo05_floor); // 몇층인지 출력 
		}
	}

}
