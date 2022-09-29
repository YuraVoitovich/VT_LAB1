package main.java.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public double computeWeight() {
        return balls.stream().mapToDouble(Ball::getWeight).sum();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public long countBlueBalls() {
        return balls.stream().filter(o -> o.getColor() == Color.Blue).count();
    }
}
