package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0605;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // left side
        int start = -1;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                start = i;
                break;
            }
        }

        // all 0
        if (start == -1) return n - (flowerbed.length + 1) / 2 <= 0;

        n -= start / 2;
        if (n <= 0) return true;

        // right side
        int end = 0;
        for (int i = flowerbed.length - 1; i >= 0; i--) {
            if (flowerbed[i] == 1) {
                end = i;
                break;
            }
        }
        n -= (flowerbed.length - 1 - end) / 2;
        if (n <= 0) return true;

        // middle
        int previous = start;
        for (int i = start + 1; i <= end; i++) {
            if (flowerbed[i] == 1) {
                n -= (i - previous - 2) / 2;
                if (n <= 0) return true;
                previous = i;
            }
        }

        return false;
    }
}
