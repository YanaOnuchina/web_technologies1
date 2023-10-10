package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixFillerTest {

    MatrixFiller matrixFiller;

    @Test
    public void twoElementMatrixCase(){
        matrixFiller = new MatrixFiller(new double[] {1, 3});
        double[][] resultMatrix = matrixFiller.createMatrix();
        assertArrayEquals(new double[]{1, 3}, resultMatrix[0]);
        assertArrayEquals(new double[]{3, 1}, resultMatrix[1]);
    }

    @Test
    public void threeElementMatrixCase(){
        matrixFiller = new MatrixFiller(new double[] {-1.2, 0.32, 1.987});
        double[][] resultMatrix = matrixFiller.createMatrix();
        assertArrayEquals(new double[]{-1.2, 0.32, 1.987}, resultMatrix[0]);
        assertArrayEquals(new double[]{0.32, 1.987, -1.2}, resultMatrix[1]);
        assertArrayEquals(new double[]{1.987, -1.2, 0.32}, resultMatrix[2]);
    }

    @Test
    public void oneElementMatrixCase(){
        matrixFiller = new MatrixFiller(new double[] {169.16789});
        double[][] resultMatrix = matrixFiller.createMatrix();
        assertArrayEquals(new double[]{169.16789}, resultMatrix[0]);
    }

    @Test
    public void zeroElementMatrixCase(){
        matrixFiller = new MatrixFiller(new double[] {});
        double[][] resultMatrix = matrixFiller.createMatrix();
        assertNull(resultMatrix[0]);
    }

}
