package baseball;

import java.util.HashMap;
import java.util.Map;

public class CheckSystem implements BallCount{
    private ResultView resultView = new ResultView();
    private int ballCnt;
    private int strikeCnt;
    private boolean gameOver;

    public Map<Integer, Integer> makeMap(int computerNum){
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        while(computerNum > 0){
            map.put(computerNum % 10, idx);
            computerNum /= 10;
            idx += 1;
        }

        return map;
    }

    @Override
    public boolean count(boolean isStrike){
        this.ballCnt += 1;
        if(isStrike == true){
            this.strikeCnt += 1;
            this.ballCnt -= 1;
        }
        if(this.strikeCnt == 3){
            return true;
        }
        return false;
    }

    public boolean check(int computerNum, int value){
        Map<Integer, Integer> map = this.makeMap(computerNum);
        int idx = 1;
        while(value > 0){
            int key = value % 10;
            if(map.containsKey(key)){
                gameOver = this.count(ballCheck(map, key, idx));
            }
            value /= 10;
            idx += 1;
        }

        return gameOver;
    }

    public int getBallCnt() {
        return ballCnt;
    }
    public int getStrikeCnt() {
        return strikeCnt;
    }

    public void setBallCnt(int ballCnt) {
        this.ballCnt = ballCnt;
    }

    public void setStrikeCnt(int strikeCnt) {
        this.strikeCnt = strikeCnt;
    }
}
