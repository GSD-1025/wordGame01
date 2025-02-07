import java.util.Arrays;

public class Day3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = {6,12,33,4,5,26};
		int[] lotto2 = {6,12,33,4,5,26};
		if (lotto2[0]>lotto2[1]) {
		   lotto2[0]=lotto2[1];
		}else {
		   lotto2[1]=lotto2[0];
		}
		if (lotto2[1]>lotto2[2]) {
		   lotto2[2]=lotto2[1];
		}else {
		   lotto2[1]=lotto2[2];
		}
		if (lotto2[2]>lotto2[3]) {
		   lotto2[3]=lotto2[2];
		}else {
		   lotto2[2]=lotto2[3];
		}
		if (lotto2[3]>lotto2[4]) {
		   lotto2[4]=lotto2[3];
		}else {
		   lotto2[3]=lotto2[4];
		}
		if (lotto2[4]>lotto2[5]) {
		   lotto2[5]=lotto2[4];
		}else {
		   lotto2[4]=lotto2[5];
		}
        if (lotto[0]==lotto2[5]) {
            lotto[0]=lotto[5];
                        }
                        if (lotto[1]==lotto2[5]) {
                           lotto[1]=lotto[5];
                        }
                        if (lotto[2]==lotto2[5]) {
                           lotto[2]=lotto[5];
                        }
                        if (lotto[3]==lotto2[5]) {
                           lotto[3]=lotto[5];
                        }
                        if (lotto[4]==lotto2[5]) {
                           lotto[4]=lotto[5];
                        }
                        lotto[5]=lotto2[5];
                        System.out.println(Arrays.toString(lotto));

	}

}
