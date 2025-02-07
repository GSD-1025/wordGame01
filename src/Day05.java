
public class Day05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cl=56773;
		int res=0;
		res=(cl/10000)%10;
		res=(cl/1000)%10;
		res+=(cl/100)%10;
		res+=(cl/10)%10;
		res+=cl%10;
		System.out.println(res);
	}

}
