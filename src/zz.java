

import java.util.*;

public class zz {
    public static void main(String[] args) {
        String[] englishWords = new String[]
                {"apple", "adventure", "brilliant", "inspire", "brave", "dream", "strength", "grate", "coffee", "computer"};

        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int[] randomArray = new int[englishWords.length]; //�����ߺ����� �Ǵܹ迭
        int[] eachScores = new int[englishWords.length]; //���ܾ� ������ ��������
        String[] myAnswer = new String[englishWords.length]; //���� �Է��Ѱ��� ����迭
        String[] rankingID = new String[]{"","","","","","","","","","",""};
        int[] rankingScore = new int[11];
        int rankingIndex = 0;   //���߿� ++����ߴ�++
        int[] real_rankingScore = new int[11];

        int eachScore = 0; //���� �ܾ� ���ʽ� �Ǵ�
        String red = "\033[31m";
        String green = "\033[32m";
        String white = "\033[97m";
        String[] lastColor = new String[]{"", "", "", "", "", "", "", "", "", ""}; //������亰 �ܾ���� ����迭
        boolean gameOver = true;

        String[] correctAnswer =
                new String[]
                        {"apple", "adventure", "brilliant", "inspire", "brave", "dream", "strength", "grate", "coffee", "computer"}; //����������� ������ �迭

        while(gameOver) { //                       ���� ����!!!!!!!!!!!!!!!!
            System.out.println("���ӽ��� || ��ŷȮ��");
            String answer = in.nextLine();
            int totalScore = 0; //���� ����
            int bonus = 0; //���ʽ�

            if(answer.equals("���ӽ���")){
                System.out.println("���̵� �Է��ϼ���");

            }else if(answer.equals("��ŷȮ��")){
                System.out.println("------------------");
                System.out.println("���   ���̵�    ����");
                for(int i = 0 ; i < rankingID.length-1 ; i++) {
                    System.out.print((i+1) + "�� | "+rankingID[i] + " | ");
                    System.out.print(real_rankingScore[i] + " | ");
                    System.out.println();
                }
                System.out.println("------------------");
                continue;
            }

            String id = in.nextLine();

            rankingID[rankingIndex] = id;


        for(int i = 0; i < englishWords.length; i++) {
            randomArray[i] = 0;
            eachScores[i] = 0;
            myAnswer[i] = "";
            lastColor[i] = "";
        }
        for(int i = 0; i < englishWords.length; i++) {
            correctAnswer[i] = englishWords[i];
        }
        boolean gameContinue = true;               //          ��������� ����� �ʱ�ȭ�ܰ�!@!@!@!@!@!@!@!@



        System.out.println("Ÿ�ڰ����� �����մϴ�");
        int kk =0;
           int plag = 0; //                       plag
        while (gameContinue) {
            randomArray = new int[englishWords.length];
            boolean anyWrongAnswer = false; // ������ �ִ��� Ȯ���� ����
            lastColor = new String[]{"", "", "", "", "", "", "", "", "", ""};
            // ó���� ��� �ܾ Ǯ���� �ϵ�, Ʋ�� ������ ����ؼ� �ݺ��ϰ� �����


            for (int i = 0; i < englishWords.length; i++) {
                int randomIndex = rand.nextInt(englishWords.length);
                if(randomArray[randomIndex]==0){  //�ߺ����� �Ǵ� ���
                    randomArray[randomIndex] ++;

                }else{
                    i--;
                    continue;
                }

                if (!correctAnswer[randomIndex].equals("")) { // ������ �ƴ� ������ �ǳʶٱ�
                    System.out.println("�ܾ� : " + englishWords[randomIndex]);
                    String inputWord = in.nextLine();
                    myAnswer[randomIndex] = inputWord;
                    for(int p = 0 ; p < inputWord.length() ; p++) {
                        if(myAnswer[randomIndex].charAt(p)==' '){
                           myAnswer[randomIndex] =  myAnswer[randomIndex].replace(' ','��');
                        }
                    }
                    if(inputWord.length() < englishWords[randomIndex].length()){
                        int ccc = englishWords[randomIndex].length()-inputWord.length();
                        for(int kkk = 0 ; kkk<ccc ; kkk++){
                            myAnswer[randomIndex] += red+"��";//�����̵��� ����~!~!~!~!~!~!~!~!~!
                        }
                    }
                    int correctCnt = 0; // ���乮�� Ƚ��

                    // �Է��� �ܾ�� ���� �ܾ ���ؼ� ���� ó��
                    for (int j = 0; j < inputWord.length(); j++) {
                        if (j < englishWords[randomIndex].length()) {
                            if (inputWord.charAt(j) == englishWords[randomIndex].charAt(j)) {
                                lastColor[randomIndex] += green + inputWord.charAt(j); // ���� ���ڴ� �ʷϻ�
                                correctCnt++;
                            }else if(inputWord.charAt(j) == ' ') {
                                lastColor[randomIndex] += red + "��";
                            }
                            else {
                                lastColor[randomIndex] += red + inputWord.charAt(j); // Ʋ�� ���ڴ� ������
                            }

                        }
                        else {
                            lastColor[randomIndex] += red + inputWord.charAt(j); // ���̰� ��� ���������� ó��
                        }


                    }
                    if(inputWord.length() < englishWords[randomIndex].length()) {
                        int cnt = englishWords[randomIndex].length() - inputWord.length();
                         for(int k = 0; k < cnt; k++) {
                             lastColor[randomIndex] += red+"��" ;
                         }
                    }

                    if (correctCnt != englishWords[randomIndex].length()) { // Ʋ�� �ܾ���� �ش� �ε����� ����
                        correctAnswer[randomIndex] = inputWord;
                        anyWrongAnswer = true;
                    } else {
                        correctAnswer[randomIndex] = ""; // ���� �ܾ�� ���� ��Ͽ��� ����
                    }

                    // ���� ���
                    if (englishWords[randomIndex].equals(myAnswer[randomIndex])) {
                        eachScores[randomIndex] = 10;
                        totalScore += 10;
                        eachScore++;
                        if (eachScore >= 3) {                 // ���� 3�� �ܾ� ���߸� ���ʽ� 3��
                            bonus += 3;
                            eachScore = 0;
                        }
                    } else if (englishWords[randomIndex].length() - correctCnt < 2) {
                        eachScores[randomIndex] = 5;
                        totalScore += 5;
                        eachScore = 0;
                    } else if (englishWords[randomIndex].length() - correctCnt < 3) {
                        eachScores[randomIndex] = 3;
                        totalScore += 3;
                        eachScore = 0;
                    } else {
                        eachScores[randomIndex] = 0;
                        eachScore = 0;
                    }
                }
                // �ִ� ������ 100����
                if (totalScore > 100) {
                    totalScore = 100;
                }
            }
            rankingScore[rankingIndex] = totalScore;//��ŷ���� ����!~~!!~!~!~!~!~!~!~!~!~!~!~!~



            // ������ ����� ���
            if(kk==0) {
                System.out.println("\n=== ��� ===");
                System.out.println("�� ����: " + totalScore);
                System.out.println("���ʽ� ����: " + bonus);
            }

            for (int i = 0; i < englishWords.length; i++) {
                if (eachScores[i] == 10) {
                    System.out.println(green + "����: " + englishWords[i] + " | " + myAnswer[i]);
                } else {
                    System.out.println(red + "����: " + englishWords[i] + " | " + myAnswer[i]);
                }
            }

            // �� �ܾ ���� ���� ��� ���
            System.out.println("\033[33m\n�ܾ ���� ���:" +white);
            for (int i = 0; i < englishWords.length; i++) {
                System.out.println("�ܾ�: " + englishWords[i]+ white+ " | ���: " + lastColor[i] + white);
            }
            System.out.println();
            System.out.println(Arrays.toString(rankingScore));
            System.out.println(Arrays.toString(real_rankingScore));
            System.out.println(Arrays.toString(rankingID));
            if(plag == 0){
                for (int oo = rankingIndex; oo < real_rankingScore.length; oo++) {
                    if(rankingIndex!=10){
                         if (real_rankingScore[oo] == 0)
                             real_rankingScore[oo] = rankingScore[oo];  //rankingS�� real�� �ű� ��������

                    }else{
                        real_rankingScore[10] = rankingScore[10];
                    }
                }
                for (int i = 0 ; i < rankingID.length; i++) {

                    if (rankingID[i].equals(id) && i != rankingIndex) {
                        if (real_rankingScore[i] < real_rankingScore[rankingIndex]) {
                            real_rankingScore[i] = real_rankingScore[rankingIndex];
                            real_rankingScore[rankingIndex] = 0;
                            rankingID[rankingIndex] = "";
                            rankingIndex--;
                        } else if (real_rankingScore[i] >= real_rankingScore[rankingIndex]) {
                            real_rankingScore[rankingIndex] = 0;
                            rankingID[rankingIndex] = "";
                            rankingIndex--;
                        }
                    }
                }
                System.out.println();
                System.out.println(Arrays.toString(rankingScore));
                System.out.println(Arrays.toString(real_rankingScore));
                System.out.println(Arrays.toString(rankingID));
                for (int z = 0; z < rankingID.length; z++) {
                    for (int j = z + 1; j < rankingID.length ; j++) { //�������� ����
                        if (real_rankingScore[z] < real_rankingScore[j]) {
                            int temp = real_rankingScore[z];
                            real_rankingScore[z] = real_rankingScore[j];
                            real_rankingScore[j] = temp;

                            String str = rankingID[z];
                            rankingID[z] = rankingID[j];
                            rankingID[j] = str;
                        }
                    }
                }
                System.out.println();
                System.out.println(Arrays.toString(rankingScore));
                System.out.println(Arrays.toString(real_rankingScore));
                System.out.println(Arrays.toString(rankingID));
            }


            // ������ ������ ���� ����
            if (!anyWrongAnswer) {
                System.out.println("��� �ܾ ������ϴ�!");
                break;
            }


            // ���� ������ �ٽ� Ǯ�� ����
            System.out.println("\n���乮���� �ٽ� Ǯ��ðڽ��ϱ�? (Y / N)");
            String yesOrNo = in.nextLine();


            if (yesOrNo.equals("Y")) {
                plag=1;
                kk = 1;
                continue;
            } else if (yesOrNo.equals("N")) {
                gameContinue = false; // ���� ����
            }



            System.out.println("\n���� ������ ����:");
            for (int i = 0; i < englishWords.length; i++) {
                System.out.print("\033[36m" + "����" + (i+1)+"��" + englishWords[i]+white);
                System.out.print(" | " );
            }
            System.out.println();
            for (int i = 0; i < englishWords.length; i++) {
                if (eachScores[i] == 10) {
                    System.out.print((i+1)+"��"+"\033[32m���� " + myAnswer[i] + white);
                    System.out.print(" | ");
                } else {
                    System.out.print((i+1)+"��"+"\033[31m���� " + myAnswer[i] + " | "+white);
                }
            }
            System.out.println();
            for (int i = 0; i < englishWords.length; i++) {
                System.out.print((i+1) + "��" +lastColor[i] + white+" "  );
            }
        }
            System.out.println();
            System.out.println(white + "�ٽ� ������ �����Ͻðڽ��ϱ�? (yes / no)"); //�ٽý���
            String aaa = in.nextLine();
        if(aaa.equals("no")) {
            System.out.println("����Ǿ����ϴ�.");
            gameOver = false;
        }else if(aaa.equals("yes")) {
            rankingIndex++;
            if(rankingIndex>=10){
            rankingIndex=10;
            }

        }
        }
    }
}












