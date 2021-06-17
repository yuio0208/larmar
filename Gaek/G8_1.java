package Gaek;

public class G8_1 {

	static G8 kopo05_elev1;  
	static G8 kopo05_elev2;
	static G8 kopo05_elev3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kopo05_elev1 = new G8();   // 기본 엘레베이터 
		kopo05_elev2 = new G8(20, 1, 8);  // 생성자로 인자 3개일때 메소드를 설정해논것
		kopo05_elev3 = new G8(50, -3, 5);  // 생성자로 인자 3개일때 메소드를 설정해논것 

		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0부터 20까지 즐로 출력 
			kopo05_elev1.kopo05_up();  //  kopo05_up 메소드 호출 
			kopo05_elev1.kopo05_msg("1번열에 한층 오르기"); // 안내문구 출력 

		}
		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0부터 20까지 즐로 출력 
			kopo05_elev2.kopo05_up(2);  //  kopo05_up 메소드 호출 
			kopo05_elev2.kopo05_msg("1번열에 2층씩 오르기"); // 안내문구 출력 
 
		}
		for (int kopo05_i = 0; kopo05_i < 20; kopo05_i++) {  // 0부터 20까지 즐로 출력 
			kopo05_elev3.kopo05_up(3);  //  kopo05_up 메소드 호출 
			kopo05_elev3.kopo05_msg("1번열에 3층씩 오르기"); // 안내문구 출력 

		}
	}

}
