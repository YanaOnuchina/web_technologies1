package task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryNumbersTest {

    PrimaryNumbers primaryNumbers;

    @Test
    public void withPrimeCase(){
        primaryNumbers = new PrimaryNumbers(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(primaryNumbers.checkAll(), new int[]{1, 2, 3, 5});
    }

    @Test
    public void withoutPrimeCase(){
        primaryNumbers = new PrimaryNumbers(new int[]{6, 10, 15, 32, 45});
        assertArrayEquals(primaryNumbers.checkAll(), new int[]{});
    }

    @Test
    public void bigNumberCase(){
        primaryNumbers = new PrimaryNumbers(new int[]{1223, 1069, 647, 522, 9999});
        assertArrayEquals(primaryNumbers.checkAll(), new int[]{1223, 1069, 647});
    }

}