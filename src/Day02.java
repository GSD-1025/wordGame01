
public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
		������ ö���� ���� �⺻������ 100���̴�.*/   
		int ch=100;// ���� ������ ch �ʱⰪ 100 �ڷ��� int
        int yh=100;// ���� ������ yh �ʱⰪ 100 �ڷ��� int 
        /*
               ö���� 2�� ���� �̰��.*/
        ch=ch+20;  // ch+20�� ch�� ����
        yh=yh-20;  // yh-20�� yh�� ����
        /*
               ����.*/
        ch=ch+2;   // ch+2�� ch�� ����
        yh=yh+2;   // yh+2�� yh�� ����
        /*
               ������ 1�� �̰��.*/
        yh=yh+10;  // yh+10�� yh�� ����
        ch=ch-10;  // ch-10�� ch�� ����
        /*���� ������ ����Ͻÿ�*/
        System.out.println("ö���� ����"+ch); // ch ���� �ֿܼ� ��� 
        System.out.println("������ ����"+yh); // yh ���� �ܙ��� ��� 
        //sysout+ctrl �����̽�-> System.out.println();
	}

}

