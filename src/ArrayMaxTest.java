
public class ArrayMaxTest {

	public static void main(String[] args) {
		
//		�����Ѱ�
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
//		�ؼ�
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
		//1.ArrayMax ��ü�� �����Ѵ�.
		
		//2.������ ��ü�� �迭�� 1 ~ 100 ���� ���� �����ϰ� �����Ѵ�.
		
		//3.�޼ҵ带 �����Ѵ�.(�迭�� �ִ밪�� ���ؼ� ��ȯ�ϵ����Ѵ�.
		
		//4.��ȯ�� �ִ밪�� ����Ѵ�.

	
 
}
