package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0008;

class Solution {
    public int myAtoi(String s) {
        if ("".equals(s)) return 0;

        char[] array = s.toCharArray();
        // skip non digit
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                start = i;
                break;
            }
        }

        // if not leading spaces
        for (int i = 0; i < start - 1; i++) {
            if (!Character.isWhitespace(array[i])) return 0;
        }

        // plus:true, minus:false
        boolean sign = true;
        if (start > 0) {
            if (array[start - 1] == '-') sign = false;
            else if (array[start - 1] != '+' && !Character.isWhitespace(array[start - 1])) return 0;
        }

        // end with non digit
        if (!Character.isDigit(array[start])) return 0;

        // skip leading 0
        long val = 0;
        if (sign) {
            for (int i = start; i < array.length; i++) {
                if (!Character.isDigit(array[i])) {
                    break;
                }
                val = 10 * val + (array[i] - '0');
                if (val > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
        } else {
            for (int i = start; i < array.length; i++) {
                if (!Character.isDigit(array[i])) {
                    break;
                }
                val = 10 * val - (array[i] - '0');
                if (val < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
        }

        return (int) val;
    }
}
