package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0875;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        while (low < high) {
            int mid =  low + (high - low) / 2;// (low + high) / 2 でintを超えちゃうのを忘れるな
            int time = 0;
            for (int p : piles) {
                time += p / mid;
                if(p % mid > 0) time++;
            }
            if (time > h) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
