
public class DataTest {

	public static void main(String[] args) {
		
		Data d =new Data(); // ox100
//		d.x = 10;
//		
//		Data d2 = copy(d);
//		
//		System.out.println(d.x); //10
//		System.out.println(d2.x);//10 ���� ���� 10���ƴϴ�.
//		
//		
//		} 
//		
//		static Data copy(Data d) {
//			
//			Data tmp =new Data();// ox200
//			tmp.x= d.x;
//			
//			return tmp;
//		}
		
		
		
		
		
		
		
		
		d.x = 10;
		System.out.println(d.x);
		
		change(d.x);
		System.out.println(d.x);

		d.x= 10;
		System.out.println(d.x);
		
		change(d.x);
		
		System.out.println(d.x);
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : "+ x);
	}


 //                      ������ -> �迭�� ������������
//    static void change(Data d) {//�Ű����� Data d�� �ּҰ����޴´�
//      d.x = 1000;
//      System.out.println("change() : "+ d. x);
    	//���� ->�⺻��
    	//���� ->Ŭ����Ÿ��
        // int ->�⺻�� int[] ->������Ÿ��
       	
}