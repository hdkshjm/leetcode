package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0606;

import leetcode.hdkshjm.common.TreeNode;

class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) return "";

        return tree(root).toString();
    }

    private StringBuilder tree(TreeNode root) {
        StringBuilder ret = new StringBuilder();
        ret.append(root.val);

        if (root.left == null) {
            if (root.right == null) return ret;
            ret.append("()(");
            ret.append(tree(root.right));
            ret.append(")");
            return ret;
        }

        ret.append("(");
        ret.append(tree(root.left));
        ret.append(")");
        if (root.right != null) {
            ret.append("(");
            ret.append(tree(root.right));
            ret.append(")");
        }
        return ret;
    }
}
