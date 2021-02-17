package leetcode.hdkshjm.challenge.year2021.month02.week3.chap3643;

class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            area = Math.max(Math.min(height[start], height[end]) * (end - start), area);
            if (height[start] > height[end]) end--;
            else start++;
        }
        return area;
    }
}
