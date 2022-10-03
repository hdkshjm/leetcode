package leetcode.hdkshjm.problem.no1000_1999.no1305;

import leetcode.hdkshjm.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Deque<Integer> q1 = new ArrayDeque<Integer>();
        getTreeNodeVal(root1, q1);
        Deque<Integer> q2 = new ArrayDeque<Integer>();
        getTreeNodeVal(root2, q2);

        List<Integer> ret = new ArrayList<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peekFirst() < q2.peekFirst()) ret.add(q1.pollFirst());
            else ret.add(q2.pollFirst());
        }
        ret.addAll(q1);
        ret.addAll(q2);
        return ret;
    }

    private void getTreeNodeVal(TreeNode root, Deque<Integer> q) {
        if (root == null) return;
        getTreeNodeVal(root.left, q);
        q.addLast(root.val);
        getTreeNodeVal(root.right, q);
    }
}

