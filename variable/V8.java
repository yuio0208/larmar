package variable;

public class V8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		short kopo05_sMin = -32768;  // kopo05_sMin�� -32768�Է�  
		short kopo05_sMax = 32767;   // kopo05_sMax�� 32767�Է�
		char kopo05_cMin = 0;        //  kopo05_cMin�� 0�Է� 
		char kopo05_cMax = 65535;    //  kopo05_cMax�� 65535�Է� 
		
		
		System.out.println("kopo05_sMin = " + kopo05_sMin);  //  kopo05_sMin ��� 
		System.out.println("kopo05_sMin -1 = " + (short) (kopo05_sMin-1));   // short�� ������  -32768������ ������ -1�� ���ָ� 32767�� �ȴ�  
		System.out.println("kopo05_sMax = " + kopo05_sMax);  //  kopo05_sMax ���
		System.out.println("kopo05_sMax -1 = " + (short) (kopo05_sMax+1));  // short�� ������  32767������ ������ +1�� ���ָ� -32768�� �ȴ�
		System.out.println("kopo05_cMin = " + (int) kopo05_cMin);  //  kopo05_cMin ���
		System.out.println("kopo05_cMin -1 = " + (int) --kopo05_cMin);  // char kopo05_cMin = 0�� -1�� 65535
		System.out.println("kopo05_cMax = " + (int) kopo05_cMax);  //  kopo05_cMax ���
		System.out.println("kopo05_cMax -1 = " + (int) ++kopo05_cMax);  // char kopo05_cMax = 65535�� +1�� 0 
	}

}
