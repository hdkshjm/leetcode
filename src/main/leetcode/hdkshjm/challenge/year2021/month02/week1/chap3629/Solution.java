package leetcode.hdkshjm.challenge.year2021.month02.week1.chap3629;

import java.util.ArrayDeque;

class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");

        ArrayDeque<String> q = new ArrayDeque<>();
        for (String dir : dirs) {
            if (dir.equals("") || dir.equals(".")) continue;
            if (dir.equals("..")) {
                q.pollLast();
                continue;
            }
            q.add(dir);
        }

        if (q.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append("/");
            sb.append(q.poll());
        }
        return sb.toString();
    }
}
