import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
//		char[][]star= new char [5][5];
//		for(int i = 0; i<star.length; i++) {
//			for(int j= 0; j<star[i].length; j++) {
//				if(i>=j) {
//					star[i][j]='*';
//				}
//			}
//			
//		}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		/*
		*****
		****
		***
		**
		*
		*/
//		char[][]star = new char[5][5];
//		for(int i =0; i<star.length; i++) {
//			for(int j =0; j<star[i].length; j++) {
//				if(i+j<=4) {
//					star[i][j]='*';
//				}
//			}
//		}
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j +"  ");
//			}
//			System.out.println();
//		}
//		
//		
		 int [][] bingo= new int [5][5];
	      Scanner sc =new Scanner(System.in);
	         boolean flage = true;
	         int num;
	         while(flage) {
	        	 System.out.println("숫자입력:");
	        	 num = sc.nextInt();
	           
	        	 for(int i=0; i<bingo.length; i++) {
	      	       for(int j= 0; j< bingo[i].length; j++) {
	               if(bingo[i][j]== num) {
	                	 bingo[i][j] = 0;
	                 }
	                System.out.print(bingo[i][j]+ " ");
	                }
	                System.out.println();
	           }
	         }
	}

}
