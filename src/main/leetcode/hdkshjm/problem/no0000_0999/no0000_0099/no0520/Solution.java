package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0520;

class Solution {
    public boolean detectCapitalUse(String word) {
        char[] array = word.toCharArray();
        if (Character.isLowerCase(array[0])) {
            for (char c : array) if (!Character.isLowerCase(c)) return false;
            return true;
        }

        int countOfLower = 0;
        int countOfUpper = 0;
        for (char c : array) {
            if (Character.isLowerCase(c)) countOfLower++;
            else countOfUpper++;
            if (countOfUpper > 1 && countOfLower > 0) return false;
        }
        return true;
    }
}

