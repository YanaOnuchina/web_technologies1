package task9;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<>();
    }

    public Basket(int size){
        balls = new ArrayList<>();
        for (int i = 0; i < size; i++){
            balls.add(new Ball());
        }
    }

    public Basket(ArrayList<Ball> balls){
        this.balls = new ArrayList<>();
        this.balls.addAll(balls);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Ball b:balls){
            sb.append(b).append(", ");
        }
        return sb.toString();
    }

    public void addBall(Ball ball){
        this.balls.add(ball);
    }

    public int calculateBasketWeight(){
        int basketWeight = 0;
        for (Ball ball : balls) {
            basketWeight += ball.getWeight();
        }
        return basketWeight;
    }

    public int calculateBlueBalls() {
        int blueBallNumber = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals("blue")) {
                blueBallNumber++;
            }
        }
        return blueBallNumber;
    }

    public void sortBasket(){
        balls.sort(new BallComparator());
    }

    public boolean equals(ArrayList<Ball> o){
        if (getBalls().size() != o.size()) return false;
        for (int i = 0; i < getBalls().size(); i++){
            if (! getBalls().get(i).equals(o.get(i))) return false;
        }
        return true;
    }

    public ArrayList<Ball> getBalls(){
        return balls;
    }

}
