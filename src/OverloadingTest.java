
public class OverloadingTest {

	public static void main(String[] args) {
		
		Overloading ol =new Overloading();
		
//		ol.add();
		ol.add(3);
//		ol.add(3L);
		ol.add(2,3);
		ol.add(2,3L);
		ol.add(2L,3);
		
		System.out.println(3); 
		System.out.println('C');
		System.out.println("abc");
        
	}

}
