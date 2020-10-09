package leetcode.hdkshjm.month11.week2.chap3489;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuffer ret = new StringBuffer("");
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);

        int countOfNulls = 0;
        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            if (node == null) {
                countOfNulls++;
                continue;
            }

            while (countOfNulls > 0) {
                ret = ret.append(",");
                countOfNulls--;
            }
            ret = ret.append(node.val).append(",");
            list.add(node.left);
            list.add(node.right);
        }
        return ret.substring(0, ret.length() - 1);
    }

    public Integer convert(String val) {
        Integer i = null;
        if (!val.equals("")) {
            i = Integer.parseInt(val);
        }
        return i;
    }

    public TreeNode deserialize(String data) {
        if (data == null)
            return null;

        String[] values = data.split(",");
        if (values.length == 0 || values[0].equals(""))
            return null;

        Queue<TreeNode> queue = new ArrayDeque();

        TreeNode root = new TreeNode(convert(values[0]));
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode node = queue.poll();
            Integer leftVal = convert(values[i]);
            if (leftVal != null) {
                node.left = new TreeNode(leftVal);
                queue.add(node.left);
            }
            i++;
            if (i >= values.length)
                break;

            Integer rightVal = convert(values[i]);
            if (rightVal != null) {
                node.right = new TreeNode(rightVal);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}