package task1;

public class ExpressionCalculation {

    private double x;
    private double y;

    public ExpressionCalculation(double x, double y) {
        setX(x);
        setY(y);
    }

    private double calculateNumerator(){
        double numeratorResult;
        numeratorResult = 1 + Math.pow(Math.sin(x + y), 2);
        return numeratorResult;
    }

    private double calculateDenominator(){
        double denominatorResult;
        denominatorResult = 2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2))));
        return denominatorResult;
    }

    //Calculate a result of the expression (1+sin^2(x+y))/(2+|x-(2x/(1+x^2*y^2))|)+x
    public double calculate(){
        double result;
        result = calculateNumerator() / calculateDenominator() + x;
        return result;
    }

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }

}
