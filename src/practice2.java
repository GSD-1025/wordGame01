import java.util.Random;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//��ĳ��, ����
				Scanner in= new Scanner(System.in);
				Random ran= new Random();
				String red = "\u001B[31m", reset = "\u001B[0m";
				//�迭:���ĺ�,���� �ܾ� 
				String[] wP= new String[10];
				char[] a= new char[52];
				for(int i=0; i<52;i++) {
				    if(i<=25) {
				       a[i]=(char)(65+i);
				    }else {
				       a[i]=(char)(71+i);
				    }
				}
				//�ܾ� ����
				System.out.println("�ܾ� ���� ���� : �Է�=I  or ����=R");
				String ent1=in.nextLine();
				if (ent1.equals("I")) {
					System.out.println("�ܾ �Է��ϼ��� ");
					for(int i=0; i<10; i++) {
						wP[i]=in.nextLine();
						if(i==0) {
							continue;
						}
						for(int j=0; j<=i-1; j++) {
							if(wP[i].equals(wP[j])) {
							   System.out.println("�ܾ� ����: �ߺ�");
							   System.out.println("�ܾ �ٽ� �Է��ϼ��� ");
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
				System.out.println("���� �ܾ�");
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
				System.out.println("���� ����");
				//while :���� �Է� �� ä��// 
				while(true) {
					if (start==0) {
						System.out.println("id �Է�");
						id=in.nextLine();
						while(true) {
							String r1wP=wP[ran.nextInt(10)];
							x[cnt1]=r1wP;// �ߺ����� ����~
							for(int j=0; j<=cnt1; j++) {
								if(r1wP.equals(x[j]) && cnt1!=j) {
									 r1wP=wP[ran.nextInt(10)];
									 x[cnt1]=r1wP; 
									 j=-1;  
								}
							}//~�ߺ����� ����
							System.out.println((cnt1+1)+"�� ���ôܾ�: "+r1wP);
							System.out.println("�ܾ� �Է�");
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
					}else if (start==1) { //�������~
						while(true) {
							String r2wP=wwp[ran.nextInt(k)];
							x[cnt1]=r2wP;
							for(int j=0; j<=cnt1; j++) {
								System.out.println("��1.5");
								if(r2wP.equals(x[j]) && cnt1!=j) {
									System.out.println("��1.6");
									 r2wP=wwp[ran.nextInt(k)];
									 System.out.println("��1.7");
									 x[cnt1]=r2wP;
									 System.out.println("��1.8");
									 j=-1;
								}
							}
							System.out.println("��2");
							System.out.println((cnt1+1)+"�� ���ôܾ�: "+r2wP);
							System.out.println("�ܾ� �Է�");
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
							System.out.println("��3");
							if(con>1) {
								score+=10;
							}
							System.out.println("��4");
							if (cnt1==k) {
								res=1;
								break;
							}
						}
					}// ~�������
					System.out.printf("%s�� �������� %.3f\n",id,score);	 // ä��~���
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
						System.out.println("���� ����");
					}else if(ent3.equals("R2")) {
						System.out.println("Ʋ�� �ܾ�");
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
						System.out.println("���� ����");
					}else if(ent3.equals("E")) {
						break;
					}
				}
	}	
}
