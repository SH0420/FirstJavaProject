
public class ArrayMaxTest {

	public static void main(String[] args) {
		
//		내가한거
//		ArrayMax am = new ArrayMax();
//		am.x = 10;
//		int[]arr =new int[10];
//		
//		for(int i =0; i<arr.length;i++) {
//			int ran =(int)(Math.random()*100)+1 ;
//			arr[i] = ran;
//		}
//		for(int i =0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int max = arr[0];
//		for(int i = 0; i< arr.length; i++) {
//			if(max < arr[i]) {
//				max =arr[i];
//			}
//		}
//			System.out.println("max ="+ max);
//		
//		해설
		ArrayMax am = new ArrayMax();
		
		for(int i =0;i<am.arr.length; i++) {
			am.arr[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i : am.arr) {
			System.out.println(i);
		}
		
		int max = arrayMax(am.arr);
		System.out.println("max =" + max);
	  }	 
	
	    static int arrayMax(int[] arr) {
	        int max = arr[0];
	        for(int i = 0;i<arr.length; i++) {
	        	if(max < arr[i]) {
	        		max = arr[i];
	        	}
	        }
	        
	        return max;
	    }
		//1.ArrayMax 객체를 생성한다.
		
		//2.생선된 객체의 배열에 1 ~ 100 사이 값을 랜덤하게 저장한다.
		
		//3.메소드를 정의한다.(배열의 최대값을 구해서 반환하도록한다.
		
		//4.반환된 최대값을 출력한다.

	
 
}
