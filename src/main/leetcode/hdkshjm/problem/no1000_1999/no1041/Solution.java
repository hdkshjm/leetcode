package leetcode.hdkshjm.problem.no1000_1999.no1041;

class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] directions = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

        int i = 3;
        int[] position = new int[]{0, 0};
        for (char c : instructions.toCharArray()) {
            switch (c) {
                case 'G':
                    position[0] += directions[i][0];
                    position[1] += directions[i][1];
                    break;
                case 'R':
                    i = (i + 1) % 4;
                    break;
                case 'L':
                    i = (i + 3) % 4;
                    break;
            }
        }
        if (i == 3) return position[0] == 0 && position[1] == 0;
        return true;
    }
}
