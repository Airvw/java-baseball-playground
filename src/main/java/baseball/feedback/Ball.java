package baseball.feedback;


public class Ball{
    private final int position;
    private final int ballNum;

    public Ball(int position, int ballNum) {
        this.position = position;
        this.ballNum = ballNum;
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)) return BallStatus.STRIKE;
        if (ball.isBall(ballNum)) return BallStatus.BALL;
        return BallStatus.NOTHING;
    }

    private boolean isBall(int ballNum) {
        return this.ballNum == ballNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return position == ball.position && ballNum == ball.ballNum;
    }

    public int getBallNum() {
        return ballNum;
    }
}
