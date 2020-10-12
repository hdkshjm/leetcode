package leetcode.hdkshjm.month10.week1.chap3479;

import java.util.List;

class Solution {

    public int getStart(int i) {
        return arrays.get(i).get(0);
    }

    public int getEnd(int i) {
        List<Integer> array = arrays.get(i);
        return array.get(array.size() - 1);
    }

    List<List<Integer>> arrays;

    public int maxDistance(List<List<Integer>> arrays) {
        this.arrays = arrays;

        int[] maxEndIndexes = new int[]{0, 1};
        if (getEnd(0) < getEnd(1)) {
            maxEndIndexes = new int[]{1, 0};
        }

        int[] minStartIndexes = new int[]{0, 1};
        if (getStart(0) > getStart(1)) {
            minStartIndexes = new int[]{1, 0};
        }

        for (int i = 2; i < arrays.size(); i++) {
            int start = getStart(i);
            int end = getEnd(i);

            if (getEnd(maxEndIndexes[0]) <= end) {
                maxEndIndexes[1] = maxEndIndexes[0];
                maxEndIndexes[0] = i;
            } else if (getEnd(maxEndIndexes[1]) <= end) {
                maxEndIndexes[1] = i;
            }

            if (getStart(minStartIndexes[0]) >= start) {
                minStartIndexes[1] = minStartIndexes[0];
                minStartIndexes[0] = i;
            } else if (getStart(minStartIndexes[1]) >= start) {
                minStartIndexes[1] = i;
            }
        }

        if (maxEndIndexes[0] == minStartIndexes[0]) {
            return Math.max(
                    getEnd(maxEndIndexes[1]) - getStart(minStartIndexes[0]),
                    getEnd(maxEndIndexes[0]) - getStart(minStartIndexes[1]));
        } else {
            return getEnd(maxEndIndexes[0]) - getStart(minStartIndexes[0]);
        }
    }
}