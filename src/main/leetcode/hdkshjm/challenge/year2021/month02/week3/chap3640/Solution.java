package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3640;

import java.util.*;

class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < pid.size(); i++) {
            List<Integer> list = map.getOrDefault(ppid.get(i), new ArrayList<Integer>());
            list.add(pid.get(i));
            map.put(ppid.get(i), list);
        }

        List<Integer> ret = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(kill);
        ret.add(kill);
        while (!q.isEmpty()) {
            List<Integer> list = map.get(q.poll());
            if (list == null) continue;
            ret.addAll(list);
            q.addAll(list);
        }
        return ret;
    }
}
