
public class Car1Test {

	public static void main(String[] args) {
		
		Car1 c1 =new Car1(); //Car1() -> 생성자의호출
		c1.color = "green";
		c1.gearType = "Auto";
		c1.door = 4;

		System.out.println(c1.color);
        System.out.println(c1.gearType);
        System.out.println(c1.door);
        
        Car1 c2 = new Car1();
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);
        
        Car1 c3 =new Car1("red");
        System.out.println(c3.color);
        System.out.println(c3.gearType);
        System.out.println(c3.door);
        
        Car1 c4 =new Car1("blue","auto");
        System.out.println(c4.color);
        System.out.println(c4.gearType);
        System.out.println(c4.door);
        
        Car1 c5 =new Car1("yellow","auto",4);
        System.out.println(c5.color);
        System.out.println(c5.gearType);
        System.out.println(c5.door);
        
        
        
	}

}
