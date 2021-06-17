package variable;

public class V12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kopo05_i = 91234567; // kopo05_i에 91234567입력  
		float kopo05_f = (float)kopo05_i; // kopo05_i를 float형식으로 변환후 kopo05_f에 입력 
		int kopo05_i2 = (int)kopo05_f; // kopo05_f를 int로 변환후 kopo05_i2에 입력
		
		double kopo05_d = (double)kopo05_i;  // kopo05_i를 double형식으로 변환후 kopo05_d에 입력 
		int kopo05_i3 = (int)kopo05_d; // kopo05_d를 int 형식으로 변환 후 kopo05_i3에 입력 
		
		float kopo05_f2 = 1.666f;   // kopo05_f2에 1.666f 입력 
		int kopo05_i4 = (int)kopo05_f2;  // kopo05_f2를 int형식으로 변환후 kopo05_i4에 입력 
		
		System.out.printf("kopo05_i = %d\n", kopo05_i);     // kopo05_i출력
		System.out.printf("kopo05_f = %f kopo05_i2 = %d\n", kopo05_f, kopo05_i2);  // kopo05_f와 kopo05_i2 출력 
		System.out.printf("kopo05_d = %f kopo05_i3 = %d\n", kopo05_d, kopo05_i3);  // kopo05_d와 kopo05_i3 출력 
		System.out.printf("(int)%f = %d\n", kopo05_f2, kopo05_i4);  // kopo05_f2와 kopo05_i4 출력 

		
		
		
	}

}
