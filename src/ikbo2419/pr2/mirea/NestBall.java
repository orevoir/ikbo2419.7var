package ikbo2419.pr2.mirea;

import java.lang.*;
public class NestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1249, -242);
        System.out.println(ball);

        ball.move(452, -295);
        System.out.println(ball);

        ball.move(-5211, 2424);
        System.out.println(ball);
    }
}
