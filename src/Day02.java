
public class Day02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
		영수와 철수는 각각 기본점수가 100점이다.*/   
		int ch=100;// 선언문 변수명 ch 초기값 100 자료형 int
        int yh=100;// 선언문 변수명 yh 초기값 100 자료형 int 
        /*
               철수가 2번 연속 이겼다.*/
        ch=ch+20;  // ch+20을 ch에 대입
        yh=yh-20;  // yh-20을 yh에 대입
        /*
               비겼다.*/
        ch=ch+2;   // ch+2를 ch에 대입
        yh=yh+2;   // yh+2를 yh에 대입
        /*
               영수가 1번 이겼다.*/
        yh=yh+10;  // yh+10을 yh에 대입
        ch=ch-10;  // ch-10을 ch에 대입
        /*최종 점수를 출력하시오*/
        System.out.println("철수의 점수"+ch); // ch 값을 콘솔에 출력 
        System.out.println("영수의 점수"+yh); // yh 값을 콘솛에 출력 
        //sysout+ctrl 스페이스-> System.out.println();
	}

}

