package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCheckingTest {

    private SpaceChecking spaceChecking;

    @Test
    public void insideAreaInput(){
        spaceChecking = new SpaceChecking(1.5, 3);
        assertTrue(spaceChecking.isInArea());
    }

    @Test
    public void outsideAreaInput(){
        spaceChecking = new SpaceChecking(5, 1.6);
        assertFalse(spaceChecking.isInArea());
    }

    @Test
    public void borderInput(){
        spaceChecking = new SpaceChecking(-4, 0);
        assertTrue(spaceChecking.isInArea());
    }

}