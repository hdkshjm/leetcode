package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3599;


import java.util.*;
import java.lang.Integer;

// WA...
class Solution {
    public int createSortedArray(int[] instructions) {
        int[] counts = new int[100001];
        Set<Integer> set = new TreeSet<>();

        int total = 0;
        for (int i = 0; i < instructions.length; i++) {
            int num = instructions[i];
            int leftCost = 0;
            for(int n: set){
                if( n < num ) leftCost = leftCost + counts[n];
                if( n >= num ) break;
            }
            int rightCost = i - counts[num] - leftCost;
            int cost = Math.min(leftCost, rightCost);
            total = total + cost;

            counts[num]++;
            set.add(num);
        }

        return total;
    }
}
