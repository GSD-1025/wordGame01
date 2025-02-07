import java.util.Random;
import java.util.Scanner;
public class others {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		Random r = new Random();
		String[] daneo= {" "," "," "," "," "," "," "," "," "," "};
		int[] st={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,1,0,0,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,0,2,0,1,1,0,0,0,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0,0,0,1,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,1,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,2,0,1,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,2,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,0,0,0,2,0,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,0,0,1,0,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,2,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,0,0,2,0,0,1,1,1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2};
		int[] jo={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,1,1,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,1,1,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,0,2,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,1,0,0,0,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,2,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,1,1,0,0,1,1,0,1,1,0,0,0,0,0,0,2,0,0,0,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,1,0,2,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,1,1,0,1,1,0,0,0,1,1,0,2,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,0,1,1,0,0,0,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,1,0,1,1,0,0,0,1,1,0,2,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,0,0,1,1,0,0,0,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,1,1,0,0,0,0,1,1,0,0,1,1,1,1,1,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2};
		String[] dan={"ubiquitous","exacerbate","ambivalent","capricious","benevolent","innocuous","ostentatious","tenacious","acquiesce","alleviate","conciliate","dichotomy","ephemeral","hierarchy","mitigation","obfuscate","paradoxical","prognosis","quixotic","recalcitrant"};
		int[] daneoNum=new int[10];
		int tr=0;
		String[] trDan=new String[10];
		int[] trNum=new int[10];
		int ttr=0;
		int gg=0;
		int c=0;
		int sum=0;
		for(int i=0; i<jo.length; i++){
			if(jo[i]==0){
				System.out.print("▒");
			}else if(jo[i]==1){
				System.out.print("■");
			}else{
				System.out.println(" ");
			}
		}
		System.out.println("				시작 하려면 ENTER을 누르세요. ▼");
		in.nextLine();
		while(true) {
			if(gg==0){
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("자동 입력 - 0");
				System.out.println("수동 입력 - 1");
				System.out.println("그 외의 숫자를 입력하면 종료됩니다.");
				int a=in.nextInt();
				in.nextLine();
				if(a==1){
					gg++;
				}else if(a==0){
					gg+=2;
				}else{
					break;
				}
			}
			if(gg==1){
				for(int i=0; i<10; i++){
					c=0;
					System.out.println(i+1+". 영단어를 입력하세요.");
					System.out.println("자동 입력을 원하시면 skim.");
					String a=in.nextLine();
					if(a.equals("skim")){
						gg++;
						break;
					}
					for(int j=0; j<10; j++){
						if(daneo[j].equals(a)){
							System.out.println("중복된 단어입니다.");
							System.out.println("다시 입력하세요.");
							i--;
							c++;
							break;
						}
					}
					if(c==1){
						continue;
					}
					for(int j=0; j<a.length(); j++) {
						if((65>a.charAt(j)||a.charAt(j)>90)&&(97>a.charAt(j)||a.charAt(j)>122)){
							System.out.println("영어가 아닙니다.");
							System.out.println("다시 입력하세요.");
							i--;
							c++;
							break;
						}
					}
					if(c==1){
						continue;
					}
					daneo[i]=a;
					daneoNum[i]++;
					if(i==9){
						gg+=2;
					}
				}
			}
			if(gg==2){
				for(int i=0; i<10; i++){
					if(daneoNum[i]==1){ 
						continue;
					}
					c=0;
					String a=dan[r.nextInt(19)];
					for(int j=0; j<10; j++){
						if(daneo[j].equals(a)){
							i--;
							c++;
							break;
						}
					}
					if(c==1){
						continue;
					}
					daneo[i]=a;
					daneoNum[i]++;
				}
				gg++;
			}
			if(gg==3){
				for(int i=0; i<st.length; i++){
				if(st[i]==0){
						System.out.print("▒");
					}else if(st[i]==1){
						System.out.print("■");
					}else{
						System.out.println(" ");
					}
				}
				System.out.println("				시작 하려면 ENTER을 누르세요. ▼");
				in.nextLine();
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				for(int i=0; i<10; i++){
					int a=r.nextInt(10);
					if(daneoNum[a]==1){
						System.out.println(" \n\n\n\n\n\n");
						System.out.println("╔═══*.·:·.☽✧    ✦    ✧☾.·:·.*═══╗");
						System.out.println("	"+daneo[a]);
						System.out.println("╚═══*.·:·.☽✧    ✦    ✧☾.·:·.*═══╝");
						System.out.println(" ");
						System.out.println("╔═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╗");
						System.out.print("\t");
						String b=in.nextLine();
						System.out.println("╚═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╝");
						daneoNum[a]++;
						if(daneo[a].equals(b)){
							sum+=10;
						}else{
							trDan[tr]=daneo[a];
							tr++;
							
						}
					}else{
						i--;
					}
					
				}
				
				gg=4;
			
			}
			
			if(gg==4) {
				for(int i=tr; i>=0; i--) {
					if(i==0){
						gg++;
						continue;
					}
					int a=r.nextInt(tr);
					if(trNum[a]==0){
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						System.out.println("qhrtmq");
						System.out.println(" ");
						System.out.println("╔═══*.·:·.☽✧    ✦    ✧☾.·:·.*═══╗");
						System.out.println("	"+trDan[a]);
						System.out.println("╚═══*.·:·.☽✧    ✦    ✧☾.·:·.*═══╝");
						System.out.println(" ");
						System.out.println("╔═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╗");
						String b=in.nextLine();
						System.out.println("╚═══ -ˋˏ *.·:·.⟐.·:·.* ˎˊ- ═══╝");
						trNum[a]++;
						if(trDan[a].equals(b)){
							sum+=5;
						}else{
							ttr++;
						}
					}else{
						i++;
					}
				}
			}
			if(gg==5) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("총점수 : "+sum);
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("세부점수");
				System.out.println("10점 - "+(10-tr)+"번");
				System.out.println("5점 - "+(tr-ttr)+"번");
				System.out.println("0점 - "+ttr+"번");
				gg++;
			}
		}
	

	}    

}

	
