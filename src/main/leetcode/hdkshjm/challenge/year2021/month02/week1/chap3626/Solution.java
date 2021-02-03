package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3626;

class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)  return root;
        if (root != null && root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root != null && root.val > high) {
            return trimBST(root.left, low, high);
        }


        TreeNode left = root.left;
        if (left != null && left.val < low) {
            root.left = left.right;
            return trimBST(root, low, high);
        }

        TreeNode right = root.right;
        if (right != null && right.val > high) {
            root.right = right.left;
            return trimBST(root, low, high);
        }

        trimBST(root.left, low, high);
        trimBST(root.right, low, high);
        return root;
    }
}
