package first2;


import java.util.Scanner;



public class second {

	public static void main44(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		
	
	
		
		   

  
  



	
		
	                              
		
		
		
		
		
		
		
		/*
		
		Calendar calendar = Calendar .getInstance(); 
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH,calendar.FEBRUARY);
	System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	calendar.set(Calendar.YEAR,2021);
	calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
	calendar.set(Calendar.DATE, 1);
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	
		
		
		
		*/
		
		
		
		
		
		
		
		
		
/* //p4
		
		
		
		
		Calendar calendar = Calendar .getInstance(); 
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH,calendar.FEBRUARY);
	System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	calendar.set(Calendar.YEAR,2021);
	calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
	calendar.set(Calendar.DATE, 1);
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		
		
		
	*/	
		
		
		
		
		
		
		
	/*	//p18 소수 prime numbers  다시 한번보기 
		
		int count=0;

        for(int i=2; i<=11; i++) // 1은 소수가 아니므로 2부터 시작
        {
            for(int j=2; j<=i; j++)
            {
                 if(i%j ==0) 
                 {
                      count ++;
                 }    
            }
            
            
            if(count==1)  // 소수는 1과 자기자신으로만 나눠지므로 자기자신으로 한번만 나눠질때 소수
            {
                 System.out.println(i+" ");
            }
            count=0;
        


		
        }
		
		
		*/
		
		
		
		
		
		
		
		/*
		
		Scanner input = new Scanner(System.in);
		int big, small;
		int a, b; int m, n;  //a를 최대공약수로 설정,b를 최소공배수로 설정 m은 몫, n은 나머지로 설정
		System.out.print("첫번째 수 입력 > ");
		int first = input.nextInt();
		System.out.print("두번째 수 입력 > ");
		int second = input.nextInt();
		if(first >= second) { big = first;  // 첫번째로 입력한 숫자가 두번째로 입력한 숫자보다 
		small = second;     // 크거나같다면 first를 big에 대입,second를 small에 대입
		}else {
			big = second; // 나머지 경우는 반대로 
			small = first; 
			} 
		while(true) { 
			m = big/small;      // if를 써서 큰 숫자는 작은 숫자로 어떻게든 나눠지게 됨 그게 몫이 됨
			n = big-m*small;    // 나머지는 큰 숫자에서 몫과 작은 숫자를 곱한값을 빼면 나옴
			if(n==0) { a = small; 
			b = (first*second)/a;  // 첫번째 입력값과 두번째 입력값을 곱한값을 최대공약수로 나눠주면 최소공배수가 나옴
			
			System.out.println("최소공배수: "+b); 
			break; 
			} 
			big = small;
			small = n; 
			} 	
		
		
		*/
		
		
		
		
		
		
		
		/*
		
		Scanner input = new Scanner(System.in);
		int big, small;   
		int a; int m, n;  //a를 최대공약수로 설정, m은 몫, n은 나머지로 설정
		System.out.print("첫번째 수 입력 > ");
		int first = input.nextInt();
		System.out.print("두번째 수 입력 > ");
		int second = input.nextInt();
		if(first >= second) { big = first;  // 첫번째로 입력한 숫자가 두번째로 입력한 숫자보다   									
		small = second;        // 크거나같다면 first를 big에 대입,second를 small에 대입 
		}else {
			big = second; // 나머지 경우는 반대로 
			small = first; 
			} 
		while(true) { 
			m = big/small; // if를 써서 큰 숫자는 작은 숫자로 어떻게든 나눠지게 됨 그게 몫이 됨
			n = big-m*small; // 나머지는 큰 숫자에서 몫과 작은 숫자를 곱한값을 빼면 나옵니다.
			if(n==0) { a = small; // 최대공약수가 나올때 까지 while문을 설정해주면 됩니다. 
			
			System.out.println("최대공약수: "+a);
		 
			break; 
			} 
			big = small; 
			small = n;
			} 
		 
	
*/
		


		
		
		
	
		
		/*
	
		//15
		
		
		String temp = "5*7.5";
		String result = "";
		result = temp.substring(0);
				System.out.println(result);
				
				result = temp.substring(0, 5);
				System.out.println(result);
				result = temp.substring(temp.indexOf("5"));
				result = result.substring(0);
				System.out.println(result);
				
						
		
		
		// 한줄씩 뽑아내서 직접 계산 
				

		
		*/

		
		/*

		  
		  
		  
		  
		  
		  String text = "-31.5123214234235345352345234543"; 
		System.out.println(text);
		System.out.println(Float.parseFloat(text));
		Double d =Double.parseDouble(text); 
		System.out.println(d);
		System.out.println(d.intValue());
		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);
		  
		  
		  
		  
		  
		  
		  
		  
		int menu;
		int Kmoney=1500;
		double dollar=1.36;
		
		Scanner input = new Scanner(System.in);
		System.out.println("원화 입력 : ");
		Kmoney = input.nextInt();
		System.out.printf("달러로 변환하면 : %.2f",(double)Kmoney/dollar);
		
		위아래 결합해보기
		
		while (true) {
			System.out.println("#Menu");
			System.out.println("1.korea");
			System.out.println("2.Europe");
			System.out.println("0.Exit");
			System.out.println("-->");
			menu = sc.nextInt();
				if(menu == 0) { 
					break; 
		
		
		
		
		
		
		
		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		
		
		char[] c = text.toCharArray();
		System.out.println(c[0]);
		
		System.out.println(text.replace("H","h"));
		
		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		 
		 설명필요 
		 
		
		*/
		
		
		
		

		
		
		
		
		/*//세계시간
		TimeZone time;
		Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				time = TimeZone.getTimeZone("Asia/Seoul");
				dateFormat.setTimeZone(time);
				System.out.println(time.getDisplayName() + ":" + dateFormat.format(date));
				
				time = TimeZone.getTimeZone("Europe/Copenhagen");
				dateFormat.setTimeZone(time);
				System.out.println(time.getDisplayName() + ":" + dateFormat.format(date));
			*/	
				
		
		
		
		
		
		/*
		int a = 3;
			if (a ==3) {
		System.out.println("yes"); 
	} else { 
		System.out.println("no");
	}
	
	boolean check = false
	
	if(check == false){
			int b = (check == false) ? 50: 40;
			sysout(b) 
			}


		
}
		*/
		
		
		

		
		
		// lotto
		/*
	int a =0, b=0, c=0, d=0, e=0, f=0; 
	
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(true) {
		double temp = Math.random()*45;
		int temp2 = (int) Math.round(temp);
		
		if(cnt ==0) {
			a= temp2; 
			cnt++;
		} else if(cnt ==1) {
			if(a != temp2) { 
				b = temp2; 
				cnt++; 
							}
		
		}else if(cnt == 2) { 
			if(a != temp2 && b != temp2) {
				c= temp2; 
				cnt++; 
				
			}
		}else if(cnt == 3) { 
			if(a != temp2 && b != temp2 && c != temp2) {
				d= temp2; 
				cnt++; 
			}
		}else if(cnt == 4) { 
			if(a != temp2 && b != temp2 && c != temp2 && d != temp2  && e != temp2) {
				e= temp2; 
				cnt++; 
		
			}
		}else if(cnt == 5) { 
			if(a != temp2 && b != temp2 && c != temp2 && d != temp2  && e != temp2 && f !=temp2) {
				f= temp2; 
				cnt++; 
				
			}
			}else {
				break;
				
			}
					
		System.out.println("a = " + a );
		System.out.println("b = " + b );
		System.out.println("c = " + c );
		System.out.println("d = " + d );
		System.out.println("e = " + e );
		System.out.println("f = " + f );
		}
		
		*/
		
		
		/*	
		 * 
		 * inta =0 ,b= 0 ,c=0 ;
		 int cnt = 0;
		 while(true){
		
		double temp = Math.random()*45;
		int temp2 = (int)Math.round(temp);
		 
		 if(a ! = temp2 && b ! = 
		
		
				
		
	
		System.out.println(temp);
		System.out.println((int)temp);
		
		
		int temp() = new int(6);
				System.out.println(lotto);
		
		*/
		
		
		
		
		
		
		
		/*
		
		
		
		
		
			System.out.println(Math.min(3, 13));
		System.out.println(Math.max(123,54));
		System.out.println(Math.abs(-23.1));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.random());
		
		
		
		
		
		
		
		Calendar calendar = Calendar .getInstance(); 
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH,calendar.FEBRUARY);
	System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	calendar.set(Calendar.YEAR,2021);
	calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
	calendar.set(Calendar.DATE, 1);
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	
	

	
	
	
	*/
	
	
	
		
		
		
//p4
		/*
		Calendar calendar = Calendar .getInstance(); 
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
		
		
		System.out.println(calendar.get(Calendar.MONTH)+80);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)+18);
		
		
		*/
		
		
		/*
		String temp ="school";
		int count =0; //number of 'o'
		int sum =0; // number of ' a' and 'h'
		for (int i = 0; i <temp.length(); i++){ 
		if(temp.charAt(i) == 'o') { 
			count++;
			
		}
		
		if (temp.charAt(i) == 'o' || temp.charAt(i) == 'h') { 
			sum++;
			
		}
		
		System.out.println(count);
		System.out.println(sum);
		
		
		}
		
		
		
		
		
		
		
		
		
		String text =sc.next();
		
		
		for(int i =0 ; i < text.length(); i++) {
			char uniVal = text.charAt(i);
			
			if(uniVal >= 0xAC00) { 
				System.out.print(uniVal + "=>");
				
				
				
				
				
			}
			
			
			
			
			
		}
		
		
	
		
		
		
		
		
/*	
		Scanner sc = new Scanner(System.in);
		
		 String text = sc.next();                  
	      for(int i=0; i<text.length(); i++) {         //text의 길이만큼 반복되게 한다.
	         if(text.charAt(i)>=(int)'A' && text.charAt(i)<=(int)'Z') { // text의 첫자부터 대소문자 구분 
	            System.out.print((char)(text.charAt(i)+32));         // 대문자라면 소문자로 변경 후 출력하고
	         } else if(text.charAt(i)>=(int)'a' && text.charAt(i)<=(int)'z')   {
	            System.out.print((char)(text.charAt(i)-32));         // 소문자면 대문자로 변경 후 출력
	         }
	      }
		
		

		
		
	
	

				
		
		
		/*
		 * 
		 * int a;
				for(a=5; a<10; a++) {
					System.out.println(a);
		
				}
				
				
				
		int temp = (int)'z';
		System.out.println(temp);
		
		temp++;
		System.out.println(temp);
		
		char temp2 = (char)97;
		System.out.println(temp2);
		
		for(int a=97; a<=temp; a++) {
			System.out.println((char)a);
		}
		
		
		byte a1 ='a';
		byte a2 ='A';
		
		
		System.out.println(a1); 
		System.out.println(a2);
		
		
		
		
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((char)('b'-32));
		System.out.println((char)'b');
		
		
		
		String strStartDate = "20200212";
        String strEndDate = "20200203";
        String strFormat = "yyyyMMdd";    //나타낼 형식을 나타내줌
        
        
        SimpleDateFormat sc = new SimpleDateFormat(strFormat);
     
        try{
            Date startDate = sc.parse(strStartDate);
            Date endDate = sc.parse(strEndDate);
 
          
            long diffDay = (startDate.getTime() - endDate.getTime()) / (24*60*60*1000);
            //두날짜 사이의 시간 차이를 하루인 (24시*60분*60초*1000밀리초) 로 나눈다.
            System.out.println(diffDay);
        }catch(ParseException e){
            e.printStackTrace();
        }
    
    
    int a = sc.nextInt();
		for(int i =a; i>0;i--){
			System.out.println(i);
			
		int start = 2 * i -1;
		int blank = a -1;
		
		for(int x = 0; x <blank;x++){
			System.out.println("");
		}
			for(int j =0; j < start; j++){
				System.out.println("*");
			}
			System.out.println("\n");
			
		}
    
		
		// 정수 n 입력받아서 계산 
       
  int n = sc.nextInt();
  int sum =0;
  for (int i = 0; i <n; i++) { 
	  sum = sum + sc.nextInt();
  } 
  System.out.println(sum);
		
		
		
*/
		
	
	
		
		
		
	}

}
