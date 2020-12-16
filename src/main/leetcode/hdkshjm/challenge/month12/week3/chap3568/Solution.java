package leetcode.hdkshjm.challenge.month12.week3.chap3568;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }

    public boolean validateBST(TreeNode root, TreeNode lowerNode, TreeNode upperNode) {
        if (root == null) return true;
        if ((lowerNode != null && root.val <= lowerNode.val) || (upperNode != null && upperNode.val <= root.val))
            return false;
        return validateBST(root.left, lowerNode, root) && validateBST(root.right, root, upperNode);
    }
}
