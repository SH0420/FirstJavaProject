
public class Tv {
//���
//�θ�Ŭ���� : ���� �ڽ�Ŭ������ ���´�.
//          ���� ��Ӹ� �����ϴ�.
//�Ӽ�
//	ũ��, ������ư, ä��, ����, ����, ���ͳ�,.....��, �����⵵, ������
//���(����)
//	���� ON/OFF, ä��UP/DOWN, ����UP/DOWN,.....
	
	boolean power;//������ư �ϳ��Ǳ������ �ΰ��Ǽ���  false
	int channel; //ä��   0
	int volume; //����   0
	String color; //����  null
	String model;//��   null 
    int year;    //�����⵵  0
    String company;//������  null
	
	
	
	void power() {//���� ON/OFF
      power= !power; 
	}
	void channelUp() {//ä��UP/DOWN
	    channel++;
	}
	void channelDown() {//ä��UP/DOWN
		channel--;
	}
	void volumeUp() {//����UP/DOWN
	    volume++;
	}
	void volumeDown() {//����UP/DOWN
	    volume--;
	}
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
}
