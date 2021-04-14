package scr;

import java.io.IOException;

public class RunExchangeClass {

	private output outClass = null;    // output 클래스를 가져다 쓰겠다 null을 쓴 이유는 선언과 동시에 초기화 시키지 않으려고 
	
	public RunExchangeClass() {
		outClass = new output();      // 객체 할당을 RunExchangeClass안에서 해줌 
	}
	private boolean checkBalanceUSD(int requestUSD) {      // checkBalanceUSD라는 함수 설정, 인수로 requestUSD입력, boolean은 true false로만 
		if(requestUSD <= convert.BALANCE_USD) {             // 만약 입력한 값이 convert에서 가져온 BALANCE_USD(1000)보다 작거나 같으면 true 출력 
			return true;                                  
		} else {
			return false;                   // 보유자산보다 출력할 금액이 많아지면 출력이 안됨
		
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
	
	public void changeToUSD(int moneyKOR) throws IOException {     // changeToUSD함수에 인수 moneyKOR을 입력 
		double returnUSD;
		int returnRealUSD;
		int charge;
		
		returnUSD = moneyKOR / convert.USD;            // returnUSD는 환율할 돈에 convert 클래스에서 가져온 USD를 나눠준값 
		returnRealUSD = (int)returnUSD;	                 // returnRealUSD는 returnUSD의 소수점을 버린 값
		if(checkBalanceUSD(returnRealUSD)) {
			
			
			charge = (int) (moneyKOR - returnRealUSD * convert.USD);
			charge = (charge / 10) * 10;  	
			convert.BALANCE_USD-= returnRealUSD;
			
			
			outClass.changeToUSD(moneyKOR);
			
			System.out.println("보유자산" + convert.BALANCE_USD + "\n");
			outClass.change_USD(charge);
			
			outClass.printBalanceEUR(moneyKOR);
			
		} else {
			outClass.printErrorMessage(convert.ERR_BALANCE_USD);           // 보유자산 다쓰면 오류메세지 뜨게 설정 
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
			System.out.println("보유자산" + convert.BALANCE_EUR + "\n");
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
			
			System.out.println("보유자산" + convert.BALANCE_JPY + "\n");
			outClass.change_JPY(charge);
			
			outClass.printBalanceJPY(moneyKOR);
			
		} else {
			outClass.printErrorMessage(convert.ERR_BALANCE_JPY);
		
	}
} 
}
	
	
	
	
	
	

