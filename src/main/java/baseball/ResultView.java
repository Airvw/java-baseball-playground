package baseball;

import java.io.PrintStream;

public class ResultView {
    public PrintStream printStream;


    public void correct(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
    public void result(int ballCnt, int strikeCnt){
        if(ballCnt > 0){
            System.out.print(ballCnt + "볼 ");
        }
        if(strikeCnt > 0){
            System.out.print(strikeCnt + "스트라이크");
        }
        if(ballCnt == 0 && strikeCnt == 0){
            System.out.print("낫싱");
        }
        System.out.println();
    }
}
