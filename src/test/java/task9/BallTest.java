package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    public void constructorTest(){
        Ball ball = new Ball("red", 1000);
        assertEquals(ball.getWeight(),1000);
        assertEquals(ball.getColor(), "red");
    }

    @Test
    public void equalityTestEqualCase(){
        Ball ball1 = new Ball("yellow", 1);
        Ball ball2 = new Ball("yellow", 1);
        assertTrue(ball1.equals(ball2));
    }

    @Test
    public void equalityTestUnequalColorCase(){
        Ball ball1 = new Ball("red", 1);
        Ball ball2 = new Ball("yellow", 1);
        assertFalse(ball1.equals(ball2));
    }

    @Test
    public void equalityTestUnequalWeightCase(){
        Ball ball1 = new Ball("red", 1);
        Ball ball2 = new Ball("red", 101);
        assertFalse(ball1.equals(ball2));
    }

    @Test
    public void equalityTestUnequalCase(){
        Ball ball1 = new Ball("red", 1);
        Ball ball2 = new Ball("yellow", 5);
        assertFalse(ball1.equals(ball2));
    }
}