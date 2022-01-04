package leetcode.hdkshjm.problem.no0000_0999.no0000_0099.no0997;

class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] hasFaithful = new boolean[n + 1];
        int[] numOfFaithful = new int[n + 1];

        for (int[] t : trust) {
            hasFaithful[t[0]] = true;
            numOfFaithful[t[1]]++;
        }

        int count = 0;
        int judge = 0;
        for (int i = 1; i < hasFaithful.length; i++) {
            if (!hasFaithful[i]) {
                judge = i;
                count++;
                if (count > 1) return -1;
            }
        }
        if (judge == 0) return -1;
        if (numOfFaithful[judge] == n - 1) return judge;
        return -1;
    }
}
