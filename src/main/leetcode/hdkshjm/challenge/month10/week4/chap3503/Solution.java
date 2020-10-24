package leetcode.hdkshjm.challenge.month10.week4.chap3503;

class Solution {
    public int search(ArrayReader reader, int target) {
        return search(reader, target, 0, 1);
    }

    public int search(ArrayReader reader, int target, int left, int right) {
        int leftValue = reader.get(left);
        int rightValue = reader.get(right);

        if (leftValue == target) return left;
        if (rightValue == target) return right;
        if (leftValue == 2147483647) return -1;

        if (target < rightValue) {
            if (right - left == 1) return -1;
            right = (right - left) / 2 + left;
        } else {
            left = right + 1;
            right = left * 2;
        }
        return search(reader, target, left, right);
    }
}
