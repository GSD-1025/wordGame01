import java.util.Scanner;


public class D01_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ctrl + shift +o -> import: �ʿ��� �ڷ����� ���
		String[] menu= {"0:���", "1:���", "2:«��", "3:���", "4:������"};
		int[] price= {5000,4500,7000,8000,3000};
		for(int i=0; i<5; i++) {
		    System.out.print(" "+menu[i]+"-"+price[i]+"��"+"||");
		}		
		System.out.println();
		
		String[] sel_menu= new String[3];
		int[] count= new int[3];
		int[] sel_price= new int[3];
		for(int i=0; i<3; i++) {
			
			System.out.println("�޴��� �����ϼ���(����� 999)");
			int a=in.nextInt();
			if (a==999) {
			       break;
			} 
			sel_menu[i]=menu[a];
			sel_price[i]=price[a];
			System.out.println("������ �����ϼ���");
			int c=in.nextInt();
			count[i]=c;
			
		}
		for(int i=0; i<3; i++) {
			 if(sel_menu[i]==null) {
			    	break;
			 }
			System.out.println(" "+sel_menu[i]+sel_price[i]+"��"+" "+count[i]+"��");
			System.out.print(sel_price[i]*count[i]+"��");
			System.out.println();
		}
		int price_sum=0;
		for(int i=0; i<3; i++) {
		    price_sum+=(sel_price[i]*count[i]);
		}
		System.out.println();
		System.out.println(price_sum+"��");
	}

}
