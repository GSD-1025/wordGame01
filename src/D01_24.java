import java.util.Random;
import java.util.Scanner;

public class D01_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner in= new Scanner(System.in);
		String[] train= new String[5];
		for(int i=0; i<5; i++) {
		    System.out.println("번호");    
		    String num= in.nextLine();
		    System.out.println("이름");
	        String name= in.nextLine();
		    System.out.println("시간");
		    String time= in.nextLine();
		    System.out.println("분");
		    String min= in.nextLine();
		    train[i]=num+name+time+min;
		    System.out.println("등록 입력시 다음 기차 등록/종료 입력시 종료");
		    String ent=in.nextLine();
		    if(ent.equals("종료")) {
		      break;
		   }
	   }
		


	}

}
