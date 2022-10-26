
public class Tv {
//상속
//부모클래스 : 여러 자식클래스를 갖는다.
//          단일 상속만 가능하다.
//속성
//	크기, 전원버튼, 채널, 볼륨, 색상, 인터넷,.....모델, 제조년도, 제조사
//기능(행위)
//	전원 ON/OFF, 채널UP/DOWN, 볼륨UP/DOWN,.....
	
	boolean power;//전원버튼 하나의기능으로 두개의선택  false
	int channel; //채널   0
	int volume; //볼륨   0
	String color; //색상  null
	String model;//모델   null 
    int year;    //제조년도  0
    String company;//제조사  null
	
	
	
	void power() {//전원 ON/OFF
      power= !power; 
	}
	void channelUp() {//채널UP/DOWN
	    channel++;
	}
	void channelDown() {//채널UP/DOWN
		channel--;
	}
	void volumeUp() {//볼륨UP/DOWN
	    volume++;
	}
	void volumeDown() {//볼륨UP/DOWN
	    volume--;
	}
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
}
