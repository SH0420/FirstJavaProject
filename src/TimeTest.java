
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Time t1, t2, t3;
        Time[] time = new Time[3]; //���������� �迭������°�
		  
        for(int i = 0; i<time.length; i++) {
        	time[i] = new Time();
        }
        
        
        time[0] = new Time();
        time[0].hour = 10;
        time[0].minute = 29;
        time[0].second = 33;
        
        time[1] = new Time();
        time[1].hour = 3;
        time[1].minute = 45;
        time[1].second = 11;
        
        time[2] = new Time();
        time[2].hour = 5;
        time[2].minute = 15;
        time[2].second = 53;
       
//		10�� 29�� 33��
//		3�� 45�� 11��
//		5�� 15�� 53��
//        System.out.print(time[0].hour+"��");
//        System.out.print(time[0].minute+"��");
//        System.out.print(time[0].second+"��");
//        System.out.println();
//        
//        System.out.print(time[1].hour+"��");
//        System.out.print(time[1].minute+"��");
//        System.out.print(time[1].second+"��");
//        System.out.println();
//        
//        System.out.print(time[2].hour+"��");
//        System.out.print(time[2].minute+"��");
//        System.out.println(time[2].second+"��");
        
        for(Time t : time) {
        	System.out.println(t.hour + "��" + t.minute + "��" +t.second +"��");
        }
	
	
	
	}

}
