package leetcode.hdkshjm.challenge.month10.week1.chap3480;

import java.util.ArrayDeque;

class RecentCounter {
    private ArrayDeque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<Integer>();
    }

    public int ping(int t) {
        while (true) {
            if (queue.size() == 0) {
                break;
            }

            int time = queue.getFirst();
            if (t - time > 3000) {
                queue.removeFirst();
            } else {
                break;
            }
        }

        queue.addLast(t);
        return queue.size();
    }
}
