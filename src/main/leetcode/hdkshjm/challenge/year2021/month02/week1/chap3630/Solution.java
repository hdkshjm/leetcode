package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3630;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        find(root, list, 1);
        return list;
    }

    public void find(TreeNode node, List<Integer> list, int depth) {
        if (node == null) return;
        if (list.size() < depth) list.add(node.val);
        find(node.right, list, depth + 1);
        find(node.left, list, depth + 1);
    }
}
