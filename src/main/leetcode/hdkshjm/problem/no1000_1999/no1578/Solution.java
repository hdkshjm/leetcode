package leetcode.hdkshjm.problem.no1000_1999.no1578;

class Solution {
    public int minCost(String colors, int[] neededTime) {
        if (colors.length() == 0) return 0;
        char previous = '0';
        int max = 0;
        int total = 0;
        int colourfulTotal = 0;

        for (int i = 0; i < neededTime.length; i++) {
            total += neededTime[i];
            char color = colors.charAt(i);
            if (previous == colors.charAt(i)) {
                max = Math.max(max, neededTime[i]);
            } else {
                colourfulTotal += max;
                max =  neededTime[i];
            }
            previous = color;
        }
        colourfulTotal += max;

        return total - colourfulTotal;
    }
}

