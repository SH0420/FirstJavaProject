
public class Car1 {
    //�Ӽ�
	String color;
	String gearType; //null
	int door;        //0
	
    //������ :�������(�ν��Ͻ�)�� �ʱ�ȭ �Ѵ�.
	//      Ŭ������ �̸��� �����ϴٰ� �ۼ��Ѵ�.
	//      ��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ�����.
	//      �⺻�����ڴ� ��������(�ٸ������ڰ� ������)
	//      ������ �����ε�
	//      ��� Ŭ������ �����ڸ� �����Ѵ�.
	//      this/ this()
	
	Car1(){//�⺻������  �����ڰ� �ϴ°Ծ������� ��������  but�������Ȱ���
	   //���๮	
	   
//	   color ="blue";
//	   gearType = "st";
//	   door = 3;
	}
	
	Car1(String color){
		this(color,"Auto") ;//�ٸ��������� ȣ��
		//this.color = color;
	
	}
	
	Car1(String color,String gearType){
		this(color,gearType,4);
		
		//this.color = color;
		//this.gearType = gearType;
	}
	
	Car1(String color,String gearType, int door){
		this.color = color;
		this.gearType =gearType;
		this.door = door;
		
		
	}
}
//�����ڴ� �ν��Ͻ�������