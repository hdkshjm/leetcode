package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0437;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        return calculateSum(root, targetSum, list);
    }

    public int calculateSum(TreeNode node, int targetSum, List<Integer> list) {
        if (node == null) return 0;
        list.add(node.val);

        int count = calculateSum(node.left, targetSum, list);
        count += calculateSum(node.right, targetSum, list);

        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum == targetSum) {
                count++;
            }
        }
        list.remove(list.size() - 1);

        return count;
    }
}
