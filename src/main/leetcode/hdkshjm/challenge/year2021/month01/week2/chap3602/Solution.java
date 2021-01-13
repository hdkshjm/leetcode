package leetcode.hdkshjm.challenge.year2021.month01.week2.chap3602;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] dist = new int[30001];
        for (int p : people) {
            dist[p]++;
        }

        int total = 0;
        for (int i = people.length - 1; i >= 0; i--) {
            int p = people[i];
            if (dist[p] == 0) continue;

            dist[p]--;
            for (int j = 0; j < limit - p; j++) {
                if (dist[limit - p - j] > 0) {
                    dist[limit - p - j]--;
                    break;
                }
            }
            total++;
        }
        return total;
    }
}
