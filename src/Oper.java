import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
       //산술연산자
	   //+,-,*,/(몫),%(나머지)

//		int x = 5;
//		int y = 2;
//		System.out.println(x/y); // 2
//		System.out.println(x%y); // 1
	
		
//		int x = 5;
//		
//		//상수
//		final double PI = 3.14;
//		PI = 2.34; 변경이불가
//		System.out.println(PI);
		
		//형변환(자료형 or 데이터타입)
		//int -> double
		//boolean은 제외
		//--------------------------------------> 자동형변환
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//강제형변환 <------------------------------
		//    char(2)        <
		
//		byte b = 85;
//		int i = b;   자동형변환
		
//		int i = 85;
//		byte b =(byte)i; //강제형변환

//		int i = 300;
//		byte b = (byte)i;
//		System.out.println(b); //강제형변환(값의손실)

//        double d = 3.14;
//        int i = (int)d;
//        System.out.println(i);
		
//		  int i = 3;
//		  double d = i;
//          System.out.println(d);		

//		 byte b = 65;
//     	 char c = (char)b;
//     	 System.out.println(c);
		
//		int x = 10;
//		int y = 20;
//		int result = x + y; // 30
		
//		byte b1 = 10;
//		byte  b2 = 20;
//		byte result = (byte)(b1 +b2); // byte b =(byte)(int + int) (계산과정에서 int형으로바꿔서 계산x)

//		연산시 int보다 작은 정수타입은 모두 int형으로 자동형변환된다
//		byte + byte -> int + int
//		byte + short -> int + int 
//		char + byte -> int + int 
		
//     	int + long -> long + long
//     	int + float -> float + float
//     	float + double -> double + double 
		
//		int x = 5;
//		int y = 2;
//		double result = x / y; // 2.0
//		double result = x % y; // 1.0
//		System.out.println(result);
	
//		int x = 3;
//		int y = 5;
//		double result = (double) x / y; // 3.0 / 5.0  ->0.6   
//		System.out.println(result);
     	
//        String str = "java";
//        double ver = 1.8;
//        String result = str + ver; // "java" + "1.8" -> "java1.8"
//        System.out.println(result);
        
        //String + anyType -> String
        //String + double -> String + String -> String
 	
		// + => 산술, 연결, 부호 
		
		//증감연산자 : 값을 1증가 ,값을 1감소
		// ++ , --
		//변수에만 사용가능
		//전치 , 후치 
		
//		int x = 10;
//		++x; // x++
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		x--;
//		System.out.println(x);
		
//		int x = 10;
//		int y = 0;
//
//		y = x++ + 10; // x = 11 y = 20
//		System.out.println("x = "+ x +","+"y ="+ y);
//		
//		y = ++x + 10; // x = 11 y = 21
//		System.out.println("x = "+ x +","+"y ="+ y);
		
		//대입연산자
		//변수에 사용되는 연산
		
		// = , += , -= , *= , /= , <<= , |= ...... 
		
//		int a = 10;
//		
//		int x = 10;
//		x += 10; // x = x + 10
//		System.out.println(x);
//		
//		x -= 10;
//		System.out.println(x);
//		
//		x *= 2;
//		System.out.println(x);
		
	   //비교연산자
       // 5 > 3
	   // < , > , <= , >= , == , !=  (=은 항상오른쪽)
	   //true false
		
//		int x = 10;
//		int y = 20;
		
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);
//		System.out.println(x == y);
//		System.out.println(x != y);
		
		//논리연산자
		//&&(and) , ||(or) , !(not)
		// 두가지 이상의 조건을 확인할때 사용한다
//		int x = 10;
//		int y = 20;
//		int z = 30;
		
//		System.out.println(x == 10);
//	    System.out.println(y == 20);

//      x == 10 && y == 20 // true && true   => true
//		System.out.println( x == 10 && y == 20); // true && true => true
//		System.out.println( x == 10 && y == 30); // true && false => false
//      System.out.println( x == 50 && y == 30); // false && false => false
//		System.out.println(x == 10 && y == 20 && z == 30);
//		System.out.println(x == 10 && y == 20 && z == 40);
        
//      true && true => true
//      true && false => false
//      false && true => false
//      false && false => false
		
//		int x = 10;
//		int y = 20;
//		int z = 30;
//		System.out.println(x == 10 || y == 20);
//		System.out.println(x == 30 || y == 20);
//		System.out.println(x == 30 || y == 50);
		
//      true || true => true
//      true || false => true
//      false || true => true
//      false || false => false
		
//		!true -> false
//		!false -> true
		
//		int x = 10;
//		
//		System.out.println(!(x == 10));
//		
//	    3.45 < = 2 double <= int -> double <= double ->double
		
//		조건연산자(삼항연산자)
//		조건식                     ?  결과1 :  결과2
//      (true or false) ? (true) (false)
		
//		int x = 10;
//		int y = 20;
//		
//		int result = (x > y) ? x : y ;
//		System.out.println(result);
	
//	    int age = 20;
//	    String rs = (age >= 20) ? "성인입니다" : "미성년 입니다";
//	    System.out.println(rs);
//	   (문제) 456 -> 400 , 111 -> 100
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("백의 자리숫자를 입력하세요: ");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("입력받은 값: " + num);
//	    System.out.println("연산되어진 결과:" +num / 100 * 100); //456 / 100 -> 4 * 100 -> 400
	
//     (문제) 333 -> 331 , 777 -> 771
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("백의 자리숫자를 입력하세요: ");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("입력받은 값: " + num);
//	    System.out.println("연산되어진 결과:" +(num / 10 *10 +1));
	
	    
//      10의 배수
//	    19 -> 20 , 81 -> 90
//	    Scanner sc =new Scanner(System.in);
//	    System.out.print("숫자를 입력하세요:");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("입력받은 값: " + num);
//	    System.out.println("연산되어진 결과:" +(num /10 *10 +10 ));  
//		
//      19 -> 20 -> 1 ,81 -> 90 , 24 -> 6	    
//		Scanner sc = new Scanner(System.in);
//		System.out.print("십의 자리숫자를 입력하세요: ");
//	    int num = sc.nextInt(); 
//	    
//	    System.out.println(10 - num % 10);
	
//	   연습문제
//		사과의 갯수를 입력받는다.
//		한 바구니에 10개의 사과를 담을수 있다
//		그럼  몇개의 바구니가 필요할까요
//		123 -> 13개 , 456 -> 46개
//		xx개의 바구니가 필요합니다.
//		총 사과의 개수는 123개이며 바구니는 13개 필요합니다.
		
//		Scanner sc =new Scanner(System.in);
//		System.out.print("사과의 개수를 입력하세요:");
//		int num = sc.nextInt();
//		
//		System.out.println("입력받는 값:"+num);
//		System.out.println("연산되어진 결과:"+(num/10+1));
//		String str =sc.nextLine();
//		System.out.println();         //내가한거
//		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		해설
//		Scanner sc =new Scanner(System.in);
//		System.out.print("사과의 개수를 입력하세요:");
//		int appleNum = sc.nextInt();
//		
//		int bucketNum =appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("사과의 개수:"+ appleNum);
//		System.out.println("바구니의 개수:"+ bucketNum);
		
//		int x = -3;
//	    System.out.println(x >= 0 && x <= 10);
//	    System.out.println(!(x > 0 && x < 10));
//	    System.out.println(x <= 0 || x >= 10);
//		
		
		
		
	
	}
	
	
	
	
	
	

}
