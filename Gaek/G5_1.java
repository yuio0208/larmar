package Gaek;

public class G5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		G5 kopo05_remote = new G5();  // 리모콘 객체 생성 

		System.out.println("===== 채널변경 =====");  // 구분 설정 

		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {   // 채널 올리기 10까지
			kopo05_remote.kopo05_Channelup();   // 채널 올리기 메소드 호출 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);   // 안내문 출력 
		}
		for (int kopo05_i = 0; kopo05_i < 10; kopo05_i++) {  // 채널 내리기 10부터 
			kopo05_remote.kopo05_Channeldown();   // 채널 내리기 메소드 호출 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // 안내문 출력 

		}

		System.out.println("===== 볼륨변경 =====");   // 구분 설정 

		for (int kopo05_i = 0; kopo05_i < 5; kopo05_i++) {   // 볼륨 올리기 5까지 
			// 0부터 4까지지만 kopo05_Volup 메소드에서 최대볼륨 kopo05_Vol_up인 5가 될때까지 +1씩 더해짐 5가되면 안내문 출력 
			kopo05_remote.kopo05_Volup();    // 볼륨 올리기 메소드 호출 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // 안내문 출력 
		}
		for (int kopo05_i = 0; kopo05_i < 5; kopo05_i++) {   // 볼륨 내리기 5부터 
			kopo05_remote.kopo05_Voldown();    // 볼륨 내리기 메소드 호출 
			System.out.printf("[%s]\n", kopo05_remote.kopo05_help);  // 안내문 출력 

		}

	}

}
