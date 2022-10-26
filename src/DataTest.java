
public class DataTest {

	public static void main(String[] args) {
		
		Data d =new Data(); // ox100
//		d.x = 10;
//		
//		Data d2 = copy(d);
//		
//		System.out.println(d.x); //10
//		System.out.println(d2.x);//10 같은 곳에 10은아니다.
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


 //                      참조형 -> 배열도 참조형에들어간다
//    static void change(Data d) {//매개변수 Data d는 주소값을받는다
//      d.x = 1000;
//      System.out.println("change() : "+ d. x);
    	//복사 ->기본형
    	//참조 ->클래스타입
        // int ->기본형 int[] ->데이터타입
       	
}