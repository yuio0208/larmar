package project;


public class Taxcalc { 
	
	
	
	public static void main33(String[] args) {
	
	String [] kopo05_item= {"����Ĩ" ,"��īĨ", "����Ĩ"};  // �迭�� ���� ���� �Է�
	int[] kopo05_price= {1000,2000,3000};                 // �迭�� ���� ���� �Է�
	int[] kopo05_amount= {10,20,30};                     // �迭�� ���� ���� �Է�
	double kopo05_tax_rate= 0.1;                         // ���� 10% 
	int kopo05_total_sum=0;                              // �� ���� �ݾ� ���� ����
	
	System.out.println("************************************\n");     // *�Է� ��  \n���� ���� �ٷ� 
	System.out.println("              ���� ����           \n");        //   �����Է� �� \n���� ���� �ٷ�
	System.out.println(" �׸�        �ܰ�       ����    �հ�\n");       // �׸�� �Է� �� \n���� ���� �ٷ�
	for(int kopo05_i=0; kopo05_i<kopo05_item.length; kopo05_i++) {
		// kopo05_item���� length�� �迭�� ���� ������ 0��°���� kopo05_item.length���� �����´�. 
		int kopo05_sum = kopo05_price[kopo05_i] * kopo05_amount[kopo05_i]; 
		// ���� * ������ kopo05_sum�� �־� �ش�.
		kopo05_total_sum = kopo05_total_sum + kopo05_sum;
		// kopo05_total_sum�� �������� �� ���ұݾ� ����
		System.out.printf("%.4s  %9d   %7d  %8d\n", kopo05_item[kopo05_i], kopo05_price[kopo05_i], kopo05_amount[kopo05_i],kopo05_sum);
 	}            // %.4s�� 4��° ���ڱ��� �����´ٴ� ���̰� �� �ڷ� %9d�� ���׸� ���� 9��°�� �ܰ��� ��Ÿ���ڴٴ� �� 
	System.out.println("*************************************\n");
	System.out.printf("���� �ݾ� :   %23d\n", kopo05_total_sum);  //  ���ұݾ� : ���� 23��°���� kopo05_total_sum ���ڴ�
	
	int kopo05_total_netprice= (int)(kopo05_total_sum/ (1+kopo05_tax_rate));   //kopo05_total_sum /(1 + kopo05_tax_rate)��  (���ұݾ� / (1+������)) kopo05_total_netprice�� �ִ´�
	System.out.printf("���� �ݾ� :  %24d\n", kopo05_total_netprice);              // �� ���� �ݾ� ���
	int kopo05_tax = kopo05_total_sum - kopo05_total_netprice;           // �� ���ұݾ� - �� �����ݾ� �� ���ָ�
	System.out.printf("��     �� :    %22d\n", kopo05_tax);              // ���� ��� 
	
	
	
	
	
	
	/*
			
			
	
			
		*/
			
	}


}