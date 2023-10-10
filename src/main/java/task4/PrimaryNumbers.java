package task4;

import java.util.ArrayList;
import java.util.List;

public class PrimaryNumbers {
    private int[] array;

    public PrimaryNumbers(int[] elements){
        array = new int[elements.length];
        System.arraycopy(elements, 0, array, 0, elements.length);
    }

    public int[] checkAll(){
        List<Integer> primeList = new ArrayList<>();
        for (int x : array){
            if (isPrime(x)) primeList.add(x);
        }
        int[] result = primeList.stream().mapToInt(i -> i).toArray();
        return result;
    }

    private boolean isPrime(int num){
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0) return false;
        }
        return true;
    }

}
