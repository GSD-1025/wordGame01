
public class Day02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char b='a';
		//System.out.println(b);
		//System.out.println(b+2);// 결과 99
		//System.out.println((char)(b+2));// 결과 c
		
		int a=(int)b-97;
		System.out.println("현재값"+a);
		a=((a+2)%26)+97;
		//System.out.println("97에서 떨어진 수"+a);//
		System.out.println((char)(a));
	}

}
