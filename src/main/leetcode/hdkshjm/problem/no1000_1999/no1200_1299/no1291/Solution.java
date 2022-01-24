package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1291;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int numOfLow = (int) Math.log10(low) + 1;
        int numOfhigh = (int) Math.log10(high) + 1;

        List<Integer> list = new ArrayList<>();
        for (int num = numOfLow; num <= numOfhigh; num++) {
            for (int i = 0; i < 10 - num; i++) {
                int digit = i + 1;
                for (int j = 1; j < num; j++) digit = 10 * digit + i + 1 + j;
                if (digit < low) continue;
                if (digit > high) break;
                list.add(digit);
            }
        }
        return list;
    }
}
