package leetcode.hdkshjm.common;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(Integer[] values) {
        if (values.length == 0)
            return null;

        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = new TreeNode(values[0]);
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();

            if (values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.addLast(node.left);
            }
            i++;
            if (i >= values.length)
                break;

            if (values[i] != null) {
                node.right = new TreeNode(values[i]);
                queue.addLast(node.right);
            }
            i++;
        }
        return root;
    }

    public static void assertTreeNodeEquals(TreeNode expected, TreeNode root) {
        if (root == null && expected != null) Assertions.assertNotNull(root);
        if (root != null && expected == null) Assertions.assertNull(root);
        if (root == null && expected == null) return;

        Assertions.assertEquals(expected.val, root.val);
        assertTreeNodeEquals(root.left, expected.left);
        assertTreeNodeEquals(root.right, expected.right);
    }
}
