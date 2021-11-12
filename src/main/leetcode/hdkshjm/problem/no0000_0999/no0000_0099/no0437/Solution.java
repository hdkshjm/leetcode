package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0437;

import leetcode.hdkshjm.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return calculateSum(root, 0, targetSum, map);
    }

    public int calculateSum(TreeNode node, int currentSum, int targetSum, Map<Integer, Integer> map) {
        if (node == null) return 0;
        currentSum = currentSum + node.val;

        // 問題の最初のデータで 10, 5, 3, 3 ときた場合
        // currentSumは 10, 15, 18, 21 となり
        // targetSumが8の場合は、val[3]=3の場合は、currentSum[3]は18となるので
        // (targetSum-current[3])で、値が10となる、currentSum[0]の個数をカウントする
        int count = map.getOrDefault(currentSum - targetSum, 0);

        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        count += calculateSum(node.left, currentSum, targetSum, map);
        count += calculateSum(node.right, currentSum, targetSum, map);
        if (map.get(currentSum) == 1) {
            map.remove(currentSum);
        } else {
            map.put(currentSum, map.get(currentSum) - 1);
        }
        return count;
    }

}
