package leetcode.hdkshjm.challenge.year2020.month09.week2.week2_3457;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    private HashMap<int[], List<List<Integer>>> combinations;
    
    public Solution() {
        combinations = new HashMap<int[], List<List<Integer>>>();
    }

    // 総当たり
    public List<List<Integer>> combinationSum3(int k, int n) {
        if (combinations.containsKey(new int[] { k, n })) {
            return combinations.get(new int[] { k - 1, n - 1 });
        }

        if (k < 0 || n < 0) {
            return new ArrayList<>();
        }

        if (k == 1) {
            if (n > 9) {
                return new ArrayList<>();
            } else {
                return new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(n))));
            }
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i < 10; i++) {
            if (k - 1 < 1 || n - i < 0) {
                break;
            }
            
            if (combinations.containsKey(new int[] { k - 1, n - 1 })) {
                continue;
            } else {
                List<List<Integer>> chiildList = combinationSum3(k - 1, n - i);
                for (List<Integer> list : chiildList) {
                    if (list.get(0) > i) {
                        list.add(0, i);
                        result.add(list);
                    }
                }
            }
            
        }
        combinations.put(new int[] { k - 1, n - 1 }, result);
        return result;
    }

}
