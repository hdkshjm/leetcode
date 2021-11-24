package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0986;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0 ) return new int[0][0];

        int START = 0;
        int END = 1;
        int i = 0;
        int j = 0;
        List<int[]> ret = new ArrayList<>();
        while (i < firstList.length && j < secondList.length) {
            if (secondList[j][END] < firstList[i][START]) {
                j++;
                continue;
            }
            if (firstList[i][END] < secondList[j][START]) {
                i++;
                continue;
            }
            ret.add(new int[]{Math.max(firstList[i][START], secondList[j][START]), Math.min(firstList[i][END], secondList[j][END])});
            if (firstList[i][END] < secondList[j][END]) i++;
            else j++;
        }
        return ret.toArray(new int[ret.size()][]);
    }
}
