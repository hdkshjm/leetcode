package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0094;

import leetcode.hdkshjm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        inorderTraversal(list, root);
        return list;
    }

    private void inorderTraversal(List<Integer> list, TreeNode root) {
        TreeNode left = root.left;
        if (left != null) inorderTraversal(list, left);
        list.add(root.val);

        TreeNode right = root.right;
        if (right != null) inorderTraversal(list, right);
    }
}
