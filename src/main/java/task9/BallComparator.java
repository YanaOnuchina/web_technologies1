package task9;

import java.util.Comparator;

public class BallComparator implements Comparator<Ball> {

    @Override
    public int compare(Ball o1, Ball o2) {
        if (o1.getWeight() == o2.getWeight()) return 0;
        else if (o1.getWeight() < o2.getWeight()) return -1;
        return 1;
    }
}
