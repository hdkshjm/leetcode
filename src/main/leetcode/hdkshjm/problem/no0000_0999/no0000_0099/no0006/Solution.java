package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0006;

class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            int index = i;
            while (index < s.length()) {
                ret.append(chars[index]);
                if (i != 0 && i != numRows - 1) {
                    int slanting = index + (numRows - i - 1) * 2;
                    if (slanting < s.length()) {
                        ret.append(chars[slanting]);
                    }
                }
                index += (numRows - 1) * 2;
            }
        }
        return ret.toString();
    }
}
