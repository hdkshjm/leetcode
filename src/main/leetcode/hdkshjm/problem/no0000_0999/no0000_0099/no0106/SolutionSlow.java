package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0106;

import leetcode.hdkshjm.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

//42ms
class SolutionSlow {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inorderList = new ArrayList<>();
        for (int n : inorder) inorderList.add(n);

        List<Integer> postorderList = new ArrayList<>();
        for (int n : postorder) postorderList.add(n);

        return buildTree(0, inorderList.size(), inorderList, postorderList);
    }

    public TreeNode buildTree(int start, int end, List<Integer> inorderList, List<Integer> postorderList) {
        if (postorderList.size() == 0 || inorderList.size() == 0) return null;
        int lastVal = postorderList.get(postorderList.size() - 1);
        int index = inorderList.indexOf(lastVal);
        if (index < start || index >= end) return null;

        postorderList.remove(postorderList.size() - 1);
        TreeNode node = new TreeNode(lastVal);

        //これを早くしたいけど
        node.right = buildTree(index + 1, end, inorderList, postorderList);
        node.left = buildTree(start, index, inorderList, postorderList);

        return node;
    }

}
