package baseball.feedback;

import java.util.*;

public class RandomBalls {
    private List<Integer> randomBall = new ArrayList<>();

    public void makeBalls() {
        if(randomBall.isEmpty()) randomBall.add(ValidationUtils.generateNum());
        int idx = 0;
        while(randomBall.size() != 3){
            int randomNum = ValidationUtils.generateNum();
            checkBall(randomNum);
        }
    }

    private void checkBall(int randomNum) {
        if(ValidationUtils.isNotSameNum(randomBall, randomNum)) randomBall.add(randomNum);
    }

    public List<Integer> getRandomBalls() {
        return randomBall;
    }
}
