package az.atlacademy.module01.lesson16;

import java.util.Comparator;

public class IntegerCustomComparator implements Comparator<Integer> {

//    @Override
//    public int compare(Integer x, Integer y) {
//        return (x < y) ? -1 : ((x == y) ? 0 : 1);
//    }

    @Override
    public int compare(Integer x, Integer y) {
        return (x > y) ? -1 : ((y == x) ? 0 : 1);
    }

}
