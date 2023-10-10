package task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceMerge {
    private final Integer[] seq1;
    private final Integer[] seq2;

    public SequenceMerge(){
        seq1 = new Integer[0];
        seq2 = new Integer[0];
    }

    public SequenceMerge(Integer[] array1, Integer[] array2){
        seq1 = array1;
        seq2 = array2;
    }

    public List<Integer> findInsertionSpots(){
        List<Integer> result = new ArrayList<>();
        List<Integer> seq1 = new ArrayList<>();
        seq1.addAll(Arrays.asList(this.seq1));
        List<Integer> seq2 = new ArrayList<>();
        seq2.addAll(Arrays.asList(this.seq2));
        List<Integer> mergedSequence = new ArrayList<>();
        while (seq1.size() != 0 || seq2.size() != 0){
            if (seq2.size() == 0 || (seq1.size() != 0 && seq1.get(0) <= seq2.get(0))){
                mergedSequence.add(seq1.get(0));
                seq1.remove(0);
            }
            else {
                mergedSequence.add(seq2.get(0));
                seq2.remove(0);
                result.add(mergedSequence.size() - 1);
            }
        }

//        while (i < seq1.size()) {
//            if (seq2.get(0) <= seq1.get(i)) {
//                if (seq2.get(seq2.size() - 1) <= seq1.get(i)) {
//                    seq1.add(i, seq2.get(0));
//                    seq2.remove(0);
//                    result.add(i);
//                    if (seq2.isEmpty()) break;
//                }
//                else if (seq1.get(seq1.size() - 1) <= seq1.get(0)) {
//
//                }
//                else {
//                    if (i > seq1.size() - 2 || seq2.get(0) >= seq1.get(i + 1)) {
//                        seq1.add(i, seq2.get(0));
//                        seq2.remove(0);
//                        result.add(i);
//                        if (seq2.isEmpty()) break;
//                    }
//                }
//            }
//            i++;
//        }
        return result;
    }
}
