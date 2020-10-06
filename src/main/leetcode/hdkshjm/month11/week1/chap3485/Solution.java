package leetcode.hdkshjm.month11.week1.chap3485;

class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode current = root;
        while (true) {
            if (current.left == null && current.val > val) {
                TreeNode leftNode = new TreeNode(val);
                current.left = leftNode;
                break;
            }
            if (current.right == null && current.val < val) {
                TreeNode rightNode = new TreeNode(val);
                current.right = rightNode;
                break;
            }

            if (val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return root;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}