package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3640;

import java.util.*;

//Runtime: 1155 ms
//Memory Usage: 48.6 MB
class SolutionSlow {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> ret = new ArrayList<>();
        ret.add(kill);
        Queue<Integer> q = new ArrayDeque<>();
        q.add(kill);
        while (!q.isEmpty()) {
            int target = q.poll();
            int ppidIndex = 0;
            while (ppidIndex > -1) {
                ppidIndex = ppid.indexOf(target);
                if (ppidIndex == -1) break;
                ret.add(pid.get(ppidIndex));
                q.add(pid.get(ppidIndex));
                pid.remove(ppidIndex);
                ppid.remove(ppidIndex);
            }
        }
        return ret;
    }
}
