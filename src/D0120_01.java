
public class D0120_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=10000;
		int pay=8450;
		for (int i=3; i>=1; i--){
		     System.out.println(((int)((money-pay)/Math.pow(10,i)))%10);
		}
}
}