import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
	 //반복문 : 실행문을 여러번 동작하게 한다.
	 //for , while , do-while
		
//	for(초기값;조건식;증감식) {
//		실행문
//	}
		
//	for(int i = 0; i<10; i++) { //0,1,2,3,4,5,6,7,8,9
//		System.out.println(i + ": hello");
//	}
//	for(int i =0; i<10; i+=2) {   //0,2,4,6,8
//		System.out.println(i+": hello");
//	}

//	for(int i =10; i>0; i--) { //10,9,8,7,6,5,4,3,2,1
//		System.out.println(i + ": Hello");
//	}

//	for(;true;) { //무한반복문
//		System.out.println("hello");
//	}
    
//	    int k = 1;
//		
//		for(int i =1; i <= 10; i++) {
//    	System.out.println(k++);
//    }
		
//	//1 ~ 10사이의 정수값중에 짝수 출력
//		for(int i=1; i % 2==0 && i<=10; i++ ) {
//			System.out.println(i);//내가한거
//		}
//			//			
			
	//해설
//		for(int i= 1; i <=10; i++) {
//		if( i % 2 == 0) {
//			System.out.println(i);
//		}
		
		//1 + 2 + 3+ +10 => 55
				
//		int sum = 0;
//		
//		for(int i = 1; i <=10; i++) {
//			sum += i; //sum = sum + i;
//		}
//	    System.out.println(sum);
		
//		(문제) 1~ 10 까지의 정수중에 홀수에 합과 짝수에 합을 각각 구해서 출력
		
//		for(int i = 1; i <= 10; i++) {
//		if(i % 2 == 0)	{
//		
//			int sum =0;
//			sum +=i;
//			System.out.println(sum);
//			
//		    (해설)
//            int odd = 0;
//            int even= 0;
//            for(int i =1; i <= 10; i++) {
//			if(i % 2 == 1) {
//		        odd += i;
//			}else {
//				even += i;
//			}
//		}
//	
//            System.out.println("홀수 : "+ odd);
//            System.out.println("짝수 : "+ even);
		
//		초기값   
//		while(조건식) {
//		         실행문 
//		         증감식
//          }

//	    int i = 1;
//	    while(i <= 10) {
//	    	System.out.println(i);
//	    	i++;
//	    }
	
//       int i = 10;
//       while (i > 0) {
//    	  System.out.println(i); 
//    	  i--;
//       }
		
//		int sum = 0;
//		int i = 1;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		
//		}
//		
//		System.out.println(sum);
		
//		while(true) {
//			System.out.println("hellow");
//		}

//		boolean flag = true;
//		int cnt = 0;
//		while(flag) {
//		
//			
//			cnt++;
//			System.out.println(cnt);
//			
//			if(cnt > 200) {
//				flag = false;
//			}
//		}
	
//		for() { //n = 5   n x m -> 5 x 5 = 25
//			for(){ //m = 5
//			     실행문
//			}
//		}
//        int k = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j =0; j < 5; j++) {
//				System.out.println(k++);
//			}
//		}
//		
		
//		for(int i = 2; i<=9; i++) {
//			for(int j=1; j<= 9; j++) {
//				System.out.println(i + "x" + j + "="+ i*j);
//			}
//		System.out.println("===");
//		}     혼자다시해보기
		
//		for(int i = 1; i<=9; i++) {
//			for(int j = 2; j<=9; j++) {
//				System.out.print(j+ "*" + i + "=" + j *i+ " " );
//				
//			}
//			System.out.println();
//		}
		
//		초기값1
//		while(조건식) {
//			초기값2
//			while(조건식) {
//				실행문
//                 증값식2;
//			}
//			증값식1
//		}
//		
		
//        int k  = 1;
//		  int i  = 0;
//        while (i<5) {
//    	  int j = 0; // 위치중요
//    	  while (j<5) {
//    		  System.out.println(k++);
//    		  j++;
//    	  }
//    	  
//    	  i++;
//      }
//		//구구단 while문으로 작성법
//		int i =2;
//		while (i <= 9) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.println(i+"x" + j +"="+ i*j);
//			j++;
//			}
//		i++;
//		}   //내가한거
		
	
//		//for문 다른방식의 중첩방법
//		for(int i = 0,j =10; i <10; i++,j--) {
//			System.out.println("i :" + i + "," + "j :" + j);
//		}
		
//		int s = 0;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i :" + i + "," + "s :" + s);
//		}
//		System.out.println(i);
		
		//do while문
//		초기값
//		do {
//			실행문
//			증감식
//		}while(조건식);
		
//		int i =1;
//		do {
//			System.out.println(i);
//			i++;
//		}while( i<=10);
	
//	   (문제)
//		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 출력
//		int sum = 0;
//		int tot = 0;
//		for(int i=1; i<=10;i++) {
//			sum += i; // (0+1) (0+1+2) (0+1+2+3)
//			tot += sum;
//		}
//		
//		System.out.println(sum);
//		System.out.println(tot);
		
//	       반복문의 제어
//	    break ,continue
//	       조건문안에서 사용한다.
	
	    for(int i = 1; i<=10; i++) {
	    	if(i % 5==0) {
	    		break; //반복문의 종료
	    	}
	    	System.out.println(i);
	    }
//	
//	   int k=1;
//	   for(int i =0; i < 5; i++) {
//		   System.out.println("i = "+i);
//		   for(int j = 0; j <5; j++) {
//			   System.out.println("k="+ k++);
//			   if(k % 3 == 0) {
//				   break;
//			   }
//			   
//		   }
//	   }
//		
//		i j k
//		0 0 1
//	    0 1 2
//	    0 2 3
//	    1 0 3

//	   for(int i = 1; i<=10; i++) {
//		
//		   if(i<=0) 
//		{
//			continue;
//		}
//		System.out.println(i);
//	}
//     (문제) 
//	    12345 -> 1+2+3+4+5 -> 15
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		
//		int sum = 0;
//		
//		while( num > 0) {
//			sum += num % 10;
//			num /= 10; //(num = num / 10;)
//		}
//		
//		System.out.println(sum);
		
//		12345  % 10 -> 5
//		12345  / 10 -> 1234
//		1234   % 10 -> 4
//		1234   / 10 -> 123
//		123    % 10 -> 3
//		123    / 10 -> 12
	
//  (문제) 
//		방정식 2x+4y=10의 모든 해를 구하시오. 단, x와y는 정수이고 각각의 범위는
//		0<=x<=10, 0<=y<=10이다
		

//       for(int y = 0; y<3; y++) {
//    	   10- 4*y >0
//       }
//	(해설)	for(int x = 0; x <= 10; x++) {
//			for(int y = 0; y <= 10; y++) {
//				if(2*x + 4*y == 10) {
//					System.out.println(x +","+y );
//				}
//			}
//				}

		
		
//		[실행결과]
//				x=1, y=2
//				x=3, y=1 
//				x=5, y=0
//				
				
// 	 (문제)
//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 떄 , 몇까지 더해야 총합이
//		100이상이 되는지 출력하세요
		
//		int sum = 0;
//		int num = 1;
//		while (int num>1;, ) {
//			if(sum>100) {
//				break;
//			}
//			System.out.println(num);
//		}
		
//		int sum = 0;
//		int s = 1;
//		int num =0;
//		int i;
//		for( i = 1;true; i++, s=-s) {
//			num = s * i;
//			sum += num;
//			if(sum>=100) {
//				break;
//			
//			}
//		}
//		System.out.println(sum +","+ i);
		
//		Scanner sc =new Scanner(System.in);
//		
//		int sel;
//		
//		while(true) {
//			System.out.println("번호를 선택하세요");
//			System.out.println("1.빨간색 2.녹색 3.파란색4.종료");
//			sel=sc.nextInt();
//			
//			if(sel == 1) {
//			  System.out.println("빨간색 선택");	
//			}else if(sel == 2) {
//				System.out.println("녹색 선택");
//			}else if (sel == 3) {
//				System.out.println("파란색 선택");
//			}else if(sel == 4) {
//				break;
//			}
//		}
//		
		
//            난수(랜덤)
//		Math.random() //0.0 <=r <1.0 ->0.0~0.999999
		
//		System.out.println(Math.random());
		
//		Math.random() * 10 //0.0 ~ 9.99....
//		(int)(Math.random()) * 10 // 0~9
//		(int)(Math.random()) * 10 + 1 // 1~10
//       System.out.println((int)(Math.random() * 10)+ 1);		
		
//		567~58940389
//        (int)(Math.random()) * 난수의 개수(난수의 최대값 -난수의최소값 +1)) + 난수의최소값		
		
//		(int)(Math.random()*3)+1
		
//		(기본문제)
//		int com;
//		int me;
//		
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.가위2.바위3.보:");
//			me= sc.nextInt();
//			
////			//System.out.println("com = "+com+", me ="+ me);
//			int result = com -me;
//			if(result == -1 || result ==2) {
//				System.out.println("you win");
//				break;
//			}else if(result == 0) {
//				System.out.println("tie break");
//			}else {
//				System.out.println("you lose");
//			}
//			
//		}
//		(변형문제)
//		int com;
//		int me;
//		int correctCnt= 0;
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//		com = (int)(Math.random()* 3) +1;
//		System.out.println("1.가위2.바위3.보:");
//		me= sc.nextInt();
//		
//		//System.out.println("com = "+com+", me ="+ me);
//		int result = com -me;
//		if(result == -1 || result ==2) {
//			System.out.println("you win");
//			correctCnt++;
//			System.out.println("이긴횟수: "+ correctCnt +"회");
//			if(correctCnt == 3) {
//				break;
//			}
//		}else if(result == 0) {
//			System.out.println("tie break");
//		}else {
//			System.out.println("you lose");
//	          
//		}
//	}
//		(내가변형)
//		int com;
//		int me;
//		int correctCnt = 0;
//		int pn=1;
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.가위2.바위3.보:");
//			me= sc.nextInt();
//			
////			//System.out.println("com = "+com+", me ="+ me);
//			int result = com -me;
//			if(result == -1 || result ==2) {
//				System.out.println("you win");
//				correctCnt++;
//				pn++;
//				System.out.println("이긴횟수: "+ correctCnt +"회");
//				if(correctCnt==1 || pn<=3  ) {
//					break;
//				}
//				System.out.println();
//			}else if(result == 0) {
//				System.out.println("tie break");
//			}else {
//				System.out.println("you lose");
//			}
//			
//		}
//		(변형 정답)
//		int com;
//		int me;
//		int correctCnt = 0;
//		int challengesCnt =0;
//		
//		Scanner sc=new Scanner(System.in);
//		
//		
//		
//		while(true) {
//			challengesCnt++;
//			if(challengesCnt ==4) {
//				System.out.println("3번의 도전기회를 다 사용하셨습니다.");
//			     break;
//			} 
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.가위2.바위3.보:");
//			me= sc.nextInt();
//			
//
////	       //System.out.println("com = "+com+", me ="+ me);
//			
//			int result = com -me;
//			if(result == -1 || result ==2) {
//				System.out.println("you win");
//				correctCnt++;
//				System.out.println("이긴횟수:"+correctCnt+ "회");
//				if(correctCnt == 1) {
//					break;
//				}
//			}else if(result == 0) {
//				System.out.println("tie break");
//			}else {
//				System.out.println("you lose");
//			}
//			
//		}
//		
		
		
		
		
		
		
		
		
		//내가 win
		//내가lose
		//둘이 tie
	}
}

