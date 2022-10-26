
public class Example1 {

	public static void main(String[] args) {
		

	
//	int[][] score = {
//	 		{1,2,3},
//	 		{4,5,6},
//	 		{7,8,9},
//	 		{10,11,12},
//	 		{13,14,15},
//	       };
//		     
//	 		for(int i = 0; i<score.length; i++) {
//	 			for(int j = 0; j<score[i].length; j ++) {
//	 				System.out.print(score[i][j]+" ");
//	 			}
//                  System.out.println();
//		  }
//
//	             System.out.println("===========");
//	
//	           for(int[] i: score ) {
//	        	   for(int j :i) {
//	        		   System.out.print(j + " ");
//	        	   }
//	        	   System.out.println();
//	           }
//	     (规过1)
	     int num = 1; 
	     int[][] arr =new int[2][5];
	
         for(int i = 0; i<arr.length; i++) {
        	 for(int j = 0; j<arr[i].length; j++) {
        		 arr[i][j]=num++;
        	 }
	  }
	  
	     
		
//		(规过2)
		//int num = 1; 
//	     int[][] arr =new int[2][5];
//	
//	     for(int i = 0; i<arr.length; i++) { // 0 1
//		 for(int j = 0; j<arr[i].length; j++) {// 0,1,2,3,4
//			arr[i][j] = (i*5) +j + 1; // 1,2,3,4,5
//			                   // 6,7,8,9,10
//			
//		}
//	}

	           
	
	}		
}