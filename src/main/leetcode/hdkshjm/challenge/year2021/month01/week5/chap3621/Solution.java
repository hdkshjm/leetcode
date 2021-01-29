package leetcode.hdkshjm.challenge.year2021.month01.week5.chap3621;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, List<Integer[]>> map = new TreeMap<>();
        find(root, 0, 0, map);

        List<List<Integer>> ret = new ArrayList<>();
        for (int key : map.keySet()) {
            // Integer[] { y, TreeNode.val }
            List<Integer[]> list = map.get(key);
            Collections.sort(list, (left, right) -> {
                if (left[0] == right[0]) return left[1] - right[1];
                return right[0] - left[0];
            });

            List<Integer> report = new ArrayList<>();
            for (Integer[] item : list) report.add(item[1]);
            ret.add(report);
        }

        return ret;
    }


    public void find(TreeNode node, int x, int y, TreeMap<Integer, List<Integer[]>> map) {
        if (node == null) return;

        if (!map.containsKey(x)) map.put(x, new ArrayList<Integer[]>());
        map.get(x).add(new Integer[]{y, node.val});

        find(node.left, x - 1, y - 1, map);
        find(node.right, x + 1, y - 1, map);
    }
}
