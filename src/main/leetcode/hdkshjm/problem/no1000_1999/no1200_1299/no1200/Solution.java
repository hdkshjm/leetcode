package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1200;

import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[arr.length - 1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < arr.length -1; i++) {
            if( arr[i + 1] - arr[i] == diff ){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ret.add(list);
            }
        }
        return ret;
    }
}
