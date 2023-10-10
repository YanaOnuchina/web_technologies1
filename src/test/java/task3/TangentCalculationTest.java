package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TangentCalculationTest {

    TangentCalculation tangentCalculation;

    @Test
    public void singleElementInput(){
        tangentCalculation = new TangentCalculation(0.3, 0.3, 0.1);
        double[][] actualResult = tangentCalculation.calculate();
        assertArrayEquals(new double[]{0.3}, actualResult[0], 0.01);
        assertArrayEquals(new double[] {0.309}, actualResult[1], 0.01);
    }

    @Test
    public void doubleElementInput(){
        tangentCalculation = new TangentCalculation(0.5, 0.65, 0.1);
        double[][] actualResult = tangentCalculation.calculate();
        assertArrayEquals(new double[]{0.5, 0.6}, actualResult[0], 0.01);
        assertArrayEquals(new double[] {0.546, 0.684}, actualResult[1], 0.01);
    }

    @Test
    public void negativeStepInput(){
        tangentCalculation = new TangentCalculation(0.7, 0.55, -0.05);
        double[][] actualResult = tangentCalculation.calculate();
        assertArrayEquals(new double[]{0.7, 0.65, 0.6, 0.55}, actualResult[0], 0.01);
        assertArrayEquals(new double[] {0.842, 0.76, 0.684, 0.613}, actualResult[1], 0.01);
    }

    @Test
    public void incorrectInput(){
        tangentCalculation = new TangentCalculation(0.5, 0.55, -0.01);
        double[][] actualResult = tangentCalculation.calculate();
        assertArrayEquals(new double[]{}, actualResult[0]);
        assertArrayEquals(new double[]{}, actualResult[1]);
    }
}
