package leetcode.hdkshjm.challenge.month11.week1.chap3524;

class Solution {
    public int findTilt(TreeNode root) {
        return calculate(root)[1];
    }

    // 0: sum of val, 1:sum of tilt
    private int[] calculate(TreeNode root) {
        if (root == null) return new int[]{0, 0};

        int[] left = new int[]{0, 0};
        if (root.left != null) left = calculate(root.left);

        int[] right = new int[]{0, 0};
        if (root.right != null) right = calculate(root.right);

        int sumOVal = root.val + left[0] + right[0];
        int sumOfTilt = Math.abs(left[0] - right[0]) + left[1] + right[1];
        return new int[]{sumOVal, sumOfTilt};
    }
}
