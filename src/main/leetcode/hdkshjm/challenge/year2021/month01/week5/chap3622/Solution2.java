package leetcode.hdkshjm.challenge.year2021.month01.week5.chap3622;

import com.sun.source.tree.ImportTree;
import com.sun.source.tree.Tree;

import java.util.*;

class Solution {
    public int minimumDeviation(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) set.add(n);

        int previousFirst = set.first() - 1;
        int previousLast = set.last() + 1;
        int deviation = Math.abs(previousLast - previousFirst);
        while (true) {
            int first = set.first();
            int last = set.last();
            int diff0 = Math.abs(last - first);

            int diff1 = Integer.MAX_VALUE;
            if (first % 2 == 1) {
                diff1 = Math.abs(last - first * 2);
            }
            int diff2 = Integer.MAX_VALUE;
            if (last % 2 == 0) {
                diff2 = Math.abs(last / 2 - first);
            }

            if (set.isEmpty()) {
                deviation = 0;
                break;
            }

            if (diff0 < diff1 && diff0 < diff2 && diff0 < deviation && diff0 < deviation) {
                deviation = diff0;
//                System.out.println("A=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2);
                break;
            }

            if (diff1 < diff0 && diff1 < diff2 && diff1 < deviation) {
                set.add(set.pollFirst() * 2);
                if (set.first() == previousFirst && set.last() == previousLast) {
                    System.out.println("B0=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2 + ", previousFirst=" + previousFirst + ", previousLast=" + previousLast);
                    break;
                }

                previousFirst = first;
                previousLast = last;
                System.out.println("B=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2 + ", previousFirst=" + previousFirst + ", previousLast=" + previousLast);
                continue;
            }

            if (diff2 < diff0 && diff2 < diff1 && diff2 < deviation) {
                if (set.first() == previousFirst && set.last() == previousLast) {
                    System.out.println("C0=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2 + ", previousFirst=" + previousFirst + ", previousLast=" + previousLast);
                    break;
                }

                previousFirst = first;
                previousLast = last;
                set.add(set.pollLast() / 2);
                System.out.println("C=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2 + ", previousFirst=" + previousFirst + ", previousLast=" + previousLast);
                continue;
            }

            if (diff1 == diff2 && diff1 != Integer.MAX_VALUE) {
                set.add(set.pollFirst() * 2);
            }

            if (diff0 < deviation) {
                deviation = diff0;
            }

            System.out.println("D=" + set + ", deviation=" + deviation + ", diff0=" + diff0 + ", diff1=" + diff1 + ", diff2=" + diff2 + ", previousFirst=" + previousFirst + ", previousLast=" + previousLast);
            continue;
        }
        System.out.println(set);

        int first = set.first();
        int last = set.last();
        int diff = Math.abs(last - first);

        return Math.min(deviation, diff);

    }
}
