package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionCalculationTest {

    private ExpressionCalculation exp;

    @Test
    public void positiveIntegerInput() throws Exception{
        exp = new ExpressionCalculation(10, 32);
        assertEquals(10.12, exp.calculate(), 0.1);
    }

    @Test
    public void negativeIntegerInput() throws Exception{
        exp = new ExpressionCalculation(-1, 1);
        assertEquals(-0.5, exp.calculate(), 0.1);
    }

    @Test
    public void doubleInput() throws Exception{
        exp = new ExpressionCalculation(36.5, 93.7);
        assertEquals(36.54, exp.calculate(), 0.1);
    }

}
