
public class TvTest {
	
	public static void main(String[] args) {

		int sum= 0; // �������� ���������� �����ʱ�ȭ���Ѽ� ���۰����־�ߵȴ� ��������� �ڵ��ʱ�ȭ��
		
		sum += 10;
		
//    System.out.println(new Tv());
//    new Tv() ������ Tv��ü�� ù��° ����� �ּҰ�
		
	

//		new Tv().power = true;
//		new Tv().channel = 10;
       
		Tv t = new Tv();//�������� (==�ּҰ�)
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
	
	    t2 = t; // �� ���������� Ÿ���� ������ ��츸 ����
	    
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	    t.channelDown();
	    System.out.println(t.channel);
	    System.out.println(t2.channel);
	
	}

}
