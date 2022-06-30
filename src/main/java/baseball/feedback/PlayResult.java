package baseball.feedback;

public class PlayResult {
    private int strikeCnt = 0;
    private int ballCnt = 0;

    public int getStrikeCnt(){
        return strikeCnt;
    }

    public int getBallCnt(){
        return ballCnt;
    }

    public boolean isGameOver() {
        return getStrikeCnt() == 3;
    }

    public void checkStatus(BallStatus ballStatus) {
        if(ballStatus.isStrike()) strikeCnt += 1;
        if(ballStatus.isBall()) ballCnt += 1;
    }
}
