package leetcode.hdkshjm.challenge.month10.week4.chap3503;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReaderImpl implements ArrayReader {
    private final List<Integer> list;

    ArrayReaderImpl(int[] array) {
        list = Arrays.stream(array).boxed().collect(Collectors.toList());
    }

    public int get(int index) {
        if (index > list.size() - 1) return 2147483647;
        return list.get(index);
    }
}
