package task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallComparatorTest {

    BallComparator ballComparator = new BallComparator();

    @Test
    public void firstLessCase(){
        Ball ball1 = new Ball("red", 1);
        Ball ball2 = new Ball("yellow", 2);
        assertEquals(ballComparator.compare(ball1, ball2), -1);
    }

    @Test
    public void secondLessCase(){
        Ball ball1 = new Ball("red", 32);
        Ball ball2 = new Ball("yellow", 15);
        assertEquals(ballComparator.compare(ball1, ball2), 1);
    }

    @Test
    public void equalCase(){
        Ball ball1 = new Ball("red", 13);
        Ball ball2 = new Ball("yellow", 13);
        assertEquals(ballComparator.compare(ball1, ball2), 0);
    }

}