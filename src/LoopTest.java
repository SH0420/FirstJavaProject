import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
	 //�ݺ��� : ���๮�� ������ �����ϰ� �Ѵ�.
	 //for , while , do-while
		
//	for(�ʱⰪ;���ǽ�;������) {
//		���๮
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

//	for(;true;) { //���ѹݺ���
//		System.out.println("hello");
//	}
    
//	    int k = 1;
//		
//		for(int i =1; i <= 10; i++) {
//    	System.out.println(k++);
//    }
		
//	//1 ~ 10������ �������߿� ¦�� ���
//		for(int i=1; i % 2==0 && i<=10; i++ ) {
//			System.out.println(i);//�����Ѱ�
//		}
//			//			
			
	//�ؼ�
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
		
//		(����) 1~ 10 ������ �����߿� Ȧ���� �հ� ¦���� ���� ���� ���ؼ� ���
		
//		for(int i = 1; i <= 10; i++) {
//		if(i % 2 == 0)	{
//		
//			int sum =0;
//			sum +=i;
//			System.out.println(sum);
//			
//		    (�ؼ�)
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
//            System.out.println("Ȧ�� : "+ odd);
//            System.out.println("¦�� : "+ even);
		
//		�ʱⰪ   
//		while(���ǽ�) {
//		         ���๮ 
//		         ������
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
//			     ���๮
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
//		}     ȥ�ڴٽ��غ���
		
//		for(int i = 1; i<=9; i++) {
//			for(int j = 2; j<=9; j++) {
//				System.out.print(j+ "*" + i + "=" + j *i+ " " );
//				
//			}
//			System.out.println();
//		}
		
//		�ʱⰪ1
//		while(���ǽ�) {
//			�ʱⰪ2
//			while(���ǽ�) {
//				���๮
//                 ������2;
//			}
//			������1
//		}
//		
		
//        int k  = 1;
//		  int i  = 0;
//        while (i<5) {
//    	  int j = 0; // ��ġ�߿�
//    	  while (j<5) {
//    		  System.out.println(k++);
//    		  j++;
//    	  }
//    	  
//    	  i++;
//      }
//		//������ while������ �ۼ���
//		int i =2;
//		while (i <= 9) {
//			int j = 1;
//			while (j <= 9) {
//				System.out.println(i+"x" + j +"="+ i*j);
//			j++;
//			}
//		i++;
//		}   //�����Ѱ�
		
	
//		//for�� �ٸ������ ��ø���
//		for(int i = 0,j =10; i <10; i++,j--) {
//			System.out.println("i :" + i + "," + "j :" + j);
//		}
		
//		int s = 0;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i :" + i + "," + "s :" + s);
//		}
//		System.out.println(i);
		
		//do while��
//		�ʱⰪ
//		do {
//			���๮
//			������
//		}while(���ǽ�);
		
//		int i =1;
//		do {
//			System.out.println(i);
//			i++;
//		}while( i<=10);
	
//	   (����)
//		1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ���
//		int sum = 0;
//		int tot = 0;
//		for(int i=1; i<=10;i++) {
//			sum += i; // (0+1) (0+1+2) (0+1+2+3)
//			tot += sum;
//		}
//		
//		System.out.println(sum);
//		System.out.println(tot);
		
//	       �ݺ����� ����
//	    break ,continue
//	       ���ǹ��ȿ��� ����Ѵ�.
	
	    for(int i = 1; i<=10; i++) {
	    	if(i % 5==0) {
	    		break; //�ݺ����� ����
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
//     (����) 
//	    12345 -> 1+2+3+4+5 -> 15
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ���");
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
	
//  (����) 
//		������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x��y�� �����̰� ������ ������
//		0<=x<=10, 0<=y<=10�̴�
		

//       for(int y = 0; y<3; y++) {
//    	   10- 4*y >0
//       }
//	(�ؼ�)	for(int x = 0; x <= 10; x++) {
//			for(int y = 0; y <= 10; y++) {
//				if(2*x + 4*y == 10) {
//					System.out.println(x +","+y );
//				}
//			}
//				}

		
		
//		[������]
//				x=1, y=2
//				x=3, y=1 
//				x=5, y=0
//				
				
// 	 (����)
//		1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� �� , ����� ���ؾ� ������
//		100�̻��� �Ǵ��� ����ϼ���
		
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
//			System.out.println("��ȣ�� �����ϼ���");
//			System.out.println("1.������ 2.��� 3.�Ķ���4.����");
//			sel=sc.nextInt();
//			
//			if(sel == 1) {
//			  System.out.println("������ ����");	
//			}else if(sel == 2) {
//				System.out.println("��� ����");
//			}else if (sel == 3) {
//				System.out.println("�Ķ��� ����");
//			}else if(sel == 4) {
//				break;
//			}
//		}
//		
		
//            ����(����)
//		Math.random() //0.0 <=r <1.0 ->0.0~0.999999
		
//		System.out.println(Math.random());
		
//		Math.random() * 10 //0.0 ~ 9.99....
//		(int)(Math.random()) * 10 // 0~9
//		(int)(Math.random()) * 10 + 1 // 1~10
//       System.out.println((int)(Math.random() * 10)+ 1);		
		
//		567~58940389
//        (int)(Math.random()) * ������ ����(������ �ִ밪 -�������ּҰ� +1)) + �������ּҰ�		
		
//		(int)(Math.random()*3)+1
		
//		(�⺻����)
//		int com;
//		int me;
//		
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.����2.����3.��:");
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
//		(��������)
//		int com;
//		int me;
//		int correctCnt= 0;
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//		com = (int)(Math.random()* 3) +1;
//		System.out.println("1.����2.����3.��:");
//		me= sc.nextInt();
//		
//		//System.out.println("com = "+com+", me ="+ me);
//		int result = com -me;
//		if(result == -1 || result ==2) {
//			System.out.println("you win");
//			correctCnt++;
//			System.out.println("�̱�Ƚ��: "+ correctCnt +"ȸ");
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
//		(��������)
//		int com;
//		int me;
//		int correctCnt = 0;
//		int pn=1;
//		Scanner sc=new Scanner(System.in);
//		
//		while(true) {
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.����2.����3.��:");
//			me= sc.nextInt();
//			
////			//System.out.println("com = "+com+", me ="+ me);
//			int result = com -me;
//			if(result == -1 || result ==2) {
//				System.out.println("you win");
//				correctCnt++;
//				pn++;
//				System.out.println("�̱�Ƚ��: "+ correctCnt +"ȸ");
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
//		(���� ����)
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
//				System.out.println("3���� ������ȸ�� �� ����ϼ̽��ϴ�.");
//			     break;
//			} 
//			com = (int)(Math.random()* 3) +1;
//			System.out.println("1.����2.����3.��:");
//			me= sc.nextInt();
//			
//
////	       //System.out.println("com = "+com+", me ="+ me);
//			
//			int result = com -me;
//			if(result == -1 || result ==2) {
//				System.out.println("you win");
//				correctCnt++;
//				System.out.println("�̱�Ƚ��:"+correctCnt+ "ȸ");
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
		
		
		
		
		
		
		
		
		//���� win
		//����lose
		//���� tie
	}
}

