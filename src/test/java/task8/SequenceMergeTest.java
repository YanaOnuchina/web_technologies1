package task8;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SequenceMergeTest {
    private SequenceMerge sequenceMerge;

    @Test
    public void insertToCenter(){
        sequenceMerge = new SequenceMerge(new Integer[]{1, 2 , 3, 13}, new Integer[]{4, 5, 6});
        assertEquals(Arrays.asList(3, 4, 5), sequenceMerge.findInsertionSpots());
    }

    @Test
    public void insertToBeginning(){
        sequenceMerge = new SequenceMerge(new Integer[]{12, 12 , 13, 13}, new Integer[]{4, 5, 6});
        assertEquals(Arrays.asList(0, 1, 2), sequenceMerge.findInsertionSpots());
    }

    @Test
    public void insertToEnd(){
        sequenceMerge = new SequenceMerge(new Integer[]{1, 2 , 3, 4}, new Integer[]{7, 9, 16});
        assertEquals(Arrays.asList(4, 5, 6), sequenceMerge.findInsertionSpots());
    }

    @Test
    public void mixedInsertion(){
        sequenceMerge = new SequenceMerge(new Integer[]{1, 3 , 5, 7, 9}, new Integer[]{2, 4, 6, 8, 10});
        assertEquals(Arrays.asList(1, 3, 5, 7, 9), sequenceMerge.findInsertionSpots());
    }

}