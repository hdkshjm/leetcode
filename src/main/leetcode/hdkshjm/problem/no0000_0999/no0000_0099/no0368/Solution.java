package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0368;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        Node pre = new Node(0);
        for (int n : nums) pre.children.add(new Node(n));
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0) pre.children.get(j).children.add(pre.children.get(i));
            }
        }
        setDepth(pre);

        List<Integer> ret = new ArrayList<>();
        Node node = pre;
        while (node.children.size() != 0) {
            Node next = node.children.get(0);
            for (int i = 1; i < node.children.size(); i++) {
                if (next.subsetDepth < node.children.get(i).subsetDepth) next = node.children.get(i);
            }
            ret.add(0, next.val);
            node = next;
        }
        return ret;
    }

    public void setDepth(Node node) {
        if (node.subsetDepth != 0) return;

        int maxDepth = 0;
        for (Node child : node.children) {
            setDepth(child);
            maxDepth = Math.max(maxDepth, child.subsetDepth);
        }
        node.subsetDepth = ++maxDepth;
    }
}


class Node {
    public int val;
    public int subsetDepth;
    public List<Node> children = null;

    public Node(int val) {
        this.subsetDepth = 0;
        this.val = val;
        this.children = new ArrayList<>();
    }
}
