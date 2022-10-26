
public class CaptionTv extends Tv{
    //Tv클래스로부터 변수 7개와 메소스 6개를 상속 받는다
 	boolean caption; //false
 	
 	void displayCaption(String text) {
 		if(caption) {
 			System.out.println(text);
 		}
 	}
}
