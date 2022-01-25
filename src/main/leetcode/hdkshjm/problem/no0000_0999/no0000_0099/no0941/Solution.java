package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0941;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if (arr[0] >= arr[1]) return false; //最初は必ず上昇を期待

        int top = -1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) return false;
            if (arr[i - 1] > arr[i]) {
                top = i - 1;
                break;
            }
        }
        if (top == -1) return false; //上昇だけで終わった場合

        for (int i = top + 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) return false;
        }

        return true;
    }
}
