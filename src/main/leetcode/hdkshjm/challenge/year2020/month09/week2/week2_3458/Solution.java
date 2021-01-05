package leetcode.hdkshjm.challenge.year2020.month09.week2.week2_3458;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int START = 0;
    int END = 1;

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            List ret = new ArrayList<int[]>();
            ret.add(newInterval);
            return convert(ret);
        }
        if (newInterval[END] < intervals[0][START]) {
            List ret = new ArrayList<int[]>();
            ret.add(newInterval);
            for (int[] interval : intervals) {
                ret.add(interval);
            }
            return convert(ret);
        }
        if (newInterval[START] > intervals[intervals.length - 1][END]) {
            List ret = new ArrayList<int[]>();
            for (int[] interval : intervals) {
                ret.add(interval);
            }
            ret.add(newInterval);
            return convert(ret);
        }


        List<Integer> overlappedIndexList = new ArrayList<Integer>();
        for (int i = 0; i < intervals.length; i++) {
            if ((newInterval[START] <= intervals[i][START] && newInterval[END] >= intervals[i][START])
                    || (newInterval[START] <= intervals[i][END] && newInterval[END] >= intervals[i][END])
                    || (intervals[i][START] <= newInterval[START] && intervals[i][END] >= newInterval[START])
                    || (intervals[i][START] <= newInterval[END] && intervals[i][END] >= newInterval[END])) {
                overlappedIndexList.add(i);
            }
        }
        int[] mergedInterval = newInterval;
        boolean isOverlapped = overlappedIndexList.size() > 0;
        if (isOverlapped) {
            mergedInterval[START] = Math.min(
                    intervals[overlappedIndexList.get(0)][START], 
                    newInterval[START]);
            mergedInterval[END] = Math.max(
                    intervals[overlappedIndexList.get(overlappedIndexList.size() - 1)][END],
                    newInterval[END]);
        }

        List<int[]> ret = new ArrayList<int[]>();
        boolean isAddedMergedInterval = false;
        for (int i = 0; i < intervals.length; i++) {
            if (isOverlapped) {
                if (overlappedIndexList.get(0) == i) {
                    ret.add(mergedInterval);
                    continue;
                }
            } else {
                if (!isAddedMergedInterval && mergedInterval[END] < intervals[i][START]) {
                    ret.add(mergedInterval);
                    isAddedMergedInterval = true;
                }
            }
            if (!overlappedIndexList.contains(i)) {
                ret.add(intervals[i]);
            }
        }

        return convert(ret);
    }

    int[][] convert(List<int[]> list) {
        int[][] ret = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

}

