
public class TvTest {
	
	public static void main(String[] args) {

		int sum= 0; // 지역변수 지역변수는 강제초기화시켜서 시작값이있어야된다 멤버변수는 자동초기화됨
		
		sum += 10;
		
//    System.out.println(new Tv());
//    new Tv() 생선된 Tv객체의 첫번째 멤버의 주소값
		
	

//		new Tv().power = true;
//		new Tv().channel = 10;
       
		Tv t = new Tv();//참조변수 (==주소값)
//		System.out.println(t);
	    t.power = true;
	    t.channel = 10;
	    System.out.println(t.channel);
	    
	    t.channelDown();
	    System.out.println(t.channel);
	    
	    Tv t2 = new Tv();
	    t.channel= 20;
	    
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	    t2.channelDown();
	    
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	
	    t2 = t; // 두 참조변수의 타입이 동일한 경우만 가능
	    
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	    t.channelDown();
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	
	}

}
