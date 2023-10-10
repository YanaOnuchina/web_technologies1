package task5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IncreasingSequence {

    int[] a;

    public IncreasingSequence(int[] array){
        a = new int[array.length];
        System.arraycopy(array, 0, a, 0, array.length);
    }

    public int countExtras(){
        int longest_seq_size = 0;
        int[] max_lengthes = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            max_lengthes[i] = 1;
            for (int j = 0; j < i; j++) {

                if (a[j] <= a[i] && max_lengthes[j] + 1 > max_lengthes[i]) {
                    max_lengthes[i] = max_lengthes[j] + 1;
                }

            }
            if (longest_seq_size < max_lengthes[i]) {
                longest_seq_size = max_lengthes[i];
            }
        }
        return a.length-longest_seq_size;
    }

    private Set<Integer> countExtraForEach(){
        Set<Integer> extras = new HashSet<>();
        int counter;
        int last_el;
        for (int i = 0; i < a.length; i++){
            last_el = i;
            counter = 0;
            for (int j = i + 1; j < a.length; j++){
                if (a[last_el] > a[j]) {
                    counter++;
                }
                else last_el = j;
            }
            extras.add(counter + i);
        }
        return extras;
    }

    public int getMinExtras(){
        return Collections.min(countExtraForEach());
    }
}
