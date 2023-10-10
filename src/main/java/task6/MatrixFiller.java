package task6;

import java.util.Arrays;

public class MatrixFiller {

    double[] values;

    public MatrixFiller(double[] values){
        this.values = Arrays.copyOf(values, values.length);
    }

    public double[][] createMatrix(){
        if (values.length == 0) return new double[1][];
        double[][] result = new double[values.length][values.length];
        for (int i = 0; i < values.length; i++){
            for (int j = 0; j < values.length; j++){
                result[i][j] = values[(i + j) % values.length];
            }
        }
        return result;
    }
}
