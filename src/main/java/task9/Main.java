package main.java.task9;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(Color.Red, 3));
        basket.addBall(new Ball(Color.Blue, 1.5));
        basket.addBall(new Ball(Color.Blue, 2));
        System.out.println(basket.countBlueBalls());
        System.out.println(basket.computeWeight());
    }
}
