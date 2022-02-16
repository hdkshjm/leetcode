package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0104;

import leetcode.hdkshjm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
