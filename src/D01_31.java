
public class D01_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		for(int i=0; i<=6; i++) {
		    int cnt=2;
		    for(int j=2; j<14; j++) {
		        if (pang[j]==i && pang[j-1]==i && pang[j-2]==i) {
		           cnt++; 
		        }
		        if(cnt>=3 && pang[j]!=i && pang[j-1]==i) {
		          System.out.println("¹øÈ£"+i+" "+"°¹¼ö"+cnt+" "+"½ÃÀÛ ÀÎµ¦½º"+(j-cnt));
		          cnt=2;
		        }
		    }  
		}    
	}

}
