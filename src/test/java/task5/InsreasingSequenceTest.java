package task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSequenceTest {

    @Test
    public void increasingSequenceCase(){
        IncreasingSequence increasingSequence = new IncreasingSequence(new int[] {2, 3, 6, 9, 123});
        assertEquals(0, increasingSequence.countExtras());
    }

    @Test
    public void mixedSequenceCase(){
        IncreasingSequence increasingSequence = new IncreasingSequence(new int[] {2, -1, 16, 9, 123});
        assertEquals(2, increasingSequence.countExtras());
    }

    @Test
    public void equalElementCase(){
        IncreasingSequence increasingSequence = new IncreasingSequence(new int[] {1, 1, 1});
        assertEquals(0, increasingSequence.countExtras());
    }

    @Test
    public void decreasingSequenceCase(){
        IncreasingSequence increasingSequence = new IncreasingSequence(new int[] {24, 23, 6, 5, -3});
        assertEquals(4, increasingSequence.countExtras());
    }

    @Test
    public void test(){
        IncreasingSequence increasingSequence = new IncreasingSequence(new int[] {1, 5, 3, 4, 8});
        assertEquals(1, increasingSequence.countExtras());
    }
}