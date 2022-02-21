package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums) map.put(n, map.getOrDefault(n,0)+1);
        int max = 0;
        int majority = 0;
        for(int n: map.keySet()){
            if(map.get(n) >= max) {
                max = map.get(n);
                majority = n;
            }
        }
        return majority;
    }
}
