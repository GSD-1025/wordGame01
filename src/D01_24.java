import java.util.Random;
import java.util.Scanner;

public class D01_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner in= new Scanner(System.in);
		String[] train= new String[5];
		for(int i=0; i<5; i++) {
		    System.out.println("��ȣ");    
		    String num= in.nextLine();
		    System.out.println("�̸�");
	        String name= in.nextLine();
		    System.out.println("�ð�");
		    String time= in.nextLine();
		    System.out.println("��");
		    String min= in.nextLine();
		    train[i]=num+name+time+min;
		    System.out.println("��� �Է½� ���� ���� ���/���� �Է½� ����");
		    String ent=in.nextLine();
		    if(ent.equals("����")) {
		      break;
		   }
	   }
		


	}

}
