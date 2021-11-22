package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0450;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val == key) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode nextBigger = root.right;
            while (nextBigger.left != null) nextBigger = nextBigger.left;
            root.val = nextBigger.val;
            root.right = deleteNode(root.right, nextBigger.val);
        }
        if (key < root.val) root.left = deleteNode(root.left, key);
        else root.right = deleteNode(root.right, key);

        return root;
    }
}
