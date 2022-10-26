
public class Car1 {
    //속성
	String color;
	String gearType; //null
	int door;        //0
	
    //생성자 :멤버변수(인스턴스)를 초기화 한다.
	//      클래스의 이름과 동일하다게 작성한다.
	//      객체를 생성하는 시점에 한번만 호출되어진다.
	//      기본생성자는 생략가능(다른생성자가 없을때)
	//      생성자 오버로딩
	//      모든 클래스는 생성자를 포함한다.
	//      this/ this()
	
	Car1(){//기본생성자  생성자가 하는게없을때는 생략가능  but실행은된거임
	   //실행문	
	   
//	   color ="blue";
//	   gearType = "st";
//	   door = 3;
	}
	
	Car1(String color){
		this(color,"Auto") ;//다른생성자의 호출
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
//생성자는 인스턴스만가능