import java.util.Scanner;


public class D01_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Ctrl + shift +o -> import: 필요한 자료형을 등록
		String[] menu= {"0:라면", "1:김밥", "2:짬뽕", "3:돈까스", "4:떡볶이"};
		int[] price= {5000,4500,7000,8000,3000};
		for(int i=0; i<5; i++) {
		    System.out.print(" "+menu[i]+"-"+price[i]+"원"+"||");
		}		
		System.out.println();
		
		String[] sel_menu= new String[3];
		int[] count= new int[3];
		int[] sel_price= new int[3];
		for(int i=0; i<3; i++) {
			
			System.out.println("메뉴를 선택하세요(종료는 999)");
			int a=in.nextInt();
			if (a==999) {
			       break;
			} 
			sel_menu[i]=menu[a];
			sel_price[i]=price[a];
			System.out.println("수량을 선택하세요");
			int c=in.nextInt();
			count[i]=c;
			
		}
		for(int i=0; i<3; i++) {
			 if(sel_menu[i]==null) {
			    	break;
			 }
			System.out.println(" "+sel_menu[i]+sel_price[i]+"원"+" "+count[i]+"개");
			System.out.print(sel_price[i]*count[i]+"원");
			System.out.println();
		}
		int price_sum=0;
		for(int i=0; i<3; i++) {
		    price_sum+=(sel_price[i]*count[i]);
		}
		System.out.println();
		System.out.println(price_sum+"원");
	}

}
