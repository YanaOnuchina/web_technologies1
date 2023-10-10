package task2;

public class SpaceChecking {

    private double x;
    private double y;

    public SpaceChecking(double x, double y){
        setX(x);
        setY(y);
    }

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }

    public boolean isInArea(){
        return isAboveXAxis() || isUnderXAxis();
    }

    private boolean isUnderXAxis(){
        return x >= -6 && x <= 6 && y >= -3 && y <= 0;
    }

    private boolean isAboveXAxis(){
        return x >= -4 && x <= 4 && y >= 0 && y <= 5;
    }

}
