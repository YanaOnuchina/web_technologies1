package task7;

import java.util.Arrays;

public class ArraySort {

    private final double[] array;

    public ArraySort(double[] elements){
        array = Arrays.copyOf(elements, elements.length);
    }

    public void sort(){
        int i = 0;
        double temp;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1]) {
                i++;
            }
            else {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
    }

    public double[] getArray() {
        return array;
    }
}
