
public class Func {

	//�޼ҵ�(�Լ�) : ��ü�Ǳ���� �����Ѵ�

//    ����Ÿ�� �޼ҵ��() [�Ű�����1, �Ű�����2,..]){
//    	���๮��
//    	[return ��]
//    }
	
	//����Ÿ�� : void, �⺻�ڷ���,������
	//�޼ҵ�� : ��Ÿǥ���
	//�Ű����� : intx, double d, Tv t -> �⺻�� ,������
	//return : ����Ÿ���� void�� �ƴ� ��쿡 ����Ѵ�.
	
	void add() { //�޼ҵ��� �����(�ñ״�ó)
		System.out.println(2+3); // �޼ҵ��� ������
	}
	
	
	 void add2(int x, int y) {
		 System.out.println(x + y);
	 }
	
	 int add3(int x, int y) {
		  int sum = x + y;
		  return sum;
	 }
	
	
//	 void sub() {
//		 System.out.println(5-3);
//	 }
//	 
//	 void sub2(int x, int y) {
//		 System.out.println(x - y);
//	 }
//	
//	 int sub3(int x, int y) {
//		 int sub = x - y;
//		 return sub;
//	 }
     int sub(int x, int y) {
    	 int sub = x - y;
    	 return sub;
     }
	 int mul(int x, int y) {
		 int mul = x * y;
		 return mul;
	 }
	 double div(double x,double y) {
		 double div =x / y;
		 return div;
	 }
	
	 void test(int x, int y) {
		 if(x < y) {
			 System.out.println("�Լ��� ����");
			 return; //�Լ��� ��� ���� -void������ return������ϸ� ��� �����Ŵ
		 }
		 
		 int result = x + y;
		 System.out.println(result);
	 }
	  int test2(int x ,int y) {//���� �ΰ����⺸�ٴ� �����̿��Ͽ� �����ϳ��θ���� ���
		  
		  int result;
		  
		  if(x > y) {
			  result = x;
		  }else {
			  result = y;
		  }
		  return result;
	  }
	 
	  void call1() {
		  System.out.println("call1");
		  call2();
	  }
	
	  void call2() {
		  System.out.println("Call2");
		  call3();
	  }
      
	  void call3() {
		  System.out.println("Call3");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

