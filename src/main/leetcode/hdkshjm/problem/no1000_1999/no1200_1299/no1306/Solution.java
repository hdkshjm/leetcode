package leetcode.hdkshjm.problem.no1000_1999.no1200_1299.no1306;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean canReach(int[] arr, int start) {
        return canReach(arr, start, new HashSet<>());
    }

    public boolean canReach(int[] arr, int start, Set<Integer> visited) {
        if (start >= 0 && start < arr.length && !visited.contains(start)) {
            if(arr[start] == 0) return true;

            visited.add(start);
            if (canReach(arr, start - arr[start], visited) || canReach(arr, start + arr[start], visited))
                return true;
            visited.remove(start);
        }
        return false;
    }
}
