import java.util.Random;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//스캐너, 랜덤
				Scanner in= new Scanner(System.in);
				Random ran= new Random();
				String red = "\u001B[31m", reset = "\u001B[0m";
				//배열:알파벳,문제 단어 
				String[] wP= new String[10];
				char[] a= new char[52];
				for(int i=0; i<52;i++) {
				    if(i<=25) {
				       a[i]=(char)(65+i);
				    }else {
				       a[i]=(char)(71+i);
				    }
				}
				//단어 생성
				System.out.println("단어 생성 선택 : 입력=I  or 랜덤=R");
				String ent1=in.nextLine();
				if (ent1.equals("I")) {
					System.out.println("단어를 입력하세요 ");
					for(int i=0; i<10; i++) {
						wP[i]=in.nextLine();
						if(i==0) {
							continue;
						}
						for(int j=0; j<=i-1; j++) {
							if(wP[i].equals(wP[j])) {
							   System.out.println("단어 선택: 중복");
							   System.out.println("단어를 다시 입력하세요 ");
						       wP[i]=in.nextLine();
							   if(wP[i].equals(wP[j])) {
									j--;
							   }
							}
						}
					}
				}else if (ent1.equals("R")) {
					for(int i=0; i<10; i++) {
						for(int j=0; j<ran.nextInt(11)+5; j++) {
							if (j==0) {
								wP[i]=String.valueOf(a[ran.nextInt(26)]);
							}else {
								wP[i]+=a[ran.nextInt(26)+26];
							}
						}		
					}
				}
				System.out.println("문제 단어");
				for(int i=0; i<10; i++) {
					System.out.print(wP[i]+" ");
					if(i==4 || i==9)
					   System.out.println();
				}
				String id=null;
				int start=0, cnt1=0, wcnt=0, k=0, con=0, res=0;
				double score=0;
				String[] wwp= new String[10];
				String[] x=new String[10];
				System.out.println("게임 시작");
				//while :문제 입력 및 채점// 
				while(true) {
					if (start==0) {
						System.out.println("id 입력");
						id=in.nextLine();
						while(true) {
							String r1wP=wP[ran.nextInt(10)];
							x[cnt1]=r1wP;// 중복제시 제거~
							for(int j=0; j<=cnt1; j++) {
								if(r1wP.equals(x[j]) && cnt1!=j) {
									 r1wP=wP[ran.nextInt(10)];
									 x[cnt1]=r1wP; 
									 j=-1;  
								}
							}//~중복제시 제거
							System.out.println((cnt1+1)+"번 제시단어: "+r1wP);
							System.out.println("단어 입력");
							String ent2=in.nextLine();
							cnt1++;
							if(r1wP.equals(ent2)) {
								score+=10;
								con+=1;
							}else if(r1wP.equals(ent2)==false && r1wP.length()==ent2.length()) {
								double per=0;
								for(int i=0; i<r1wP.length(); i++) {			
									if (r1wP.charAt(i)!=ent2.charAt(i)) {
										per+=(1/(double)r1wP.length());
									}
								}
								score+=per*10;
								wwp[wcnt]=r1wP;
								wcnt++;
								con=0;
							}else if(r1wP.equals(ent2)==false &&r1wP.length()!=ent2.length()) {
								score-=0;
								wwp[wcnt]=r1wP;
								wcnt++;
								con=0;
							}
							if(con>1) {
								score+=10;
							}
							if (cnt1==10) {
								break;
							}
						}
					}else if (start==1) { //복습기능~
						while(true) {
							String r2wP=wwp[ran.nextInt(k)];
							x[cnt1]=r2wP;
							for(int j=0; j<=cnt1; j++) {
								System.out.println("고1.5");
								if(r2wP.equals(x[j]) && cnt1!=j) {
									System.out.println("고1.6");
									 r2wP=wwp[ran.nextInt(k)];
									 System.out.println("고1.7");
									 x[cnt1]=r2wP;
									 System.out.println("고1.8");
									 j=-1;
								}
							}
							System.out.println("고2");
							System.out.println((cnt1+1)+"번 제시단어: "+r2wP);
							System.out.println("단어 입력");
							String ent2=in.nextLine();
							cnt1++;
							if(r2wP.equals(ent2)) {
								score+=10;
								con=1;
							}else if(r2wP.equals(ent2)==false && r2wP.length()==ent2.length()) {
								double per=0;
								for(int i=0; i<r2wP.length(); i++) {			
									if (r2wP.charAt(i)!=ent2.charAt(i)) {
										per+=(1/(double)r2wP.length());
									}
								}
								score+=per*10;
								con=0;
								wcnt++;
							}else if(r2wP.equals(ent2)==false &&r2wP.length()!=ent2.length()) {
								score-=0;
								con=0;
								wcnt++;
							}
							System.out.println("고3");
							if(con>1) {
								score+=10;
							}
							System.out.println("고4");
							if (cnt1==k) {
								res=1;
								break;
							}
						}
					}// ~복습기능
					System.out.printf("%s의 총점수는 %.3f\n",id,score);	 // 채점~출력
					if (res==0) {
						System.out.println("Retry: R1 Review: R2 End: E");
					}else {
						System.out.println("Retry: R1 End: E");
					}
					String ent3=in.nextLine();
					if (ent3.equals("R1")) {
						start=0; 
						cnt1=0;
						wcnt=0;
						score=0;
						con=0;
						System.out.println("게임 시작");
					}else if(ent3.equals("R2")) {
						System.out.println("틀린 단어");
						for(int j=0; j<wcnt; j++) {
							System.out.print(red+wwp[j]+" "+reset);
							if(j==4 || j==9)
							   System.out.println();
						}
						k=wcnt;
						cnt1=0;
						start=1;
						score=0;
						con=0;
						wcnt=0;
						System.out.println("복습 시작");
					}else if(ent3.equals("E")) {
						break;
					}
				}
	}	
}
