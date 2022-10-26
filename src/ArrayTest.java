import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//배열 : 동일한 타입의 변수를 여러개 정의 하는것
		
//		int a,b,c,d,e; 
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
		
//		int[] arr; // 배열의 선언
//		arr = new int[5];//배열의 생성
//		
//		int[] = new int[5];
//		
//		
		
//		int[] arr= {10,20,30,40,50};
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
	

//		char[] cArr = new char[4];
//        char[] cArr = {'G','o','o','d'};
//		
//		
//		cArr[0] = 'G';
//		cArr[1] = 'o';
//		cArr[2] = 'o';
//		cArr[3] = 'd';
		
//      System.out.println(cArr[0]);		
		
//		String[] strArr = {"java","jsp","DB"};
//		System.out.println(strArr[1]);
//		strArr[2] = "html";
//		System.out.println(strArr[2]);
		
//		int x = 10;
//		int y;
//		y = x;
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2;
//		
//		arr2 =arr1; // 배열변수는 주소값이다.
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
		
//		배열의 활용
//		순차처리
//		반복문
		
//		int[] arr =new int [5];
//		
//		
////		쓰기
//		for(int i = 0; i < arr.length; i++ ) {
//			arr[i] = 1;
//			
//		}
//		
//		
////		읽기
//		for(int i =0; i < arr.length; i++)
//		System.out.println(arr[i]);
//		
//		int[] arr =new int[10];
//		
//		for(int i= 0; i < arr.length; i++) { //i = 0,1,2,3,4,5,6,7,8,9
//			arr[i] = i + 1;
//		}
//		for(int i= 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int sum = 0;
//		for(int i= 0; i < arr.length; i++) {
//			sum+= arr[i];
//		}
//		System.out.println(sum);
//		 
//		int odd =0;
//		int even = 0;
//		
//		for(int i= 0; i < arr.length; i++) {
//			if(arr[i] % 2 ==1 ){
//				odd = +arr[i];
//			}else {
//				even += arr[i];
//			}
//				
//		}
//	     System.out.println("홀수 : "+ odd);
//		 System.out.println("짝수 :" + even);
//		 
//		 
//       for(변수 : 배열변수명) {
//    	   실행문
//       }
		
		
//		int[] arr = {1,2,3,4,5};
//        
//		for(int i : arr) {
//			System.out.println(i);
//		}
//		 
//		 int sum = 0;
//		 for(int i : arr) {
//			 sum += i;
//		 }
//		
//		 String[] str = {"사과","딸기","포도"};
//		 
//		 for(String s : str) {
//			 System.out.println(s);
//		 }
		 
//	     int[] arr= new int[10];
	     
//	     난수 1 ~ 100 사이값 중에 10개를 배열 값으로 초기화 한다
//	     배열의 값을 출력한다.
		 
//	    for(int i= 0; i<arr.length; i++) {
//	    	int ran = (int)(Math.random()*100) +1 ; //math 0.0~ 9.99999
//	    	arr[i] =ran;
//	    }
//	    for(int i= 0; i<arr.length; i++) {
//	    	System.out.println(arr[i]);
//	    }
////		 
//	    System.out.println("=========");
//	    
//	    int max = arr[0];
//	    int min = arr[0];
//	    for(int i = 0; i < arr.length; i++) {
//	    	if(max < arr[i]) {
//	    		max = arr[i];
//	    	}
//	    	if (min > arr[i]) {
//	    		min=arr[i];
//	    	
//	    		
//	    	}
//	    }
//		 
//	    System.out.println("max =" + max);
//        System.out.println("min =" + min);
	
	     
//		난수를 사용하여 0 ~ 9 값으로 초기화한다.
//		
//		int [] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			int ran = (int)(Math.random()*10);
//			arr[i] = ran; //여기까지 난수로 초기화시킴
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + ",");
//		}
//		(완전풀어서 쓸때)
////		int n0=0, n1=0, n2=0 , n3=0, n4=0, n5=0, n6=0, n7=0, n8=0, n9=0;
//		int[] cntArr =new int[10]; //기본값으로 자동초기화된다.
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j<arr.length; j++) {
//			if(arr[i] == j) {
//				cntArr[j]++;
//			}
////			if(arr[i] == 0) {
////				n0++;
////			}else if(arr[i]==1) {
////				n1++;
////			}else if(arr[i]==2) {
////				n2++;
////			}else if(arr[i]==3) {
////				n3++;
////			}else if(arr[i]==4) {
////				n4++;
////			}else if(arr[i]==5) {
////				n5++;
////			}else if(arr[i]==6) {
////				n6++;
////			}else if(arr[i]==7) {
////			    n7++;
////		    }else if(arr[i]==8) {
////			    n8++;
////		    }else if(arr[i]==9) {
////				n9++;
//		    }
//		}
//		System.out.println();
//        
//		for(int i =0; i<cntArr.length;i++) {
//			System.out.println(i + "-" + cntArr);
//		}
////		System.out.println(0 +"=" + n0);
////		System.out.println(1 +"=" + n1);
////		System.out.println(2 +"=" + n2);
////		System.out.println(3 +"=" + n3);
////		System.out.println(4 +"=" + n4);
//		
////		실행결과
////		0 - 2 개
////		1 - 0 개
////		3 - 1 개
////	    . 
////	    .
////	    9 - 3 개
		
//		int [] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			int ran = (int)(Math.random()*10);
//			arr[i] = ran;
//		}
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + ",");
//			}
//			
//		 int [] cntArr =new int[10];
//	
//	     for(int i = 0; i<arr.length;i++) {
//	 	 cntArr[arr[i]]++; //cntArr[0]
//	 }
//	     System.out.println();
//	
//	     for(int i = 0; i<cntArr.length;i++) {
//		 System.out.println(i + "-"+ cntArr[i]);
//	}
//	
//	      (내가 한거)
//        int[] score = {60, 70, 80, 90, 75, 85, 95, 50, 45, 30};
//        int[] rank = new int[10];
////        실행결과
////        
////              점수 60점은 7등입니다
////              점수 70점은 6등입니다
////              점수 80점은 4등입니다
////              점수 90점은 2등입니다
////              점수 75점은 5등입니다
////              점수 85점은 3등입니다
//        
//       for(int i=0; i<score.length; i++) {
//    	   System.out.printin("점수"+score+ rank[0]+ "등입니다");
              
//		 (답안)
//		int[] score = {60, 70, 80, 90, 75, 85, 95, 50, 45, 30};
//		int[] rank = {1,1,1,1,1,1,1,1,1,1,1};
//		
//        for(int i = 0; i < score.length; i++) {
//        	for(int j=0; j<score.length; j++) {
//        		if(score[i] < score[j]) {
//        			rank[i]++;
//        		}
//        	}
//		}
//        for(int i = 0; i < rank.length; i++) {
//        	System.out.println(score[i] + "점은" + rank[i] + "등 입니다.");
//        }
//        
		//		
//		score[0] <score[1]     rank[0] ->2
//		score[0] <score[2]     rank[0] ->3
//		score[0] <score[3]     rank[0] ->4
//		score[0] <score[4]     rank[0] ->5
//		score[0] <score[5]     rank[0] ->6
//		score[0] <score[5]     rank[0] ->6
		
//		정렬 : 오름(1,2,3,4,5) , 내림(5,4,3,2,1)
//        int[] arr= {2, 4, 1, 5, 3};
//
//        for(int i = 0; i<arr.length; i++) {
//        	for(int j = i + 1;j<arr.length;j++) {
//        		if(arr[i] > arr[j]) { //부등호만바꾸면 내림차순
//        			int tmp;
//        			tmp = arr[i];
//        			arr[i] = arr[j];
//        			arr[j] = tmp;
//        		}
//        	}
//        }
//        for(int i = 0; i<arr.length; i++) {
//        	System.out.print(arr[i] + " , ");
//        }
//       
        
        
//        for(int i = 0; i < arr.length*5; i++) {
//        	int x = (int)(Math.random()*5);
//        	int y = (int)(Math.random()*5);
//        	
//        	int tmp;
//        	tmp = arr[x];
//        	arr[x] = arr[y];
//        	arr[y] = tmp;
//        	
//        }
//        for(int i = 0; i<arr.length; i++) {
//        	System.out.print(arr[i] + ",");
//        }
//                
        
        
//        tmp = arr[1];
//        arr[1] = arr[3];
//        arr[3] = tmp;
        
        
//        int x =10;
//        int y =20;
//        int tmp = 0;
//        tmp = x;
//        x = y;
//        y = tmp;
	//(내가한거)	
//        String[] name = {"홍길동","손흥민", "김연아"};
//        int [] medal = {3, 2, 10};
//        int [] rank= {1,2,3};
//      
//        
//        //실행결과
////        김연아 메달 10개 1등
////        홍길동 메달3개 2등
////        손흥민 메달2개 3등
//        
//        for(int i = 0; i< medal.length; i++) {
//        	for(int j =i+1; j<medal.length; j++) {
//        	 if(medal[i] < medal[j]) {
//        		 rank[i]++;
//        		 int  tmp;
//        		tmp= medal[i];
//        		medal[i]=medal[j];
//        		medal[j] = tmp;
//        				 
//        				
//        	 }
//        	}
//        }
//        for(int i = 0; i< medal.length; i++) {
//        	System.out.println("메달"+ medal[i]+"개"+rank[i]+"등");
//        }
        
		//(해설)
//        String[] name = {"홍길동","손흥민", "김연아"};
//        int [] medal = {3, 2, 10};
//        
//        //10,3,2
//        
//        for(int i = 0; i< medal.length; i++) {
//        	for(int j=i+i; j<medal.length; j++) {
//        		if(medal[i]  < medal[j]){
//        			int tmp;
//        			tmp = medal[i];
//        			medal[i]=medal[j];
//        			medal[j]= tmp;
//        			
//        			String nTmp;
//        			nTmp =name[i];
//        			name[i] = name[j];
//        			name[j] = nTmp;
//        			
//        			
//        		}
//        	}
//        }
//        for(int i = 0; i< medal.length; i++) {
//        	System.out.println(name[i] +  " 메달 " + medal[i] +"개"+ (i+1) + "등");
//        } 
//		

//		배열 -1차원
//		   -다차원(2차원) - 정방형(열의크기가 동일), 비정방형(열의크기가 다른경우)

//		int[][] score;
//		score = new int[5][3];
		
//		int[][] score = new int[5][3];
		
//        int[][] score = {
//        		{1,2,3},
//        		{4,5,6},
//        		{7,8,9},
//        		{10,11,12},
//        		{13,14,15},
//        	
//        };
//		
//		//		
////		score[0][0] = 1;
////		score[0][1] = 2;
////		score[0][2] = 3;
////		
////		score[1][0] = 4;
////		score[1][1] = 5;
////		score[1][2] = 6;
////		
////		score[4][2] = 15;
//		
////	    System.out.println(score[0][0]);	
////	    System.out.println(score[0][1]);	
////	    System.out.println(score[0][2]);	
////	    
////	    System.out.println(score[4][2]);	
//	      int[][] score;
//	      for(int i = 0; i<5; i++) {
//		  for(int j = 0; j<3; j++) {
//			  System.out.print(score[i][j]+ " ");
//		  }
//	  System.out.println();
//	  }
	    
	    
//       int[][] score = {
// 		{1,2,3},
// 		{4,5,6},
// 		{7,8,9},
// 		{10,11,12},
// 		{13,14,15},
//       };
//	     
// 		
////	     for(int i = 0; i<score.length; i++) {
////			  for(int j = 0; j< score[i].length; j++) {
////				  System.out.print(score[i][j]+ " ");
////			  }
////		  System.out.println();
////		  }
////	   
//	     System.out.println("==========");
//	     
//	     for(int[] i : score) {
//		      for(int j : i) {
//			  System.out.print(j + "  ");
//			  
//		  }
//		  System.out.println();
//	  }
//	     (방법1)
//	     int num = 1; 
//	     int[][] arr =new int[2][5];
//	
//	     for(int i = 0; i<arr.length; i++) { 
//		 for(int j = 0; j<arr[i].length; j++) {
//			arr[i][j] = num++; 
//			                   
//			
//		}
//	}
//	     for (int[] i : arr) {
//		 for(int j : i) {
//			  System.out.print(j+" ");
//		  }
//		  System.out.println();
//	  }
//	  
	     
		
//		(방법2)
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
//	     for (int[] i : arr) {
//		 for(int j : i) {
//			  System.out.print(j+" ");
//		  }
//		  System.out.println();
//	  }
//	  
//	    (연습문제)
//		 내가 해본거
//		int[][] arr = new int [5][3];
//		int num = 1;//1~15
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j] = num++; 
//			}
//		}
//		for(int [] i :arr) {
//			for(int j : i) {
//				System.out.print(j);
//			}
//		}
//		답안
//		int[][] arr = new int [5][3];
//		
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				arr[i][j]  = ( i * 3)+ j +1;
//	}
//	
//}
//		for(int [] i :arr) {
//			for(int j : i) {
//				System.out.print(j +"  ");
//			}
//	    System.out.println();
//	}
//		
	    /*
		*
		**
		***
		****
		*****
		*/
//		(다시해보기) 써보면서 하는게 도움됨
//		char[][] star =new char[5][5];
//		
//		for(int i = 0; i<star.length; i++) {
//			for(int j = 0; j<star[i].length; j++) {
//				if(i>=j) {
//					star[i][j] = '*';
//				}
//				
//			}
//		}
//		for(char[] i : star) {
//			for(char j : i ) {
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
//		char[][] star =new char[5][5];
//		
//		for(int i = 0; i<star.length; i++) {
//			for(int j = 0; j<star[i].length; j++) {
//				if(i+j<=4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
//       *
//      **
//     ***
//    ****
//   ***** 
		
//		char[][] star =new char[5][5];
//   
//	for(int i = 0; i<star.length; i++) {
//		for(int j = 0; j<star[i].length; j++) {
//			if(i+j>=4) {
//				star[i][j] = '*';
//			}
//		}
//	}
//	
//	for(char[] i : star) {
//		for(char j : i) {
//			System.out.print(j + " ");
//		}
//		System.out.println();
//	}
//	

//    *		
//   ***
//  ***** 
// *******
//********* 
//	(문제)---이해안됨
//   Scanner sc =new Scanner(System.in);	
//   System.out.println("행의 크기를 입력하세요: ");
//   int row = sc.nextInt(); //col 별의개수 row 열
//   int col = row * 2  -1;
//   
//   
//   char[][] star =new char [row][col];
//   
//   for(int i = 0; i<star.length; i++) {
//	   int starCnt = 2 * i + 1; //1, 3, 5, 7, 9
//	   int starStart = star.length - (i+1); //4, 3, 2, 1, 0
//	   for(int j = starStart; j<starStart + starCnt; j++) {
//		  star[i][j] = '*'; 
//		   
//	   }
//   }
//   
//   for(char[]i : star) {
//	   for(char j : i) {
//		   System.out.print(j + " ");
//	   }
//	   System.out.println();
//   }
   
//   char[][] star = {
//		   {'*', '*',  ' ',' ', ' '},
//		   {'*', '*',' ',' ', ' '},
//		   {'*', '*', '*' , '*','*'},
//		   {'*', '*', '*' , '*','*'},
//   };
//   
//   for(int i = 0; i<star.length; i++) {
//       for(int j = 0; j<star[i].length; j++) {
//	   System.out.print(star[i][j]);
//       }
//        System.out.println();
//   }
//   
//   char[][] result = new char[star[0].length][star.length]; // 5, 4
//   
//   for(int i = 0; i<star.length; i++) {
//	   for(int j =0; j<star[i].length; j++) {
//		   int x = j;
//		   int y= 3-i;
//		   
//		   result[x][y]=star[i][j];
//		   
//	   }
//   }
//   
//   System.out.println();
//   System.out.println();
//   
//   for(char[] i: result ) {
//	   for(char j : i) {
//		   System.out.print(j);
//	   }
//    System.out.println();
//   }
   
//    int[][] score = {
//    		{10,10,10},
//    		{20,20,20},
//    		{30,30,30},
//    		{40,40,40},
//    		{50,50,50}
//    };
//    
//    System.out.println("번호   국어   영어    수학   총점  평균");
//    
//    int sum;
//    int korTot = 0;
//    int engTot = 0;
//    int mathTot = 0;
//    for(int i = 0; i<score.length; i++) {
//    	
//    	korTot += score[i][0];
//    	engTot += score[i][1];
//    	mathTot += score[i][2];
//    	sum = 0;
//    	System.out.print("  " + (i + 1)+ "  ");
//    	    for(int j= 0; j<score[i].length; j++) {
//    	    	sum += score[i][j];
//    	    	System.out.print(" "+ score[i][j]+ " ");
//    	    }
//        System.out.print("  "+ sum);
//        double avg =sum/ (double)score[i].length;
//        System.out.print(" "+ avg);
//    	System.out.println();
//    }
//        int totScore =korTot +engTot + mathTot;
//        System.out.println("합계"+" "+ korTot +" "+ engTot +" "+mathTot+ " "+ totScore);
//	}

    
    
//    실행결과
//    
//    번호 국어 영어 수학 총점 평균
//    1 10 10  10  30  10.0
//    2 20 20  20  60  20.0
//    3 30 30  30  90  30.0
//    4 40 40  40  120 40.0
//    5 50 50  50  150 50.0
//  합계 150 150 150 450
 
//    int [][] bingo= new int [5][5];
//   
//    //배열의 1~ 50 난수를 초기화 한다.
//     for(int i=0; i<bingo.length; i++) {
//	   for(int j= 0; j< bingo[i].length; j++) {
//		
//	   bingo[i][j]= (int)(Math.random()*50)+1;
//	}  
//   }
//     
//     for(int i=0; i<bingo.length; i++) {
//	   for(int j= 0; j< bingo[i].length; j++) {
//        System.out.print(bingo[i][j]+"  ");
//
//	}
//	   System.out.println();
//    }
//     
////     //값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
//       //배열의 모드값이 0으로 변경되면 전체 반복문 종료
//         Scanner sc =new Scanner(System.in);
//         boolean flage = true;
//         int num;
//         int sum = 0;
//         while(flage) {
//        	 System.out.println("숫자입력:");
//        	 num = sc.nextInt();
//             sum = 0;
//        	 
//        	 for(int i=0; i<bingo.length; i++) {
//               for(int j= 0; j< bingo[i].length; j++) {
//               if(bingo[i][j]== num) {
//                	 bingo[i][j] = 0;
//                 }
//               sum += bingo[i][j];
//               System.out.print(bingo[i][j]+ " ");
//       }
//                System.out.println();
//   }
//               System.out.println("sum =" + sum);
//         if(sum== 0) {
//        	 flage = false;  
//           }
//         }
//         
//	System.out.println("Game Over");
 }
}