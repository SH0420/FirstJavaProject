import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
       //���������
	   //+,-,*,/(��),%(������)

//		int x = 5;
//		int y = 2;
//		System.out.println(x/y); // 2
//		System.out.println(x%y); // 1
	
		
//		int x = 5;
//		
//		//���
//		final double PI = 3.14;
//		PI = 2.34; �����̺Ұ�
//		System.out.println(PI);
		
		//����ȯ(�ڷ��� or ������Ÿ��)
		//int -> double
		//boolean�� ����
		//--------------------------------------> �ڵ�����ȯ
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//��������ȯ <------------------------------
		//    char(2)        <
		
//		byte b = 85;
//		int i = b;   �ڵ�����ȯ
		
//		int i = 85;
//		byte b =(byte)i; //��������ȯ

//		int i = 300;
//		byte b = (byte)i;
//		System.out.println(b); //��������ȯ(���Ǽս�)

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
//		byte result = (byte)(b1 +b2); // byte b =(byte)(int + int) (���������� int�����ιٲ㼭 ���x)

//		����� int���� ���� ����Ÿ���� ��� int������ �ڵ�����ȯ�ȴ�
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
 	
		// + => ���, ����, ��ȣ 
		
		//���������� : ���� 1���� ,���� 1����
		// ++ , --
		//�������� ��밡��
		//��ġ , ��ġ 
		
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
		
		//���Կ�����
		//������ ���Ǵ� ����
		
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
		
	   //�񱳿�����
       // 5 > 3
	   // < , > , <= , >= , == , !=  (=�� �׻������)
	   //true false
		
//		int x = 10;
//		int y = 20;
		
//		System.out.println(x < y);
//		System.out.println(x > y);
//		System.out.println(x <= y);
//		System.out.println(x >= y);
//		System.out.println(x == y);
//		System.out.println(x != y);
		
		//��������
		//&&(and) , ||(or) , !(not)
		// �ΰ��� �̻��� ������ Ȯ���Ҷ� ����Ѵ�
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
		
//		���ǿ�����(���׿�����)
//		���ǽ�                     ?  ���1 :  ���2
//      (true or false) ? (true) (false)
		
//		int x = 10;
//		int y = 20;
//		
//		int result = (x > y) ? x : y ;
//		System.out.println(result);
	
//	    int age = 20;
//	    String rs = (age >= 20) ? "�����Դϴ�" : "�̼��� �Դϴ�";
//	    System.out.println(rs);
//	   (����) 456 -> 400 , 111 -> 100
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("���� �ڸ����ڸ� �Է��ϼ���: ");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("�Է¹��� ��: " + num);
//	    System.out.println("����Ǿ��� ���:" +num / 100 * 100); //456 / 100 -> 4 * 100 -> 400
	
//     (����) 333 -> 331 , 777 -> 771
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("���� �ڸ����ڸ� �Է��ϼ���: ");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("�Է¹��� ��: " + num);
//	    System.out.println("����Ǿ��� ���:" +(num / 10 *10 +1));
	
	    
//      10�� ���
//	    19 -> 20 , 81 -> 90
//	    Scanner sc =new Scanner(System.in);
//	    System.out.print("���ڸ� �Է��ϼ���:");
//	    int num = sc.nextInt();
//	    
//	    System.out.println("�Է¹��� ��: " + num);
//	    System.out.println("����Ǿ��� ���:" +(num /10 *10 +10 ));  
//		
//      19 -> 20 -> 1 ,81 -> 90 , 24 -> 6	    
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���� �ڸ����ڸ� �Է��ϼ���: ");
//	    int num = sc.nextInt(); 
//	    
//	    System.out.println(10 - num % 10);
	
//	   ��������
//		����� ������ �Է¹޴´�.
//		�� �ٱ��Ͽ� 10���� ����� ������ �ִ�
//		�׷�  ��� �ٱ��ϰ� �ʿ��ұ��
//		123 -> 13�� , 456 -> 46��
//		xx���� �ٱ��ϰ� �ʿ��մϴ�.
//		�� ����� ������ 123���̸� �ٱ��ϴ� 13�� �ʿ��մϴ�.
		
//		Scanner sc =new Scanner(System.in);
//		System.out.print("����� ������ �Է��ϼ���:");
//		int num = sc.nextInt();
//		
//		System.out.println("�Է¹޴� ��:"+num);
//		System.out.println("����Ǿ��� ���:"+(num/10+1));
//		String str =sc.nextLine();
//		System.out.println();         //�����Ѱ�
//		
//		�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
		
//		�ؼ�
//		Scanner sc =new Scanner(System.in);
//		System.out.print("����� ������ �Է��ϼ���:");
//		int appleNum = sc.nextInt();
//		
//		int bucketNum =appleNum / 10 + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("����� ����:"+ appleNum);
//		System.out.println("�ٱ����� ����:"+ bucketNum);
		
//		int x = -3;
//	    System.out.println(x >= 0 && x <= 10);
//	    System.out.println(!(x > 0 && x < 10));
//	    System.out.println(x <= 0 || x >= 10);
//		
		
		
		
	
	}
	
	
	
	
	
	

}
