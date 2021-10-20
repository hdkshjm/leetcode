package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0151;

class Solution {
    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int end = array.length - 1;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != ' ') {
                if (array[i + 1] == ' ') end = i;
                continue;
            }

            if (array[i + 1] != ' ') {
                sb.append(array, i + 1, end - i);
                sb.append(' ');
            }
        }
        if (array[0] != ' ') {
            sb.append(array, 0, end + 1);
            sb.append(' ');
        }

        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
