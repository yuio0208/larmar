package Gaek;

public class G5 {

	int kopo05_Channel_up = 10; // 최대 채널
	int kopo05_Channel_down = 1; // 최소 채널 
	int kopo05_Ch =1;  // 현 채널 
	int kopo05_Vol_up = 5;  // 최대 볼륨
	int kopo05_Vol_down = 1;  // 최소 볼룸 
	int kopo05_Vol = 1;   // 현볼륨 

	String kopo05_help; // 안내문구

	void kopo05_Channelup() { // 채널 올리기 메소드 
		if (kopo05_Ch == kopo05_Channel_up) { // 현재 채널이 최대채널일 경우 
			kopo05_help = "마지막 채널입니다"; // 안내문구 설정 

		} else { // 현재 볼륨이 최대 볼륨의 미만일 경우 
			kopo05_Ch++; // 볼륨을 ++로 1씩 더해감 
			kopo05_help = String.format("CHANNEL : %d", kopo05_Ch); // 현재 무슨 채널인지 출력

		}
	}

	void kopo05_Channeldown() { // 채널 내리기 메소드 
		if (kopo05_Ch == kopo05_Channel_down) { // 현재 채널이 최소채널일 경우 
			kopo05_help = "첫 채널입니다"; // 안내문구 설정
		} else { // 현재 채널이 최소채널보다 클 경우 
			kopo05_Ch--; // 채널 -1
			kopo05_help = String.format("CHANNEL : %d", kopo05_Ch); // 현재 무슨 채널인지 출력 
		}
	}
	

	void kopo05_Volup() { // 볼륨 올리기 메소드 
		if (kopo05_Vol == kopo05_Vol_up) { // 현재 최대 볼륨일 경우
			kopo05_help = "최대 볼륨입니다"; // 안내문구 설정 
		} else { // 현재 볼륨이 최대 볼륨보다 작을 경우 
			kopo05_Vol++; // 채널에 1씩 더함 
			kopo05_help = String.format("Vol : %d", kopo05_Vol); // 현재 볼륨 출력 
		}
	}
	

	void kopo05_Voldown() { // 볼륨 내리기 메소드 
		if (kopo05_Vol == kopo05_Vol_down) { // 현재 볼륨이 최소 볼륨일 경우 
			kopo05_help = "최소 볼륨입니다"; // 안내문구 설정
		} else { // 현재 볼륨이 최소볼륨보다 클 경우 
			kopo05_Vol--; // 채널에 -1씩 함 
			kopo05_help = String.format("Vol : %d", kopo05_Vol); // 현재 볼륨 출력
		}
	}

}
