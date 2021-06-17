package variable;

public class V2 {

	public static void main23(String[] args) {
		// TODO Auto-generated method stub

		
		int kopo05_x = 0;  // kopo05_x 변수에 0 입력
		int kopo05_y = 20;  // kopo05_y  변수에 20 입력 
		int kopo05_tmp = 0; // kopo05_tmp 변수에 0 입력 
		// 이렇게 초기화를 해주는 이유는 메소드내에서는 값이 자동으로 할당이 안되기 때문에
		
		System.out.println("kopo05_x:" + kopo05_x + " kopo05_y:" + kopo05_y); // kopo05_x 출력 kopo05_y 출력
		
		kopo05_tmp = kopo05_x;  // kopo05_tmp에 kopo05_x 대입 
		kopo05_x = kopo05_y;   // kopo05_x에 kopo05_y 대입
		kopo05_y = kopo05_tmp;  // kopo05_y에 kopo05_tmp 대입 
		
		System.out.println("kopo05_x" + kopo05_x + " kopo05_y:"+ kopo05_y);  // kopo05_x에 kopo05_y값을 넣어줬기 때문에 20, kopo05_y에 kopo05_tmp값을 넣어줬기 때문에 0
		
		
		
	}

}
