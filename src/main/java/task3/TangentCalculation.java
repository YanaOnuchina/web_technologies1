package task3;

public class TangentCalculation {

    private double a;
    private double b;
    private double h;

    public TangentCalculation(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }


    public double[][] calculate(){
        double[][] table = createTable();
        for (int i = 0; i < table[0].length; i++){
            table[1][i] = Math.tan(table[0][i]);
        }
        return table;
    }

    private double[][] createTable(){
        double[][] table;
        if (h > 0 && b >= a)
            table = new double[2][(int)Math.floor((b - a) / h) + 1];
        else if (h < 0 && b <= a)
            table = new double[2][(int)Math.ceil((b - a) / h) + 1];
        else table = new double[2][0];
        double curVal = a;
        for (int i = 0; i < table[0].length; i++){
            table[0][i] = curVal;
            curVal+=h;
        }
        return table;
    }
}
