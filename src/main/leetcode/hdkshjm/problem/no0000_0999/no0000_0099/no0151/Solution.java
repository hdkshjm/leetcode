package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0151;

class Solution {
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char previous = ' ';
        int end = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != ' ') {
                if (previous == ' ') end = i;
            } else {
                if (previous != ' ') {
                    sb.append(array, i + 1, end - i);
                    sb.append(' ');
                }
            }
            previous = array[i];
        }

        if (previous != ' ') {
            sb.append(array, 0, end + 1);
            sb.append(' ');
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
