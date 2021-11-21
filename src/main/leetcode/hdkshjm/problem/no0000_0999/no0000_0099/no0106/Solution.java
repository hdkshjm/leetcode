package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0106;

import leetcode.hdkshjm.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) inorderMap.put(inorder[i], i);
        this.postorderIndex = postorder.length - 1;
        return buildTree(0, inorder.length, inorder, inorderMap, postorder);
    }

    public TreeNode buildTree(int inorderStart, int inorderEnd, int[] inorder, Map<Integer, Integer> inorderMap, int[] postorder) {
        if (this.postorderIndex < 0) return null;
        int lastVal = postorder[this.postorderIndex];
        int inorderIndex = inorderMap.get(lastVal);
        if (inorderIndex < inorderStart || inorderIndex >= inorderEnd) return null;
        this.postorderIndex--;

        TreeNode node = new TreeNode(lastVal);
        node.right = buildTree(inorderIndex + 1, inorderEnd, inorder, inorderMap, postorder);
        node.left = buildTree(inorderStart, inorderIndex, inorder, inorderMap, postorder);
        return node;
    }
}
