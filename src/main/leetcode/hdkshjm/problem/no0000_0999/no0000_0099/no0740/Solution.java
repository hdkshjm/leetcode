package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0740;

import java.util.*;

class Solution {
    public int deleteAndEarn(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + n);
        List<Integer> list = new ArrayList<>();
        list.addAll(map.keySet());
        Collections.sort(list);

        int[] dp = new int[list.size() + 1];
        dp[0] = 0;
        dp[1] = map.get(list.get(0));
        for (int i = 2; i < dp.length; i++) {
            int previous = list.get(i - 2);
            int current = list.get(i - 1);
            if (current - previous == 1) dp[i] = Math.max(dp[i - 1], dp[i - 2] + map.get(current));
            else dp[i] = dp[i - 1] + map.get(current);
        }
        return dp[dp.length - 1];
    }
}
