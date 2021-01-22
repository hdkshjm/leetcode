package leetcode.hdkshjm.challenge.year2021.month01.week3.chap3611;

class SolutionTLE {
    public int[] mostCompetitive(int[] nums, int k) {
        int[] ret = new int[k];

        int position = 0;
        for (int i = 0; i < ret.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = position; j < nums.length; j++) {
                if (min > nums[j] && nums.length - j >= k -i) {
                    min = nums[j];
                    position = j;
                }
            }
            ret[i] = min;
            position++;
        }

        return ret;
    }
}
