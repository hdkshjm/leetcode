package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0071;

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> segments = new Stack<>();
        for (String segment : path.split("/")) {
            if (segment.equals("") || segment.equals(".")) continue;
            if (segment.equals("..")) {
                if (!segments.isEmpty()) segments.pop();
                continue;
            }
            segments.add(segment);
        }

        if (segments.isEmpty()) return "/";

        StringBuilder canonicalPath = new StringBuilder();
        for (String segment : segments) {
            canonicalPath.append("/");
            canonicalPath.append(segment);
        }
        return canonicalPath.toString();
    }
}
