package baseball.feedback;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Balls {
    private List<Ball> ballList;

    public Balls(List<Integer> numList) {
        ballList = mapBalls(numList);
    }

    private List<Ball> mapBalls(List<Integer> numList) {
        return IntStream.range(0, numList.size())
                .mapToObj(i -> new Ball(i + 1, numList.get(i)))
                .collect(Collectors
                        .toList());
    }

    public BallStatus play(Ball playerBall) {
        return ballList.stream()
                .map(ball -> ball.play(playerBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public List<Ball> getBallList() {
        return ballList;
    }
}
