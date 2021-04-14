package scr;

import java.io.IOException;

public class RunExchangeClass {

	private output outClass = null;    // output Ŭ������ ������ ���ڴ� null�� �� ������ ����� ���ÿ� �ʱ�ȭ ��Ű�� �������� 
	
	public RunExchangeClass() {
		outClass = new output();      // ��ü �Ҵ��� RunExchangeClass�ȿ��� ���� 
	}
	private boolean checkBalanceUSD(int requestUSD) {      // checkBalanceUSD��� �Լ� ����, �μ��� requestUSD�Է�, boolean�� true false�θ� 
		if(requestUSD <= convert.BALANCE_USD) {             // ���� �Է��� ���� convert���� ������ BALANCE_USD(1000)���� �۰ų� ������ true ��� 
			return true;                                  
		} else {
			return false;                   // �����ڻ꺸�� ����� �ݾ��� �������� ����� �ȵ�
		
		} 
		
		
	}
	
	private boolean checkBalanceEUR(int requestEUR) {
		if(requestEUR <= convert.BALANCE_EUR) {
			return true;
		} else {
			return false;
	
	}
	
}

	private boolean checkBalanceJPY(int requestJPY) {
	
		if(requestJPY <= convert.BALANCE_JPY) {
			return true;
		} else {
			return false;
	
	}

   }
	
	public void changeToUSD(int moneyKOR) throws IOException {     // changeToUSD�Լ��� �μ� moneyKOR�� �Է� 
		double returnUSD;
		int returnRealUSD;
		int charge;
		
		returnUSD = moneyKOR / convert.USD;            // returnUSD�� ȯ���� ���� convert Ŭ�������� ������ USD�� �����ذ� 
		returnRealUSD = (int)returnUSD;	                 // returnRealUSD�� returnUSD�� �Ҽ����� ���� ��
		if(checkBalanceUSD(returnRealUSD)) {
			
			
			charge = (int) (moneyKOR - returnRealUSD * convert.USD);
			charge = (charge / 10) * 10;  	
			convert.BALANCE_USD-= returnRealUSD;
			
			
			outClass.changeToUSD(moneyKOR);
			
			System.out.println("�����ڻ�" + convert.BALANCE_USD + "\n");
			outClass.change_USD(charge);
			
			outClass.printBalanceEUR(moneyKOR);
			
		} else {
			outClass.printErrorMessage(convert.ERR_BALANCE_USD);           // �����ڻ� �پ��� �����޼��� �߰� ���� 
		}
	}
	public void changeToEUR(int moneyKOR) throws IOException {
		double returnEUR;
		int returnRealEUR;
		int charge;
		returnEUR = moneyKOR / convert.EUR;
		returnRealEUR = (int)returnEUR;	
		
		if(checkBalanceEUR(returnRealEUR)) {
			
			
			charge = (int) (moneyKOR - returnRealEUR * convert.EUR);
			charge = (charge / 10) * 10;  	
			convert.BALANCE_EUR-= returnRealEUR;
			
			
			outClass.changeToEUR(moneyKOR);
			System.out.println("�����ڻ�" + convert.BALANCE_EUR + "\n");
			outClass.change_EUR(charge);
			
			outClass.printBalanceEUR(moneyKOR);
			
		} else {
			outClass.printErrorMessage(convert.ERR_BALANCE_EUR);
			
					
		}
	}
	public void changeToJPY(int moneyKOR) throws IOException {
		double returnJPY;
		int returnRealJPY;
		int charge;
		returnJPY = moneyKOR / convert.JPY;
		returnRealJPY = (int)returnJPY;	
		
		if(checkBalanceJPY(returnRealJPY)) {
			
			
			charge = (int) (moneyKOR - returnRealJPY * convert.JPY);
			charge = (charge / 10) * 10;  	
			convert.BALANCE_JPY-= returnRealJPY;
		
			
			
			outClass.changeToJPY(moneyKOR);
			
			System.out.println("�����ڻ�" + convert.BALANCE_JPY + "\n");
			outClass.change_JPY(charge);
			
			outClass.printBalanceJPY(moneyKOR);
			
		} else {
			outClass.printErrorMessage(convert.ERR_BALANCE_JPY);
		
	}
} 
}
	
	
	
	
	
	

