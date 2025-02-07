import java.util.Scanner;

public class D0204 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String sign="!@#$%^&*";
		int spcnt=0;
		String ID= new String(" ");
		System.out.println("ID를 입력하세요");
		ID= in.nextLine();
		int b1=0;
		for(int i=0; i<ID.length(); i++) {
		        for(int j=0; j<sign.length(); j++) {
			        if (ID.charAt(i)==sign.charAt(j)) {
			    	    System.out.println("특수문자 포함됨");
			    	    b1++;
			   	        break;
			        }
		         }
		         if (b1==1) {
		    	    break;
		        }
		}
		
		for(int i=0; i<ID.length(); i++) {
		         for(int j=0; j<sign.length(); j++) {
		              if (ID.charAt(i)==sign.charAt(j)) {
		                 spcnt++;
		                 break;
		              }
		         }
		}
		System.out.println("특수문자의 갯수 "+spcnt);
		

	}

}
