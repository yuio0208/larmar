package variable;

public class V8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		short kopo05_sMin = -32768;  // kopo05_sMin에 -32768입력  
		short kopo05_sMax = 32767;   // kopo05_sMax에 32767입력
		char kopo05_cMin = 0;        //  kopo05_cMin에 0입력 
		char kopo05_cMax = 65535;    //  kopo05_cMax에 65535입력 
		
		
		System.out.println("kopo05_sMin = " + kopo05_sMin);  //  kopo05_sMin 출력 
		System.out.println("kopo05_sMin -1 = " + (short) (kopo05_sMin-1));   // short의 범위가  -32768까지기 때문에 -1을 해주면 32767이 된다  
		System.out.println("kopo05_sMax = " + kopo05_sMax);  //  kopo05_sMax 출력
		System.out.println("kopo05_sMax -1 = " + (short) (kopo05_sMax+1));  // short의 범위가  32767까지기 때문에 +1을 해주면 -32768이 된다
		System.out.println("kopo05_cMin = " + (int) kopo05_cMin);  //  kopo05_cMin 출력
		System.out.println("kopo05_cMin -1 = " + (int) --kopo05_cMin);  // char kopo05_cMin = 0에 -1은 65535
		System.out.println("kopo05_cMax = " + (int) kopo05_cMax);  //  kopo05_cMax 출력
		System.out.println("kopo05_cMax -1 = " + (int) ++kopo05_cMax);  // char kopo05_cMax = 65535에 +1은 0 
	}

}
