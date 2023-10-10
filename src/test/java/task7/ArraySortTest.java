package task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortTest {

    ArraySort arraySort;

    @Test
    public void reverseOrderCase(){
        arraySort = new ArraySort(new double[]{5, 2, 1});
        arraySort.sort();
        assertArrayEquals(new double[]{1, 2, 5}, arraySort.getArray());
    }

    @Test
    public void directOrderCase(){
        arraySort = new ArraySort(new double[]{1, 2.6, 3.2, 4, 5.1123, 6, 7});
        arraySort.sort();
        assertArrayEquals(new double[]{1, 2.6, 3.2, 4, 5.1123, 6, 7}, arraySort.getArray());
    }

    @Test
    public void mixedOrderCase(){
        arraySort = new ArraySort(new double[]{5, 7, 1, 0, 3, 8, -4});
        arraySort.sort();
        assertArrayEquals(new double[]{-4, 0, 1, 3, 5, 7, 8}, arraySort.getArray());
    }

    @Test
    public void oneElementArrayCase(){
        arraySort = new ArraySort(new double[]{12.3});
        arraySort.sort();
        assertArrayEquals(new double[]{12.3}, arraySort.getArray());
    }

    @Test
    public void emptyArrayCase(){
        arraySort = new ArraySort(new double[]{});
        arraySort.sort();
        assertArrayEquals(new double[]{}, arraySort.getArray());
    }

}